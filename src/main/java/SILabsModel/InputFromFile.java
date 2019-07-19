package SILabsModel;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class InputFromFile {
    
    public boolean CompareResult(Info info, int num) throws FileNotFoundException, IOException{
        
        String Output = "", Line1 = "", Line2 = "";
        boolean bool = false;
        
        File folder = new File(info.getLocation());
        
        String[] str1 = folder.list();
        
        for(String str: str1){
            if(str.equals("result.txt")){
                bool = true;
                break;
            }
        }
        
        if(!bool)
            return bool;
        
        BufferedReader OutputFileReader = new BufferedReader(new FileReader(info.getLocation() + "result.txt"));
        BufferedReader ExpectedOutputFileReader = new BufferedReader(new FileReader(info.getHeaderFilePath() + "result" + num + ".txt"));
        
        while(((Line1 = OutputFileReader.readLine()) != null) && ((Line2 = ExpectedOutputFileReader.readLine()) != null)){
            //System.out.println(Line1 + " " + Line2);
                if(!Line1.equals(Line2))
                    return false;
        }
        //System.out.println(info.getHeaderFilePath() + "result" + num + ".txt");
        
        return true;
    }

    void run(Info info, int num) throws IOException, InterruptedException {
        
        String string = info.getLocation() + info.getFileName() + ".exe", temp = "", line = "";
        Runtime r = Runtime.getRuntime();
        
        String[] files = info.getHeaderFileName().split(" ");
        
        for(String str: files){
            if(str.contains(".txt")){
                temp = info.getHeaderFilePath() + str.substring(0, str.lastIndexOf(".")) + num + "\\" + str;
                File sourceFile = new File(temp);
                File destFile = new File(info.getLocation() + str);
              
                if(destFile.exists()){
                    destFile.delete();
                }

                destFile.createNewFile();

                BufferedReader br = new BufferedReader(new FileReader(sourceFile));
                PrintWriter pr = new PrintWriter(new FileWriter(destFile));
                BufferedWriter bw = new BufferedWriter(new FileWriter(destFile));

                while((line = br.readLine()) != null){
                    bw.write(line);
                    bw.newLine();
                }

                br.close();
                bw.close();
            }
        }
        
        Process p = r.exec(string, null,new File(info.getLocation()));
        p.waitFor();
    }
}
