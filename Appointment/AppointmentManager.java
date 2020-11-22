import java.util.*;
public class AppointmentManager
{
    
    Hashtable<String, Doctor> doctorsList = new Hashtable<String, Doctor>();
    Hashtable<String, Patient> patientList = new Hashtable<String, Patient>();



    //TODO: Date class?
    //TODO: Add functionality for checking/adding appointments for individual Doctor objects
    AppointmentManager()
    {
       
    }

    //Method for adding Doctor to the list 
    void addDoctor(String doctorName)
    {
        doctorsList.put(doctorName, new Doctor(doctorName));
    }
    //Method for retreiving Doctor from list based on name
    Doctor getDoctor(String doctorName)
    {
        return doctorsList.get(doctorName);

    }
    //Method for adding Patient to the list 
    void addPatient(String patientName)
    {
        patientList.put(patientName, new Patient(patientName));
    }
    //Method for retreiving patient from the list based on name
    Patient getPateint(String patientName)
    {
        return patientList.get(patientName);
    }
    public void makeAppointment(String timeSlot, String doctor, String patient)
    {
        doctorsList.get(doctor).markAppointment(timeSlot, patient);
    }
    public void clearAppointment(String timeSlot, String doctor)
    {
        doctorsList.get(doctor).clearAppointment(timeSlot);
        
    }
}
