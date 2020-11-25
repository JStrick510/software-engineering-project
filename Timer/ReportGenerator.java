package project1;

import java.util.*;
import java.text.DateFormat;  
import java.text.SimpleDateFormat;  

public class ReportGenerator extends TimerTask{
	
	private ArrayList<String> doctors = new ArrayList<>();
	private ArrayList<Integer> visits = new ArrayList<>();
	private ArrayList<Integer> money = new ArrayList<>();
	
	@Override
	public void run() {
		DatabaseManager DBM = new DatabaseManager();
		
		//get the date
		Date date = Calendar.getInstance().getTime();  
        DateFormat dateFormat = new SimpleDateFormat("mm-dd-yyyy");  
        String strDate = dateFormat.format(date);   
		
		for(int i = 0; i < doctors.size(); i++)
		{
			DBM.addReport(strDate, doctors.get(i), Integer.toString(visits.get(i)), Integer.toString(money.get(i)));
		}
		
		DBM.closeDB();
		
		doctors.clear();
		visits.clear();
		money.clear();
		
		System.out.println("test");
	}
	
	public void addPatientDoctor(String doctorName)
	{
		if(doctors.contains(doctorName))
			visits.set(doctors.indexOf(doctorName), visits.get(doctors.indexOf(doctorName)) + 1);
		else
		{
			doctors.add(doctorName);
			visits.add(1);
			money.add(0);
		}
		
	}
	
	public void addMoneyDoctor(String doctorName, int moneyMade)
	{
		if(doctors.contains(doctorName))
			money.set(doctors.indexOf(doctorName), money.get(doctors.indexOf(doctorName)) + moneyMade);
		else
		{
			doctors.add(doctorName);
			visits.add(0);
			money.add(moneyMade);
		}
		
	}

}
