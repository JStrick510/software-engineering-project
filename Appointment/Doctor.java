//import java.util.Hashtable;

public class Doctor {
    String doctorName;
    //Initialize the schedule for the Doctor object that tracks availability
    //Hashtable<String, String> appTable = new Hashtable<String, String>();
    Doctor()
    {
        this.doctorName = "";
        
    }
    
    Doctor(String employeeID)
    {
        this.doctorName = employeeID;
    }
    
    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }
    
    public String getDoctorName() {
        return doctorName;
    }


    
}
