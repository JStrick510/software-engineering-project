import java.util.Hashtable;

public class Doctor {
    String doctorName;
    double dailyEarnings;
    int numPatients;
    //Initialize the schedule for the Doctor object that tracks availability
    //Hashtable<String, String> appTable = new Hashtable<String, String>();
    Doctor()
    {
        this.doctorName = "";
        this.dailyEarnings = 0.0;
        this.numPatients = 0;
        
    }
    
    Doctor(String employeeID)
    {
        this.doctorName = employeeID;
        this.dailyEarnings = 0.0;
        this.numPatients = 0;
    }
    
    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }
    public void setdailyEarnings(double earnings)
    {
        this.dailyEarnings = earnings;
    }
    public void setnumPatients(int num)
    {
        this.numPatients = num;
    }
    
    public String getDoctorName() {
        return doctorName;
    }
    public double getdailyEarnings()
    {
        return dailyEarnings;
    }
    public int getnumPatients()
    {
        return numPatients;
    }
    
//Method to sate that an appointment was completed succesfully
    public void incrementVisits()
    {
        this.numPatients++;
    }
}
