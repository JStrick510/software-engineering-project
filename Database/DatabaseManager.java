package project1;

import java.io.BufferedReader;  
import java.io.FileReader;  
import java.io.IOException; 
import java.util.ArrayList;
import java.io.*;

/*
PaitentChart: SSN, PatientID, Email, PhoneNumber, HealthCondition, Name, Address, InsuranceName, ChartID
TreatmentChart: ChartID, Height, Weight, BloodPressure, VisitReason, TreatmentContent, Prescription, PatientID
PaymentInfo: ReferenceNumber, Name, Date, Amount, PaymentType, PatientID
Report: ReportDate, DoctorName, NumberPatients, AmountEarned
*/

public class DatabaseManager {
	
	private ArrayList<String[]> patientChart;
	private ArrayList<String[]> treatmentChart;
	private ArrayList<String[]> paymentInfo;
	private ArrayList<String[]> report;
	
	public DatabaseManager()
    {
		//initialize arraylists
		patientChart = new ArrayList<String[]>();
		treatmentChart = new ArrayList<String[]>();
		paymentInfo = new ArrayList<String[]>();
		report = new ArrayList<String[]>();
		
        //will create new csv for all databases if one doesnt already exist
		File patientChartFile = new File("patientChart.csv");
		File treatmentChartFile = new File("treatmentChart.csv");
		File paymentInfoFile = new File("paymentInfo.csv");
		File reportFile = new File("report.csv");
		try 
		{
			patientChartFile.createNewFile();
			treatmentChartFile.createNewFile();
			paymentInfoFile.createNewFile();
			reportFile.createNewFile();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		//set the csv values to the arraylists if files arent empty
		if(patientChartFile.length() != 0)
			this.patientChart = readCSV(patientChartFile);
		if(treatmentChartFile.length() != 0)
			this.treatmentChart = readCSV(treatmentChartFile);
		if(paymentInfoFile.length() != 0)
			this.paymentInfo = readCSV(paymentInfoFile);
		if(reportFile.length() != 0)
			this.report = readCSV(reportFile);
    }
	
	public void closeDB()
	{
		if(patientChart != null) //assuming that databases will never be empty at the end, but just in case
		{
			ArrayList<String> patientChartContent = new ArrayList<String>();
			
			for(int a = 0; a < patientChart.size(); a++)
			{
				String concArray = "";
				for(int i = 0; i < patientChart.get(a).length; i++)
					concArray = concArray + ", " + patientChart.get(a)[i];
				concArray = concArray.substring(2,concArray.length()); //to get rid of the first ", " probably a better way to write this
				patientChartContent.add(concArray);
			}
			
			writeCSV("patientChart.csv", patientChartContent);
		}
		
		if(treatmentChart != null) //assuming that databases will never be empty at the end, but just in case
		{
			ArrayList<String> treatmentChartContent = new ArrayList<String>();
			
			for(int a = 0; a < treatmentChart.size(); a++)
			{
				String concArray = "";
				for(int i = 0; i < treatmentChart.get(a).length; i++)
					concArray = concArray + ", " + treatmentChart.get(a)[i];
				concArray = concArray.substring(2,concArray.length()); //to get rid of the first ", " probably a better way to write this
				treatmentChartContent.add(concArray);
			}
			
			writeCSV("treatmentChart.csv", treatmentChartContent);
		}
		
		if(paymentInfo != null) //assuming that databases will never be empty at the end, but just in case
		{
			ArrayList<String> paymentInfoContent = new ArrayList<String>();
			
			for(int a = 0; a < paymentInfo.size(); a++)
			{
				String concArray = "";
				for(int i = 0; i < paymentInfo.get(a).length; i++)
					concArray = concArray + ", " + paymentInfo.get(a)[i];
				concArray = concArray.substring(2,concArray.length()); //to get rid of the first ", " probably a better way to write this
				paymentInfoContent.add(concArray);
			}
			
			writeCSV("paymentInfo.csv", paymentInfoContent);
		}
		
		if(report != null) //assuming that databases will never be empty at the end, but just in case
		{
			ArrayList<String> reportContent = new ArrayList<String>();
			
			for(int a = 0; a < report.size(); a++)
			{
				String concArray = "";
				for(int i = 0; i < report.get(a).length; i++)
					concArray = concArray + ", " + report.get(a)[i];
				concArray = concArray.substring(2,concArray.length()); //to get rid of the first ", " probably a better way to write this
				reportContent.add(concArray);
			}
			
			writeCSV("report.csv", reportContent);
		}
	}
    
    public ArrayList<String[]> readCSV(File fileName)
    {
        String line = "";
        String splitBy = ",";
        ArrayList<String[]> values = new ArrayList<String[]>();
        
        try
        {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            while((line = br.readLine()) != null)
            {
                String[] value = line.split(splitBy);
                values.add(value);
            }
            br.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        
        return values;
    }
    
    public void writeCSV(String fileName, ArrayList<String> line)
    {
    	try
    	{
	    	FileWriter writer = new FileWriter(fileName);
	        for(String item : line)
	        	writer.write(item);
	        writer.close();
    	}
    	catch(IOException e)
    	{
    		e.printStackTrace();
    	}
    }
    
    public String getPatientChartData(String identifier, int index)
    {
    	//PaitentChart: 0-SSN, 1-PatientID, 2-Email, 3-PhoneNumber, 4-HealthCondition, 5-Name, 6-Address, 7-InsuranceName, 8-ChartID
        String[] match = null;
        
        for(String[] line : patientChart)
        {
            if(line[0].equals(identifier)) //assuming that all primary keys will be the first item
            {
                match = line;
                break;
            }
        }
        
        if(match == null)
        	return "ERROR";
        else
        	return match[index];
    }
    
    public String getTreatmentChartData(String identifier, int index)
    {
    	//TreatmentChart: 0-ChartID, 1-Height, 2-Weight, 3-BloodPressure, 4-VisitReason, 5-TreatmentContent, 6-Prescription, 7-PatientID
        String[] match = null;
        
        for(String[] line : treatmentChart)
        {
            if(line[0].equals(identifier)) //assuming that all primary keys will be the first item
            {
                match = line;
                break;
            }
        }
        
        if(match == null)
        	return "ERROR";
        else
        	return match[index];
    }
    
    public String getPaymentInfoData(String identifier, int index)
    {
    	//PaymentInfo: 0-ReferenceNumber, 1-Name, 2-Date, 3-Amount, 4-PaymentType, 5-PatientID
        String[] match = null;
        
        for(String[] line : paymentInfo)
        {
            if(line[0].equals(identifier)) //assuming that all primary keys will be the first item
            {
                match = line;
                break;
            }
        }
        
        if(match == null)
        	return "ERROR";
        else
        	return match[index];
    }

    public String getReportData(String identifier, int index)
    {
    	//Report: 0-ReportDate, 1-DoctorName, 2-NumberPatients, 3-AmountEarned
        String[] match = null;
        
        for(String[] line : report)
        {
            if(line[0].equals(identifier)) //assuming that all primary keys will be the first item
            {
                match = line;
                break;
            }
        }
        
        if(match == null)
        	return "ERROR";
        else
        	return match[index];
    }

    public String[] getPatientChartLine(String identifier)
    {
        String[] match = null;
        
        for(String[] line : patientChart)
        {
            if(line[0].equals(identifier)) //assuming that all primary keys will be the first item
            {
                match = line;
                break;
            }
        }
        
        return match;
    }
    
    public String[] getTreatmentChartLine(String identifier)
    {
    	String[] match = null;
        
        for(String[] line : treatmentChart)
        {
            if(line[0].equals(identifier)) //assuming that all primary keys will be the first item
            {
                match = line;
                break;
            }
        }
        
        return match;
    }
    
    public String[] getPaymentInfoLine(String identifier)
    {
    	String[] match = null;
        
        for(String[] line : paymentInfo)
        {
            if(line[0].equals(identifier)) //assuming that all primary keys will be the first item
            {
                match = line;
                break;
            }
        }
        
        return match;
    }
    
    public String[] getReportLine(String identifier)
    {
    	String[] match = null;
        
        for(String[] line : report)
        {
            if(line[0].equals(identifier)) //assuming that all primary keys will be the first item
            {
                match = line;
                break;
            }
        }
        
        return match;
    }
    
    public void addPaitentChart(String SSN, String PatientID, String Email, String PhoneNumber, String HealthCondition, String Name, String Address, String InsuranceName, String ChartID)
    {
    	String[] a = {SSN, PatientID, Email, PhoneNumber, HealthCondition, Name, Address, InsuranceName, ChartID};
    	patientChart.add(a);
    }
    
    public void addTreatmentChart(String ChartID, String Height, String Weight, String BloodPressure, String VisitReason, String TreatmentContent, String Prescription, String PatientID)
    {
    	String[] a = {ChartID, Height, Weight, BloodPressure, VisitReason, TreatmentContent, Prescription, PatientID};
    	treatmentChart.add(a);    	
    }
    
    public void addPaymentInfo(String ReferenceNumber, String Name, String Date, String Amount, String PaymentType, String PatientID)
    {
    	String[] a = {ReferenceNumber, Name, Date, Amount, PaymentType, PatientID};
    	paymentInfo.add(a);    	
    }
    
    public void addReport(String ReportDate, String DoctorName, String NumberPatients, String AmountEarned)
    {
    	String[] a = {ReportDate, DoctorName, NumberPatients, AmountEarned};
    	report.add(a);    	
    }
    
    public void deletePatientChart(String identifier)
    {
    	for(String[] line : patientChart)
        {
            if(line[0].equals(identifier)) //assuming that all primary keys will be the first item
            {
                patientChart.remove(line);
                break;
            }
        }
    }
    
    public void deleteTreatmentChart(String identifier)
    {
    	for(String[] line : treatmentChart)
        {
            if(line[0].equals(identifier)) //assuming that all primary keys will be the first item
            {
                treatmentChart.remove(line);
                break;
            }
        }
    }
    
    public void deletePaymentInfo(String identifier)
    {
    	for(String[] line : paymentInfo)
        {
            if(line[0].equals(identifier)) //assuming that all primary keys will be the first item
            {
            	paymentInfo.remove(line);
                break;
            }
        }
    }
    
    public void deleteReport(String identifier)
    {
    	for(String[] line : report)
        {
            if(line[0].equals(identifier)) //assuming that all primary keys will be the first item
            {
            	report.remove(line);
                break;
            }
        }
    }
    
}
