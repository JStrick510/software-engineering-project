public class AppointmentManager
{
    String m_patientName;
    String m_doctorName;
    //TODO: Date class?
    //TODO: Going to change this class to house the dictionaries for patients and doctors which will have their own class
    AppointmentManager(String patientName, String doctorName)
    {
        this.m_patientName = patientName;
        this.m_doctorName = doctorName;
    }

    AppointmentManager()
    {
        this.m_patientName = "";
        this.m_doctorName = "";
    }

    String getPatientName()
    {
        return this.m_patientName;
    }

    String getDoctorName()
    {
        return this.m_doctorName;
    }

    void setPatientName(String patientName)
    {
        this.m_patientName = patientName;
    }

    void setDoctorName(String doctorName)
    {
        this.m_doctorName = doctorName;
    }
}
