

public class Doctor {
    String doctorName;
    
    
    Doctor()
    {
        this.doctorName = "";
        
        
    }
    
    Doctor(String employeeID)
    {
        this.doctorName = employeeID;
       
    }
    //Methods to set values of variables
    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }
    
    
    //Methods to get values 
    public String getDoctorName() {
        return doctorName;
    }
    
    

}
