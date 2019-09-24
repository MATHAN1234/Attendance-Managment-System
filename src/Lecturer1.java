/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mathan Kumar
 */
public class Lecturer1 extends User1{

    public Lecturer1(){}
     public Lecturer1 (String IDNO, String Name, String Password, String DOB, String Nationality, String Gender) 
    {
        super(IDNO, Name, Password, DOB , Nationality, Gender);
           
    }
    
Lecturer1(String data) {
        String[] dataArray = data.split(",");
        this.IDNO = dataArray[0];
        this.Name = dataArray[1];
        this.Password = dataArray[2];
        this.DOB = dataArray[3]; 
        this.Nationality = dataArray[4];
        this.Gender = dataArray[5];
        
        
    }


@Override
    public String toString() {
        return super.toString();
    } 
      
   
}
