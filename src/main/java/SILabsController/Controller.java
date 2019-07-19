/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SILabsController;

import SILabsModel.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 *
 * @author ali
 */
public class Controller {

    AssignmentChecker assignmentChecker = new AssignmentChecker();
    Unzip unZip = new Unzip();

    public static void CheckPlag(String str, Info info) {
        //System.out.println(str);
        String command = "cmd /c java -jar jplag-2.11.8-SNAPSHOT-jar-with-dependencies.jar -l c/c++ -s " + "\"" + str + "\"";
        //System.out.println(command);
        Runtime r = Runtime.getRuntime();
        Process p;

        try {
            p = r.exec(command, null, new File(info.getJplagPath()));
            //System.out.println(info.getJplagPath());
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void BuildProduct(Info info) throws FileNotFoundException, UnsupportedEncodingException, IOException, InterruptedException {

        unZip.extractFolder((info.getZipFilePath() + info.getZipFileName()));
        String location = info.getLocation();//Location.getText();
        Controller.CheckPlag(location.substring(0, location.length() - 1), info);
        //System.out.println("S");
        assignmentChecker.checkAssignment(info);

    }
}
