package Appointment;

import Database.DatabaseManager;

import java.sql.Time;
import java.util.Arrays;
import java.util.Hashtable;

public class AppointmentManager
{
    ReportManager reportMan;
    Hashtable<String, Doctor> doctorsList = new Hashtable<String, Doctor>();
    Hashtable<String, Patient> patientList = new Hashtable<String, Patient>();



    //TODO: Date class?
    //TODO: Add functionality for checking/adding appointments for individual Doctor objects
    public AppointmentManager()
    {

    }

    public AppointmentManager(ReportManager reportMan)
    {
        this.reportMan = reportMan;
    }

    public void setReportManager(ReportManager reportMan)
    {
        this.reportMan = reportMan;
    }

    public ReportManager getReportManager()
    {
        return this.reportMan;
    }
    //Method for adding Doctor to the list
    void addDoctor(String employeID)
    {
        doctorsList.put(employeID, new Doctor(employeID));
    }


    //Method for retreiving Doctor from list based on name
    Doctor getDoctor(String employeID)
    {
        return doctorsList.get(employeID);

    }
    //Method for adding Patient to the list
    void addPatient(String patientName)
    {
        patientList.put(patientName, new Patient(patientName));
    }
    // for retreiving patient from the list based on name
    Patient getPateint(String patientName)
    {
        return patientList.get(patientName);
    }
    //Will find all existing appointments in csv file and return an array of times that are currently available
    public String[] checkAvailable(String EmployeeID)
    {
        String[] busy = new String[16];

        DatabaseManager DataMan = new DatabaseManager();
        busy = DataMan.getDoctorScheduleAvailable(EmployeeID, 1);
        String[] avail = {"9a","9:30a","10a","10:30a","11a", "11:30a","12p","12:30p","1p","1:30p","2:00p","2:30p","3:00p","3:30p","4p","4:30p"};
        for (int i = 0; i < avail.length; i++)
        {
            if(Arrays.asList(busy).contains(avail[i]))
            {
                avail[i] = "Not Available";
            }
        }
        DataMan.closeDB();
        return avail;

    }

    public void markAppointment(String patientID, String timeSlot, String EmployeeID )
    {

        DatabaseManager DataMan = new DatabaseManager();
        DataMan.addDoctorSchedule(patientID, timeSlot, EmployeeID);
        System.out.println("appointment created for Dr." + EmployeeID + " with patient " + patientID + " at " + timeSlot + "\n");
        DataMan.closeDB();

    }
    public void clearAppointment(String patientID)
    {
        DatabaseManager DataMan = new DatabaseManager();
        DataMan.deleteDoctorSchedule(patientID);
        DataMan.closeDB();
    }

    public String getAppointment(String patientID)
    {
        DatabaseManager DataMan = new DatabaseManager();
        String[] appointmentLine;
        appointmentLine = DataMan.getDoctorScheduleLine(patientID);
        String app = "Patient: " + appointmentLine[0] + " Time: " + appointmentLine[1] + "Doctor: " + appointmentLine[2];
        return app;
    }
    
    public void modifyAppopintment(String patientID, String Time, String employeeID)
    {
        DatabaseManager DataMan = new DatabaseManager();
        DataMan.deleteDoctorSchedule(patientID);
        DataMan.addDoctorSchedule(patientID, Time, employeeID);
    }
    
    

}
