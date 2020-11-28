package project1;

import java.util.Arrays; //just for printing arrays easy

public class TestingDBMain {

	public static void main(String[] args) {
		
		/*
		//need to fix array being tabbed when reading in csv
		DatabaseManager DBM = new DatabaseManager();
        
        //add info
        DBM.addPaitentChart("123-45-6789", "1", "test@email.com", "8325558322", "Poor", "Joe Bob", "1335 Street Rd", "Health Insurance", "0");
        DBM.addPaitentChart("987-65-4321", "2", "email@gmail.com", "7135557133", "Healthy", "John Smith", "999 Court Bvd", "Care", "1");
        DBM.addTreatmentChart("0", "72in", "180lbs", "120/70", "Rona", "Advil", "500mg", "1");
        DBM.addPaymentInfo("002847865", "Joe Bob", "08/08/2020", "213.98", "Cash", "1");
        DBM.addReport("11/11/20", "Dr. Science", "8", "1500.00");
        DBM.addLogInInfo("0000", "password", "Doctor");
        DBM.addDoctorSchedule("1", "Wed 9a", "0000");
        
        //get single info (identifier then index of element wanted)
        System.out.println(DBM.getPatientChartData("123-45-6789", 2)); //gets email
        System.out.println(DBM.getPatientChartData("987-65-4321", 5)); //gets name
        System.out.println(DBM.getTreatmentChartData("0", 1)); //gets height
        System.out.println(DBM.getPaymentInfoData("002847865", 5)); //gets PatientID
        System.out.println(DBM.getReportData("11/11/20", 1)); //gets doctor name
        System.out.println(DBM.getLogInInfoData("0000", 1)); //gets password
        System.out.println(DBM.getDoctorScheduleData("1", 2)); //gets patient info
        
        //get full info (identifier)
        System.out.println(Arrays.toString(DBM.getPatientChartLine("123-45-6789")));
        System.out.println(Arrays.toString(DBM.getPatientChartLine("987-65-4321")));
        System.out.println(Arrays.toString(DBM.getTreatmentChartLine("0")));
        System.out.println(Arrays.toString(DBM.getPaymentInfoLine("002847865")));
        System.out.println(Arrays.toString(DBM.getReportLine("11/11/20")));
        System.out.println(Arrays.toString(DBM.getLogInInfoLine("0000")));
        System.out.println(Arrays.toString(DBM.getDoctorScheduleLine("1")));
        
        //logging a employee in
        String password = "password";
        String employeeID = "0000";
        if(password.equals(DBM.getLogInInfoData(employeeID, 1)))
        {
        	DBM.addCurrentLogIn(employeeID);
        	if(DBM.checkCurrentLogIn(employeeID))
        		System.out.println(employeeID + " is logged in");
        	DBM.removeCurrentLogIn(employeeID);
        }
        
        //remove info
        DBM.deletePatientChart("123-45-6789");
        DBM.deletePatientChart("987-65-4321");
        DBM.deleteTreatmentChart("0");
        DBM.deletePaymentInfo("002847865");
        DBM.deleteReport("11/11/20");
        DBM.deleteLogInInfo("0000");
        DBM.deleteDoctorSchedule("1");
        
        //always need to close at the end to write to the file
        DBM.closeDB();
        System.out.println("test done");
        */
		
		//ReportManager test = new ReportManager();
		DatabaseManager DBM = new DatabaseManager();
		
		//DBM.deleteReport("11-26-2020");
		//DBM.deleteReport("11-27-2020");
		//DBM.deleteReport("11-28-2020");
		
		//DBM.addReport("11-26-2020", "15", "1500.78");
		//DBM.addReport("11-27-2020", "8", "5.00");
		//DBM.addReport("11-28-2020", "10", "201456.50");
		
		//DBM.addPaitentChart("123-45-6789", "1", "test@email.com", "8325558322", "Poor", "Joe Bob", "1335 Street Rd", "Health Insurance", "0");
		//DBM.addTreatmentChart("0", "72in", "180lbs", "120/70", "Rona", "Advil", "500mg", "1");
		//DBM.addPaymentInfo("002847865", "Joe Bob", "08/08/2020", "213.98", "Cash", "1");
		//DBM.addDoctorSchedule("1", "9a", "6789", "Joe Bob");

		
		System.out.println(Arrays.toString(DBM.getReportLine("11-26-2020")));
		
		DBM.closeDB();
		
		
		System.out.println("testing to see if other stuff works");
	}

}
