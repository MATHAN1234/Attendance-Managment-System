/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mathan Kumar
 */
public class Student1 extends User1 {
         private String intake;
     
      public Student1 (String IDNO, String Name, String Password, String DOB, String Nationality, String Gender, String intake) 
    {
        super (IDNO, Name, Password, DOB, Nationality, Gender);
        this.intake = intake; 
    }  
      public String getIntake() {
        return intake;
    }

    public void setIntake(String intake) {
        this.intake = intake;
    }
    
    
    Student1(String data) {
        String[] dataArray = data.split(",");
        this.IDNO = dataArray[0];
        this.Name = dataArray[1];
        this.Password = dataArray[2];
        this.DOB = dataArray[3]; 
        this.Nationality = dataArray[4];
        this.Gender = dataArray[5];
        this.intake = dataArray[6];
    }
    
     @Override
    public String toString() {
        return super.toString() + "," + this.intake;
    
}

    /*Object getID() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
}