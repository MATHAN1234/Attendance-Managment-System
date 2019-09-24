public class User1 {
    
    String IDNO;
    String Name;
    String DOB;
    String Gender;
    String Nationality;
    String Password;
    
     public User1() {
    }

    public User1(String IDNO, String Name, String Password, String DOB, String Nationality, String Gender) {
        this.IDNO = IDNO;
        this.Name = Name;
        this.Password = Password;
        this.DOB = DOB;
        this.Nationality= Nationality;
        this.Gender = Gender;
        }
    
    
    User1(String data) {
        String[] dataArray = data.split(",");
        
        this.IDNO = dataArray[0];
        this.Name = dataArray[1];
        this.Password = dataArray[2];
        this.DOB = dataArray[3];
        this.Nationality= dataArray[4]; 
        this.Gender = dataArray[5];
        
        
    }
    
    
    public String getidno() {
        return IDNO;
    }

    public void sedtidno(String IDNO) {
        this.IDNO = IDNO;
    }

    public String getname() {
        return Name;
    }

    public void setname(String Name) {
        this.Name = Name;
    }

    public String getdob() {
        return DOB;
    }

    public void setdob(String DOB) {
        this.DOB = DOB;
    }

    public String getgender() {
        return Gender;
    }

    public void setgender(String Gender) {
        this.Gender = Gender;
    }
     public String getnationality() {
        return Nationality;
    }

    public void setnationality(String Nationality) {
        this.Nationality = Nationality;
    }
     public String getpassword() {
        return Password;
    }

    public void setpassword(String Password) {
        this.Password = Password;
    }
   

    @Override
    public String toString() {
        return (this.IDNO + "," + this.Name + "," + this.Password + "," + this.DOB 
                + "," + this.Nationality + "," + this.Gender);
    } 
    
    
    
    
}
