public class Doctor {
    String doctorName;


    Doctor()
    {
        this.doctorName = "";

    }
    
    Doctor(String doctorName)
    {
        this.doctorName = doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }
    
    public String getDoctorName() {
        return doctorName;
    }
    
}
