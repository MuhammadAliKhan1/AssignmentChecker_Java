package SILabsModel;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

class CompileThread implements Runnable{  
       
    private final String studentName;
    private Info info = null;
    Execute execute = new Execute();
    Convertor convert = new Convertor();
    InputFromFile InFile = new InputFromFile();
    private final String str;
    
    public CompileThread(Info info, String str, String studentName){
        this.info = new Info();
        this.studentName = studentName;
        
        this.info.setZipFilePath(info.getZipFilePath());
        this.info.setZipFileName(info.getZipFileName());
        this.info.setType(info.getType());
        this.info.setTestInput(info.getTestInput());
        this.info.setResultFile(info.getResultFile());
        this.info.setResult(info.getResult());
        this.info.setLocation(info.getLocation());
        this.info.setLanguage(info.getLanguage());
        this.info.setHeaderFilePath(info.getHeaderFilePath());
        this.info.setHeaderFileName(info.getHeaderFileName());
        this.info.setHeaderFileFlag(info.getHeaderFileFlag());
        this.info.setFileName(info.getFileName());
        this.info.setExpectedOutput(info.getExpectedOutput());
        this.info.setError(info.getError());
        this.info.setCounter(info.getCounter());
        this.str = str;
    }
    
    private synchronized void writeToFile(String result){
        
        try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(str, true)))) {
            //System.out.println(studentName + " " + result);
            out.println(studentName + "\t\t\t" + result);
            out.close();
        }catch (IOException e) {
            System.out.println(e);
        }
    }
    
    private void CopyHeaderFile(Info info) throws IOException{
        
        //System.out.println(info.getHeaderFileName());
        
        String[] Files = info.getHeaderFileName().split(" ");
        
        for(String name : Files){
            
            if((name.contains(".cpp")) || (name.contains(".h"))){
                
                File sourceFile = new File(info.getHeaderFilePath() + name);
                File destFile = new File(info.getLocation() + name);
                String line;

                if(destFile.exists()){
                    destFile.delete();
    //                System.out.println(info.getLocation() + name);
                }

                destFile.createNewFile();

                BufferedWriter bw;
                try (BufferedReader br = new BufferedReader(new FileReader(sourceFile))) {
                    PrintWriter pr = new PrintWriter(new FileWriter(destFile));
                    bw = new BufferedWriter(new FileWriter(destFile));
                    while((line = br.readLine()) != null){
                        bw.write(line);
                        bw.newLine();
                    }
                }
                bw.close();
                }
        }
    }

    @Override
    public void run() {
        float ans = 0;
        String result;
        
        try{
            if(info.getHeaderFileFlag())
                CopyHeaderFile(info);
            
            convert.validate(info.getLocation() + "\\" + info.getFileName(), info);
            
            execute.Compile(info);
            
            if(info.getError().equals("Compiled")){
                if(info.getType().compareTo("File") == 0){
                    int counter = info.getCounter();
                    
               //System.out.println(counter);
                    while(counter > 0){

                        InFile.run(info, counter);
                        if(InFile.CompareResult(info, counter))
                            ++ans;
                        --counter;
                    }

                    ans = (ans / info.getCounter()) * 100;
                    StringBuilder sb = new StringBuilder();
                    sb.append("");
                    sb.append(ans);
                    result = sb.toString();
                    ans = (float) 0.0;
                }
                else{

                    Scanner scannerOfExpectedOutput = new Scanner(info.getExpectedOutput());
                    Scanner scan = new Scanner(info.getTestInput());
                    int loop = info.getCounter();
                    String scanExpectedOutput, scanTestInput;

                    while(loop > 0){
                        scanExpectedOutput = scannerOfExpectedOutput.nextLine();
                        scanTestInput = scan.nextLine();
                        ans += execute.ExecuteProgram(info, scanExpectedOutput, scanTestInput);
                        --loop;
                    }
                    //System.out.println(str.getCounter() + " " + ans);
                    ans = (ans / info.getCounter()) * 100;
                    StringBuilder sb = new StringBuilder();
                    sb.append("");
                    sb.append(ans);
                    result = sb.toString();
                    ans = (float) 0.0;
                }
            }
            else{
                result = "Compilation error";
            }
            
            //System.out.println(studentName + "" + result);
            writeToFile(result);
            
        }catch(IOException e){
            System.out.println(e);
        } catch (InterruptedException ex) {
            Logger.getLogger(CompileThread.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }

}