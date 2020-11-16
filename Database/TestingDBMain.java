package project1;

import java.util.Arrays; //just for printing arrays easy

public class TestingDBMain {

	public static void main(String[] args) {
		
		//need to fix array being tabbed when reading in csv
		DatabaseManager DBM = new DatabaseManager();
        
        //add info
        DBM.addPaitentChart("123-45-6789", "1", "test@email.com", "8325558322", "Poor", "Joe Bob", "1335 Street Rd", "Health Insurance", "0");
        DBM.addTreatmentChart("0", "72in", "180lbs", "120/70", "Rona", "Advil", "500mg", "1");
        DBM.addPaymentInfo("002847865", "Joe Bob", "08/08/2020", "213.98", "Cash", "1");
        DBM.addReport("11/11/20", "Dr. Science", "8", "1500.00");
        
        //get single info (identifier then index of element wanted)
        System.out.println(DBM.getPatientChartData("123-45-6789", 2)); //gets email
        System.out.println(DBM.getTreatmentChartData("0", 1)); //gets height
        System.out.println(DBM.getTreatmentChartData("002847865", 5)); //gets PatientID
        System.out.println(DBM.getReportData("11/11/20", 1)); //gets doctor name
        
        //get full info (identifier)
        System.out.println(Arrays.toString(DBM.getPatientChartLine("123-45-6789")));
        System.out.println(Arrays.toString(DBM.getTreatmentChartLine("0")));
        System.out.println(Arrays.toString(DBM.getPaymentInfoLine("002847865")));
        System.out.println(Arrays.toString(DBM.getReportLine("11/11/20")));
        
        //remove info
        DBM.deletePatientChart("123-45-6789");
        DBM.deleteTreatmentChart("0");
        DBM.deletePaymentInfo("002847865");
        DBM.deleteReport("11/11/20");
        
        //always need to close at the end to write to the file
        DBM.closeDB();
        System.out.println("test done");
	}

}
