/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mathan Kumar
 */
public class ATTENDENCESTUDENT {
    private String AName;
    private String AId;
    private String AGender;
    private String AClassDuration;
    private String AClassStart;
    private String AClassAttendence;
    private String AModuleName;
    private String ADate;
    private String AMonth;
    private String AYear;
    
    
    public ATTENDENCESTUDENT (String AId, String AName, String AGender, String AClassStart, String AClassDuration, String AClassAttendence,String AModuleName,String ADate,String AMonth,String AYear){
        
        this.AId=AId;
        this.AName=AName;
        this.AGender =AGender;
        this.AClassStart=AClassStart;
        this.AClassDuration=AClassDuration;
        this.AClassAttendence=AClassAttendence;
        this.AModuleName=AModuleName;
        this.ADate=ADate;
        this.AMonth=AMonth;
        this.AYear=AYear;
    
    
    
    }
    public String getAId()  {
            return AId;
    
    }
 
    public void setAid(String AId) {
    this.AId = AId;
    
    }
    
    
    public String getAName()  {
            return AName;
    
    }
 
    public void setAName(String AName) {
    this.AName = AName;
    
    }
    
    public String getAGender()  {
            return AGender;
    
    }
 
    public void setAGender(String AGender) {
    this.AGender = AGender;
    
    }
    
    
    
    public String getAClassStart()  {
            return AClassStart;
    
    }
 
    public void setAClassStart(String AClassStart) {
    this.AClassStart = AClassStart;
    
    }
    
    public String getAClassDuration()  {
            return AClassDuration;
    
    }
 
    public void setAClassDuration(String AClassDuration) {
    this.AClassDuration = AClassDuration;
    
    }
    
    public String getAClassAttendence()  {
            return AClassAttendence;
    
    }
 
    public void setAClassAttendence(String AClassAttendence) {
    this.AClassAttendence = AClassAttendence;
    
    }
    
    public String getAModuleName()  {
            return AModuleName;
    
    }
 
    public void setAModuleName(String AModuleName) {
    this.AModuleName = AModuleName;
    
    }
    
    public String getADate()  {
            return ADate;
    
    }
 
    public void setADate(String ADate) {
    this.ADate = ADate;
    
    }
    
    public String getAMonth()  {
            return AMonth;
    
    }
 
    public void setAMonth(String AMonth) {
    this.AMonth = AMonth;
    
    }
    
    public String getAYear()  {
            return AYear;
    
    }
 
    public void setAYear(String AYear) {
    this.AYear = AYear;
    
    }
    
    ATTENDENCESTUDENT(String data){
    String[] RecordinArray = data.split(",");
    this.AId = RecordinArray [0];
    this.AName = RecordinArray [1];
    this.AGender = RecordinArray [2];
    this.AClassStart = RecordinArray [3];
    this.AClassDuration = RecordinArray [4];
    this.AClassAttendence = RecordinArray [5];
    this.AModuleName = RecordinArray [6];
    this.ADate = RecordinArray [7];
    this.AMonth = RecordinArray [8];
    this.AYear = RecordinArray [9];
    
    
    
    
    }
    
    
    
   public String toString(){
       return(this.AId + "," + this.AName + "," + this.AGender + "," + this.AClassStart + "," + this.AClassDuration + "," + this.AClassAttendence + "," + this.AModuleName + "," + this.ADate + "," + this.AMonth + "," + this.AYear);
   
   
   }
    
    }
    
    

