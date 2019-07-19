/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SILabsModel;

/**
 *
 * @author ali
 */
public class Info {
    private String Location, FileName,  Type, Language, ZipFileName, ZipFilePath, ResultFile, HeaderFileName, HeaderFilePath, TestInput, ExpectedOutput, Result, Error, jplagPath;

    public String getJplagPath() {
        return jplagPath;
    }

    public void setJplagPath(String jplagPath) {
        this.jplagPath = jplagPath;
    }
    private boolean HeaderFile;
    private int counter;
    
    public void setHeaderFileFlag(boolean flag){
        HeaderFile = flag;
    }
    
    public boolean getHeaderFileFlag(){
        return HeaderFile;
    }
    
    public void setHeaderFileName(String HeaderFileName){
        this.HeaderFileName = HeaderFileName;
    }
    
    public String getHeaderFileName(){
        return HeaderFileName;
    }
    
    public void setHeaderFilePath(String HeaderFilePath){
        this.HeaderFilePath = HeaderFilePath;
    }
    
    public String getHeaderFilePath(){
        return HeaderFilePath;
    }
    
    public void setResultFile(String ResultFile){
        this.ResultFile = ResultFile;
    }
    
    public String getResultFile(){
        return ResultFile;
    }
    
    public void setZipFileName(String ZipFileName){
        this.ZipFileName = ZipFileName;
    }
    
    public String getZipFileName(){
        return ZipFileName;
    }    
   
    public void setZipFilePath(String ZipFilePath){
        this.ZipFilePath = ZipFilePath;
    }
    
    public String getZipFilePath(){
        return ZipFilePath;
    }
    
    public void setLanguage(String Language){
        this.Language = Language;
    }
    
    public void setLocation(String Location){
        this.Location = Location;
    }
    
    public void setType(String Type){
        this.Type = Type;
    }
        
    public String getLanguage(){
        return Language;
    }
    
    public String getLocation(){
        return Location;
    }
    
    public String getFileName(){
        return FileName;
    }
     
    public void setFileName(String FileName){
        this.FileName = FileName;
    }
     
    public String getType(){
        return Type;
    }
    
    public void setCounter(int counter){
        this.counter = counter;
    }
    
    public int getCounter(){
        return counter;
    }
    
    public void setTestInput(String str){
        TestInput = str;
    }
    
    public String getTestInput(){
        return TestInput;
    }

    public void setExpectedOutput(String str){
        ExpectedOutput = str;
    }
    
    public String getExpectedOutput(){
        return ExpectedOutput;
    }

    public void setError(String str){
        Error = str;
    }
    
    public String getError(){
        return Error;
    }


    public void setResult(String str){
        Result = str;
    }
    
    public String getResult(){
        return Result;
    }
}
