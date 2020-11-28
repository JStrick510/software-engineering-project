package project1;

import java.util.*;
import java.text.DateFormat;  
import java.text.SimpleDateFormat;  

public class ReportGenerator extends TimerTask{
	
	
	private int visits = 0;
	private double money = 0;
	
	@Override
	public void run() {
		DatabaseManager DBM = new DatabaseManager();
		
		//get the date
		Date date = Calendar.getInstance().getTime();  
        DateFormat dateFormat = new SimpleDateFormat("mm-dd-yyyy");  
        String strDate = dateFormat.format(date);   
		
		DBM.addReport(strDate, Integer.toString(visits), Double.toString(money));
		
		DBM.closeDB();
		
		this.visits = 0;
		this.money = 0;
		
		System.out.println("test");
	}
	
	public void addPatient()
	{
		this.visits++;
	}
	
	public void addMoney(double moneyMade)
	{
		this.money+=moneyMade;
		
	}

}
