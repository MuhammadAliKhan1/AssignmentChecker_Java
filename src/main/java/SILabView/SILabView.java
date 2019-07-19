package SILabView;

import SILabsModel.Info;
import SILabsController.Controller;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author silab
 */
public class SILabView extends javax.swing.JFrame {

    private final Info info = new Info(); //Initialized variable using class info.java
    private final Controller controller = new Controller();

    /**
     * Creates new form SILabView
     */
    public SILabView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        //Header File label
        headerfile_label = new javax.swing.JLabel();
        //Header file text field
        headerfile_text = new javax.swing.JTextField();
        //header file path text field
        headerfilepath_text = new javax.swing.JTextField();
        headerfilepath_label = new javax.swing.JLabel();
        //select path button
        selectpath_btn = new javax.swing.JButton();
        //program name label
        programname_label = new javax.swing.JLabel();
        //program name text field
        programname_text = new javax.swing.JTextField();
        programlocation_label = new javax.swing.JLabel();
        //program location text field
        programlocation_text = new javax.swing.JTextField();
        //select zip file button
        selectzipfile_btn = new javax.swing.JButton();
        testinput_label = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        //test input text field
        testinput_text = new javax.swing.JTextPane();
        result_label = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        //result text pane
        result_text = new javax.swing.JTextPane();
        jPanel2 = new javax.swing.JPanel();
        //file radio button
        file_radio = new javax.swing.JRadioButton();
        // standard I/O radio button
        standardI_O_radio = new javax.swing.JRadioButton();
        // select jplag button
        JPlag_btn = new javax.swing.JButton();
        //check plag button
        checkPlag_btn = new javax.swing.JButton();
        expectedoutput_label = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        //expected output text pane
        expectedoutput_text = new javax.swing.JTextPane();
        //display result button
        dispResult_btn = new javax.swing.JButton();
        //execute button
        execute_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(731, 499));

        jSplitPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jSplitPane1.setDividerLocation(430);

        headerfile_label.setText("Header Files");
        //end

        //end

        headerfilepath_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                headerfilepath_textActionPerformed(evt);
            }
        });
        //end

        headerfilepath_label.setText("Header Files Path");

        selectpath_btn.setText("Select Path");
        selectpath_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectpath_btnActionPerformed(evt);
            }
        });
        //end

        programname_label.setText("Program Name ");
        //end

        //end

        programlocation_label.setText("Program Location");

        programlocation_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                programlocation_textActionPerformed(evt);
            }
        });
        //end

        selectzipfile_btn.setText("Select Zip File");
        selectzipfile_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectzipfile_btnActionPerformed(evt);
            }
        });
        //end

        testinput_label.setText("Test Input");

        jScrollPane1.setViewportView(testinput_text);
        //end

        result_label.setText("Result");

        jScrollPane2.setViewportView(result_text);
        //end

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(selectzipfile_btn)
                    .addComponent(selectpath_btn)
                    .addComponent(headerfilepath_text, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                    .addComponent(headerfile_text, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(headerfilepath_label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(headerfile_label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(testinput_label)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(programlocation_text)
                            .addComponent(programname_text)
                            .addComponent(programlocation_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(programname_label, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(result_label)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(headerfile_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(headerfile_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(headerfilepath_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(headerfilepath_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selectpath_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(programname_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(programname_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(programlocation_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(programlocation_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selectzipfile_btn)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(testinput_label)
                    .addComponent(result_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        file_radio.setText("File");
        //end
        file_radio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                file_radioActionPerformed(evt);
            }
        });

        standardI_O_radio.setText("Standard I/O ");
        //end
        standardI_O_radio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                standardI_O_radioActionPerformed(evt);
            }
        });

        JPlag_btn.setText("Select JPlag Path");
        //end
        JPlag_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JPlag_btnActionPerformed(evt);
            }
        });

        checkPlag_btn.setText("Check Plag");
        checkPlag_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkPlag_btnActionPerformed(evt);
            }
        });
        //end

        expectedoutput_label.setText("Expected Output");

        jScrollPane3.setViewportView(expectedoutput_text);
        //end

        dispResult_btn.setText("Display Result");
        //end
        dispResult_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dispResult_btnActionPerformed(evt);
            }
        });

        execute_btn.setText("Execute");
        execute_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                execute_btnActionPerformed(evt);
            }
        });
        //end

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dispResult_btn)
                            .addComponent(execute_btn)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(checkPlag_btn)
                        .addComponent(JPlag_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(standardI_O_radio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(file_radio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(expectedoutput_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(execute_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dispResult_btn))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(file_radio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(standardI_O_radio)
                        .addGap(34, 34, 34)
                        .addComponent(JPlag_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkPlag_btn)
                        .addGap(128, 128, 128)
                        .addComponent(expectedoutput_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jSplitPane1.setRightComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 782, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selectzipfile_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectzipfile_btnActionPerformed
        JFileChooser fileChooser = new JFileChooser(); //Used Jfile chooser to prompt the user to select file
        File f; //Provides filing functionalities (Create directories etc)
        int ReturnValue = fileChooser.showOpenDialog(null); //opens a dialog to choose files from directories (null is passed as we dont want to pass any parameters)

        if (ReturnValue == JFileChooser.APPROVE_OPTION) {
            //enters only if a file is selected.
            f = fileChooser.getSelectedFile(); //Stores the file in the File object 'f'
            String temp = f.getAbsolutePath(); //gets the absoulute path of the file
            String FileName = f.getName(); //gets the file name
            info.setZipFileName(FileName); //sets zipFileName using FileName as parameter
            info.setZipFilePath(temp.substring(0, temp.lastIndexOf("\\") + 1)); //Sets the zip file path
            temp = temp.substring(0, temp.indexOf(".")); //
            programlocation_text.setText(temp + "\\");//
        }
    }//GEN-LAST:event_selectzipfile_btnActionPerformed

    private void programlocation_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_programlocation_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_programlocation_textActionPerformed

    //Select path button action performed (OnClick)
    private void selectpath_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectpath_btnActionPerformed
        JFileChooser fileChooser1 = new JFileChooser(); //Used Jfile chooser to prompt the user to select file
        File f; //Provides filing functionalities (Create directories etc)
        int ReturnValue = fileChooser1.showOpenDialog(null); //opens a dialog to choose files from directories (null is passed as we dont want to pass any parameters)

        if (ReturnValue == JFileChooser.APPROVE_OPTION) {
            //enters only if a file is selected.
            f = fileChooser1.getSelectedFile();
            String path = f.getPath().substring(0, f.getPath().lastIndexOf("\\") + 1);//
            selectpath_btn.setText(path);//Setting text of select path button to "path" variable
            info.setHeaderFilePath(path); //Calling setter of HeaderFilePath of info class on info variable
            info.setHeaderFileFlag(true); //Callling setter of HeaderFilePlag of info class on info variable
        }
        String headerfile_val = headerfile_text.getText(); // getting text value of headerfile text field
        if (!("Header File".equals(headerfile_val) || headerfile_val == null)) {
            //sets HeaderFileName if the value is not "Header File" or null
            info.setHeaderFileName(headerfile_val);
        }

    }//GEN-LAST:event_selectpath_btnActionPerformed
    //end
    private void headerfilepath_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_headerfilepath_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_headerfilepath_textActionPerformed

    private void checkPlag_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkPlag_btnActionPerformed
        Runtime r = Runtime.getRuntime(); //object is used to run processess at runtime (refer to https://docs.oracle.com/javase/7/docs/api/java/lang/Runtime.html for more info) 
        Process p;//creating a null object of Process class
        p = null;

        String command = "cmd /c C:\\Users\\Acer\\Desktop\\result\\index.html"; //setting directory

        try {
            p = r.exec(command);

            String errorString = "";
            InputStream error = p.getErrorStream();
            int i;

            while ((i = error.read()) != -1) {
                errorString = errorString + (char) i;
            }

            System.out.println(errorString);
            p.waitFor();
        } catch (IOException | InterruptedException ex) {
            Logger.getLogger(SILabView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_checkPlag_btnActionPerformed

    private void file_radioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_file_radioActionPerformed
        file_radio.setSelected(true);//sets radio button of file true
        standardI_O_radio.setSelected(false); //sets radio button of standard IO false
        info.setType("File"); //sets type of the file of info variable to "file"
    }//GEN-LAST:event_file_radioActionPerformed

    private void standardI_O_radioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_standardI_O_radioActionPerformed
        file_radio.setSelected(false);//sets radio button of file false
        standardI_O_radio.setSelected(true); //sets radio button of standard IO true
        info.setType("StandardIO"); //sets type of the file of info variable to "file"
    }//GEN-LAST:event_standardI_O_radioActionPerformed

    private void JPlag_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JPlag_btnActionPerformed
        JFileChooser fileChooser1 = new JFileChooser(); //used to open dialogs etc
        File f;//used to perform filing functionalities (saving files etc)
        int ReturnValue = fileChooser1.showOpenDialog(null);//opens a dialog to select file (null shows no parameter is passed)

        if (ReturnValue == JFileChooser.APPROVE_OPTION) {
            //enters only if a file is selected
            f = fileChooser1.getSelectedFile();//gets the selected file and stores in it file object
            String path = f.getPath().substring(0, f.getPath().lastIndexOf("\\") + 1);//
            info.setJplagPath(path);//sets jplagpath based on the path file selected
        }
    }//GEN-LAST:event_JPlag_btnActionPerformed

    private void dispResult_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dispResult_btnActionPerformed
        Runtime rt = Runtime.getRuntime();
        try {
            Process p = rt.exec("notepad " + info.getResultFile());
        } catch (IOException ex) {
            Logger.getLogger(SILabView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_dispResult_btnActionPerformed

    private void execute_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_execute_btnActionPerformed
        int flag = 0;
        String error = "";

        String temp = programname_text.getText();
        
        if(temp.charAt(temp.length() - 1) == 'c')
            info.setLanguage("C");
        else
            info.setLanguage("Cpp");

        info.setFileName(temp.substring(0,temp.indexOf(".")));

        char c = testinput_text.getText().charAt(0);
        info.setCounter((int)c - 48);

        if(!info.getType().equalsIgnoreCase("file")){
            if(testinput_text.getText().isEmpty()){
                error = error + "Test Input is empty..!!\n";
                flag = 1;
            }
            else{
                //System.out.println(TestInput.getText().substring(3));
                //System.out.println((int)c - 48);
                info.setTestInput(testinput_text.getText().substring(3));
            }

            if(expectedoutput_text.getText().isEmpty()){
                error = error + "Expected Output is not given..!!\n";
                flag = 1;
            }
            else{
                //System.out.println(ExpectedOutput.getText().substring(0));
                info.setExpectedOutput(expectedoutput_text.getText());
            }
        }
        
        if(programname_text.getText().isEmpty()){
            error = error + "Program Name is not provided..!!\n";
            flag = 1;
        }
    
        if(programlocation_text.getText().isEmpty()){
            error = error + "Location is not given..!!\n";
            flag = 1;
        }
        else
            info.setLocation(programlocation_text.getText());
        
        if(flag == 0){
            controller.BuildProduct(info);
            
            result_text.setText(info.getResult());
        }
        else{
            result_text.setText(error);
        }
    }//GEN-LAST:event_execute_btnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SILabView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */ //Used Lambda expression
        java.awt.EventQueue.invokeLater(() -> {
            new SILabView().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JPlag_btn;
    private javax.swing.JButton checkPlag_btn;
    private javax.swing.JButton dispResult_btn;
    private javax.swing.JButton execute_btn;
    private javax.swing.JLabel expectedoutput_label;
    private javax.swing.JTextPane expectedoutput_text;
    private javax.swing.JRadioButton file_radio;
    private javax.swing.JLabel headerfile_label;
    private javax.swing.JTextField headerfile_text;
    private javax.swing.JLabel headerfilepath_label;
    private javax.swing.JTextField headerfilepath_text;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel programlocation_label;
    private javax.swing.JTextField programlocation_text;
    private javax.swing.JLabel programname_label;
    private javax.swing.JTextField programname_text;
    private javax.swing.JLabel result_label;
    private javax.swing.JTextPane result_text;
    private javax.swing.JButton selectpath_btn;
    private javax.swing.JButton selectzipfile_btn;
    private javax.swing.JRadioButton standardI_O_radio;
    private javax.swing.JLabel testinput_label;
    private javax.swing.JTextPane testinput_text;
    // End of variables declaration//GEN-END:variables
}
