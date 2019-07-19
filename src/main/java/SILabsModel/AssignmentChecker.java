
package SILabsModel;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class AssignmentChecker{
    
    private final ArrayList path = new ArrayList();
    private final ArrayList studentNames = new ArrayList();
    
    public void checkAssignment(Info info) throws IOException, FileNotFoundException, InterruptedException{
        info.setResult("");
        
        float ans = 0;
        String result = null, fileName = "";
        
        fileName = fileName + info.getFileName();
        
        
        if("C".equals(info.getLanguage()))
            fileName = fileName + ".c";
        else
            fileName = fileName + ".cpp";
        
        File file = new File(info.getLocation());
        
        String[] Students = file.list();
        String temp = info.getLocation(), temp1, temp3;

        for(String name : Students){
            if(new File(temp + "\\" + name).isDirectory()){
                
                info.setLocation(temp + "\\" + name + "\\");
            
                File file2 = new File(info.getLocation());

                String[] ListOfSubDirectories = file2.list();

                temp1 = info.getLocation();
                
                for(String SubDir : ListOfSubDirectories){
                
                    if(new File(info.getLocation() + "\\" + SubDir).isDirectory()){
                        info.setLocation(temp1 + "\\" + SubDir + "\\");

                        File file3 = new File(info.getLocation());

                        String[] Files = file3.list();

                        temp3 = info.getLocation();
                        info.setLocation(temp3);
                        
                        for(String PName : Files){
                            if(new File(info.getLocation() + PName).isDirectory()){
                                break;
                            }
                            if(PName.equals(fileName)){
                                path.add(info.getLocation());
                                studentNames.add(SubDir);
                            }
                        }
                    }
                }
                info.setLocation(temp);
            }
        }

        String outputFile = info.getLocation()+ info.getFileName()+ ".txt";
        info.setResultFile(outputFile);
        
        try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(outputFile,false)))) {
            out.println("Roll # \t\t\t\tMarks Obtained");
            out.println();
        }
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newCachedThreadPool();
        executor.setCorePoolSize(path.size());
        //System.out.println(path.size());
        //1ST thread
        temp = info.getLocation();
        for(int i = 0; i < path.size(); ++i){
            
            info.setLocation(path.get(i).toString());

            try{
                CompileThread thread = new CompileThread(info, outputFile, studentNames.get(i).toString());
                executor.execute(thread);
            }
            catch(Exception e){
                System.out.println(e);
            }
            
            info.setLocation(temp);
        }
        
        while(executor.getActiveCount() > 0){
            
            Thread.sleep(4000);
            
        }
        executor.shutdown();
        //System.out.println(executor.getCompletedTaskCount());
        
        info.setResult("Completed");
    }
}
