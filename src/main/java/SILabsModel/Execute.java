package SILabsModel;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class Execute {
    
    public void Compile(Info info) throws IOException, InterruptedException{
            
        String str = null, fileName = "";
        
        
        if(info.getHeaderFileFlag()){
            String[] headerFiles = info.getHeaderFileName().split(" ");
            for(String str1: headerFiles){
                if(str1.contains(".cpp"))
                    fileName = fileName + str1 + " ";
            }
        }
        
        fileName = fileName + info.getFileName();
        
        if(info.getLanguage().compareTo("C") == 0){
            str = "cmd /c gcc -o " + info.getFileName() + ".exe " + info.getFileName() + ".c";
        }
        else{
            str = "cmd /c g++ -o " + info.getFileName() + ".exe " + fileName + ".cpp";
        }
        //System.out.println(str);
        
        Runtime r = Runtime.getRuntime();
     
        Process p = null;
   
        info.setError("");

        //System.out.println(str + " " + info.getLocation());
        try{
    
            p = r.exec(str, null, new File(info.getLocation()));
            if(p.waitFor() == 0){
                info.setError("Compiled");
            }
            else{
                String errorString = "";
                InputStream error = p.getErrorStream();
                int i;
                
                while((i = error.read()) != -1){
                    errorString = errorString + (char) i;
                }
                PrintWriter pw = new PrintWriter(info.getLocation() + "Error.txt", "UTF-8");
                
                pw.print(errorString);
                
                pw.close();
                info.setError("Compilation Error");
            }
        }
        catch(IllegalArgumentException | SecurityException | NullPointerException | IOException e){
            info.setError("Compilation Error");
        }
        
    }    
 
    public int ExecuteProgram(Info info, String ExpectedOutput, String TestInput) throws FileNotFoundException, UnsupportedEncodingException, IOException, InterruptedException{

        String string;
        string = info.getLocation() + info.getFileName() +".exe";
        ProcessBuilder pb = new ProcessBuilder(string);
        Process p = pb.start();
        OutputStream os = p.getOutputStream();
        PrintStream ps = new PrintStream(os);

        Scanner scan = new Scanner(TestInput);

        while(scan.hasNext()){
            ps.println(scan.next());
            ps.flush();
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));

        Scanner ScannerOfFinalResult = new Scanner(br);

        p.waitFor();

        String temp1, temp2;

        Scanner Output = new Scanner(ExpectedOutput);
        while(ScannerOfFinalResult.hasNext()){
            temp1 = ScannerOfFinalResult.next();
            temp2 = Output.next();
//                    System.out.println(temp2 + " " + temp1 + " ");
            if(!(temp2.matches(temp1))){
//                  System.out.println("Shiraz");
                return 0;
            }
        }
    return 1;
    }
}
