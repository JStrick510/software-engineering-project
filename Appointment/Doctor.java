

public class Doctor {
    String doctorName;
    double dailyEarnings;
    int numPatients;
    
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
    //Methods to set values of variables
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
    
    //Methods to get values 
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
    
//Method to increase number of patients seen when an appointment was completed succesfully
    public void incrementVisits()
    {
        this.numPatients++;
    }
}
