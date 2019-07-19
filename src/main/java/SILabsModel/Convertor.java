package SILabsModel;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Convertor {
    
    public void validate(String location, Info info) throws FileNotFoundException, IOException{
                    
        String readFile = location + "." + info.getLanguage().toLowerCase();
        String writeFile = location + "a.txt";
//        System.out.println(writeFile);
        int flag = 0;
        String s, newLine = "printf(\"\n\");";
        String replaceString;
        BufferedReader br = null;
        BufferedWriter bw = null;

        try {
             br = new BufferedReader(new FileReader(readFile));
             bw = new BufferedWriter(new FileWriter(writeFile));

                while ((s = br.readLine()) != null) {

                    if (s.contains("printf")) {
                        flag = 1;
                            replaceString = Convertor.convertC(s.substring(s.indexOf('p'),s.indexOf(';')+1));
                            s = replaceString;
                    }
                    else if (s.contains("cout")){
                        replaceString = Convertor.convertCpp(s);
                        s=s.replace(s, replaceString);
                        //System.out.println(s);
                    }
                    bw.write(s);
                    bw.newLine();
                    /*if(flag == 1){
                        bw.write(newLine);
                        bw.newLine();
                        flag = 0;
                    }*/
                }
           } catch (IOException e) {
               //System.out.println(e);
            } 
           finally {
                    try {
                       if(br != null)
                          br.close();
                    } catch (IOException e) {
                       //
                    }
                    try {
                       if(bw != null)
                          bw.close();
                    } catch (IOException e) {
                       //
                }
            }

            File oldFile = new File(location + "." + info.getLanguage().toLowerCase());
            oldFile.delete();
            
            File newFile = new File(writeFile);
            
            newFile.renameTo(oldFile);
    }

    public static String convertC (String str){
                                
    
    if(!(str.contains("%")))
        return "";
    
    int a = 0;

    int k = str.length();
    char [] str2 = new char[k];

    while (a < 8){

    //    System.out.print(str.charAt(a));
        str2[a] = str.charAt(a);
        a++;
    }
    
    int b = a;

    int flag = 0;

    for (int i = a; i < str.length(); i++){

        if((str.charAt(i) == '\\') && (str.charAt(i + 1) == 'n')){
            str2[b++] = str.charAt(i++);
            str2[b++] = str.charAt(i++);
        }
        if (str.charAt(i) == '%'){

            do{
                str2[b++] = str.charAt(i++);

            }while((str.charAt(i) != 'c') && (str.charAt(i) != 'd') && (str.charAt(i) != 'f') && (str.charAt(i) != 's'));

            str2[b++] = str.charAt(i);
        }

        if (str.charAt(i) == '"'){
            str2[b++] = str.charAt(i);
            flag = i + 1;
            break;
        }
    }

    while(flag < str.length()){
        str2[b++] = str.charAt(flag++);
    }

    String str3;

    str3=String.valueOf(str2);
    return str3;
}

    /**
     *
     * @param str
     * @return
     */
    public static String convertCpp (String str){

    
        if((str.contains("cout<<endl;")) && (str.length()== 11))
        {
            return str;
        }
                
        int a = 0;
        int counter=0;
        String str4;   
        str4 = null;
	int k = str.length();
	 char [] str2 = new char[k];
         

        while (a < 4)
	{
		str2[a] = str.charAt(a);
		a++;
	}
        
       
	 int b = a;
	
	

	 int flag = 0;

	for (int i = a;i < str.length();i++)
	{
            switch (str.charAt(i)) {
                case '<':
                    str2[b] = str.charAt(i);
                    b++;
                    break;
                case '"':
                    while(str.charAt(i+1)!= '"'){
                        i++;
                    }   
                    i++;
                    if(str.charAt(i+1) == '<')
                    {
                        i=i+2;
                    }
                    if(str.charAt(i+1) == ';' || str.charAt(i+5) == ';' && counter==0)
                    {
                        return "/**/";
                    }
                    break;
                default:
                    str2[b] = str.charAt(i);
                    b++;
                    counter++;
                    break;
            }

   }

	
	  String str3;
          str3=String.valueOf(str2);
          return str3;
          
      	
}
}
