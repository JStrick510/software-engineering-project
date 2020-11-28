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
Report: ReportDate, NumberPatients, AmountEarned
LogInInfo: EmployeeID, DoctorName, Password, Role
DoctorSchedule: PatientID, Time, EmployeeID, Patient Name
*/

public class DatabaseManager {

    private ArrayList<String[]> patientChart;
    private ArrayList<String[]> treatmentChart;
    private ArrayList<String[]> paymentInfo;
    private ArrayList<String[]> report;
    private ArrayList<String[]> logInInfo;
    private ArrayList<String[]> doctorSchedule;

    private ArrayList<String> currentLogIn;

    public DatabaseManager()
    {
        //initialize arraylists
        patientChart = new ArrayList<String[]>();
        treatmentChart = new ArrayList<String[]>();
        paymentInfo = new ArrayList<String[]>();
        report = new ArrayList<String[]>();
        logInInfo = new ArrayList<String[]>();
        doctorSchedule = new ArrayList<String[]>();

        currentLogIn = new ArrayList<String>();

        //will create new csv for all databases if one doesnt already exist
        File patientChartFile = new File("patientChart.csv");
        File treatmentChartFile = new File("treatmentChart.csv");
        File paymentInfoFile = new File("paymentInfo.csv");
        File reportFile = new File("report.csv");
        File logInFile = new File("logInInfo.csv");
        File doctorScheduleFile = new File("doctorSchedule.csv");
        try
        {
            patientChartFile.createNewFile();
            treatmentChartFile.createNewFile();
            paymentInfoFile.createNewFile();
            reportFile.createNewFile();
            logInFile.createNewFile();
            doctorScheduleFile.createNewFile();
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
        if(logInFile.length() != 0)
            this.logInInfo = readCSV(logInFile);
        if(doctorScheduleFile.length() != 0)
            this.doctorSchedule = readCSV(doctorScheduleFile);
    }

    public ArrayList<String[]> getlogInInfo()
    {
        return new ArrayList<String[]>(logInInfo);
    }
    
    public ArrayList<String[]> getReport()
    {
    	return new ArrayList<String[]>(report);
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
                    concArray = concArray + "," + patientChart.get(a)[i];
                concArray = concArray.substring(1,concArray.length()); //to get rid of the first ", " probably a better way to write this
                concArray = concArray + "\n"; //so next entry is on next line
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
                    concArray = concArray + "," + treatmentChart.get(a)[i];
                concArray = concArray.substring(1,concArray.length()); //to get rid of the first ", " probably a better way to write this
                concArray = concArray + "\n"; //so next entry is on next line
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
                    concArray = concArray + "," + paymentInfo.get(a)[i];
                concArray = concArray.substring(1,concArray.length()); //to get rid of the first ", " probably a better way to write this
                concArray = concArray + "\n"; //so next entry is on next line
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
                    concArray = concArray + "," + report.get(a)[i];
                concArray = concArray.substring(1,concArray.length()); //to get rid of the first ", " probably a better way to write this
                concArray = concArray + "\n"; //so next entry is on next line
                reportContent.add(concArray);
            }

            writeCSV("report.csv", reportContent);
        }

        if(logInInfo != null) //assuming that databases will never be empty at the end, but just in case
        {
            ArrayList<String> logInInfoContent = new ArrayList<String>();

            for(int a = 0; a < logInInfo.size(); a++)
            {
                String concArray = "";
                for(int i = 0; i < logInInfo.get(a).length; i++)
                    concArray = concArray + "," + logInInfo.get(a)[i];
                concArray = concArray.substring(1,concArray.length()); //to get rid of the first ", " probably a better way to write this
                concArray = concArray + "\n"; //so next entry is on next line
                logInInfoContent.add(concArray);
            }

            writeCSV("logInInfo.csv", logInInfoContent);
        }

