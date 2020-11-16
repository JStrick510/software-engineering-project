public class Patient {
    String PatientName;

    Patient()
    {
        PatientName = "";

    }

    Patient(String patientName)
    {
        this.PatientName = patientName;
    }
    
    public void setPatientName(String PatientName) {
        this.PatientName = PatientName;
    }

    public String getPatientName() {
        return PatientName;
    }

}
