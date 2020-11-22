import java.util.Hashtable;

public class Doctor {
    String doctorName;
    //Initialize the schedule for the Doctor object that tracks availability
    Hashtable<String, String> appTable = new Hashtable<String, String>();
    Doctor()
    {
        this.doctorName = "";
        
        appTable.put("9:00 a.m.- 9:30 a.m.", "Available");
        appTable.put("9:30 a.m. - 10:00 a.m.", "Available");
        appTable.put("10:00 a.m. - 10:30 a.m.", "Available");
        appTable.put("10:30 a.m. - 11:00 a.m.", "Available");
        appTable.put("11:00 a.m. - 11:30 a. m.", "Available");
        appTable.put("11:30 a.m. - 12:00 a.m.", "Available");
        appTable.put("12:30 a.m. - 1:00 p.m.", "Available");
        appTable.put("1:30 p.m. - 2:00 p.m.", "Available");
        appTable.put("2:00 p.m. - 2:30 p.m.", "Available");
        appTable.put("2:30 p.m. - 3:00 p.m.", "Available");
        appTable.put("3:00 p.m. - 3:30 p.m.", "Available");
        appTable.put("3:30 p.m. - 4:00 p.m.", "Available");
        appTable.put("4:00 p.m. - 4:30 p.m.", "Available");
        appTable.put("4:30 p.m. - 5:00 p.m.", "Available");
    

    }
    
    Doctor(String doctorName)
    {
        this.doctorName = doctorName;
        appTable.put("9:00 a.m.- 9:30 a.m.", "Available");
        appTable.put("9:30 a.m. - 10:00 a.m.", "Available");
        appTable.put("10:00 a.m. - 10:30 a.m.", "Available");
        appTable.put("10:30 a.m. - 11:00 a.m.", "Available");
        appTable.put("11:00 a.m. - 11:30 a. m.", "Available");
        appTable.put("11:30 a.m. - 12:00 a.m.", "Available");
        appTable.put("12:30 a.m. - 1:00 p.m.", "Available");
        appTable.put("1:30 p.m. - 2:00 p.m.", "Available");
        appTable.put("2:00 p.m. - 2:30 p.m.", "Available");
        appTable.put("2:30 p.m. - 3:00 p.m.", "Available");
        appTable.put("3:00 p.m. - 3:30 p.m.", "Available");
        appTable.put("3:30 p.m. - 4:00 p.m.", "Available");
        appTable.put("4:00 p.m. - 4:30 p.m.", "Available");
        appTable.put("4:30 p.m. - 5:00 p.m.", "Available");
    
    }
    
    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }
    
    public String getDoctorName() {
        return doctorName;
    }

    public int checkAvailable(String timeSlot)
    {
        if(appTable.get(timeSlot) == "Available")
            return 1;
        else 
            return 0;

    }
    public void markAppointment(String timeSlot, String patient)
    {
        appTable.replace(timeSlot, patient);
        System.out.println("appointment created for Dr." + this.doctorName + "  patient " + patient + " at " + timeSlot + "\n");
    }
    public void clearAppointment(String timeSlot)
    {
        appTable.replace(timeSlot, "Available");
        System.out.println("Appointment with Dr. " + this.doctorName + " at " + timeSlot + " has been changed to " + appTable.get(timeSlot) + "\n" );
    }
    
}