        if(doctorSchedule != null) //assuming that databases will never be empty at the end, but just in case
        {
            ArrayList<String> doctorScheduleContent = new ArrayList<String>();

            for(int a = 0; a < doctorSchedule.size(); a++)
            {
                String concArray = "";
                for(int i = 0; i < doctorSchedule.get(a).length; i++)
                    concArray = concArray + "," + doctorSchedule.get(a)[i];
                concArray = concArray.substring(1,concArray.length()); //to get rid of the first ", " probably a better way to write this
                concArray = concArray + "\n"; //so next entry is on next line
                doctorScheduleContent.add(concArray);
            }

            writeCSV("doctorSchedule.csv", doctorScheduleContent);
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

    public void addCurrentLogIn(String identifier)
    {
        currentLogIn.add(identifier);
    }

    public void removeCurrentLogIn(String identifier)
    {
        currentLogIn.remove(identifier);
    }

    public boolean checkCurrentLogIn(String identifier)
    {
        boolean loggedIn = false;

        for(String employee : currentLogIn)
        {
            if(employee.equals(identifier))
            {
                loggedIn = true;
                break;
            }
        }

        return loggedIn;
    }

    public ArrayList<String> getCurrentLogIn()
    {
        return new ArrayList<String>(currentLogIn);
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
        //Report: 0-ReportDate, 2-NumberPatients, 3-AmountEarned
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

    public String getLogInInfoData(String identifier, int index)
    {
        //LogInInfo: 0-EmployeeID, 1-DoctorName, 2-Password, 3-Role
        String[] match = null;

        for(String[] line : logInInfo)
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

    public String getEmployeeID(String name)
    {
        //LogInInfo: 0-EmployeeID, 1-Name, 2-Password, 3-Role
        String[] match = null;

        for(String[] line : logInInfo)
        {
            if(line[1].trim().equals(name)) //assuming that all primary keys will be the first item
            {
                return line[0];
            }
        }

        return "ERROR";
    }

    public String getDoctorScheduleData(String identifier, int index)
    {
        //DoctorSchedule: 0-PatientID, 1-Time, 2-EmployeeID, 3 Patient Name
        String[] match = null;

        for(String[] line : doctorSchedule)
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

    public String[] getDoctorScheduleAvailable(String identifier, int index)
    {
        //DoctorSchedule: 0-PatientID, 1-Time, 2-EmployeeID, 3 Patient Name
        String[] match = new String[16];
        int i = 0;
        for(String[] line : doctorSchedule)
        {
            if(line[2].equals(identifier)) //assuming that all primary keys will be the first item
            {
                match[i] = line[index].trim();
                i++;
            }

        }
        return match;
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

    public String[] getLogInInfoLine(String identifier)
    {
        String[] match = null;

        for(String[] line : logInInfo)
        {
            if(line[0].equals(identifier)) //assuming that all primary keys will be the first item
            {
                match = line;
                break;
            }
        }

        return match;
    }

    public String[] getDoctorScheduleLine(String identifier)
    {
        String[] match = null;

        for(String[] line : doctorSchedule)
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

    public void addReport(String ReportDate, String NumberPatients, String AmountEarned)
    {
        String[] a = {ReportDate, NumberPatients, AmountEarned};
        report.add(a);
    }

    public void addLogInInfo(String EmployeeID, String DoctorName, String Password, String Role)
    {
        String[] a = {EmployeeID, DoctorName, Password, Role};
        logInInfo.add(a);
    }

    public void addDoctorSchedule(String PatientID, String Time, String EmployeeID, String patientName)
    {
        String[] a = {PatientID, Time,  EmployeeID, patientName};
        doctorSchedule.add(a);
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

    public void deleteLogInInfo(String identifier)
    {
        for(String[] line : logInInfo)
        {
            if(line[0].equals(identifier)) //assuming that all primary keys will be the first item
            {
                logInInfo.remove(line);
                break;
            }
        }
    }

    public void deleteDoctorSchedule(String identifier)
    {
        for(String[] line : doctorSchedule)
        {
            if(line[0].equals(identifier)) //assuming that all primary keys will be the first item
            {
                doctorSchedule.remove(line);
                break;
            }
        }
    }

}