package project1;

import java.util.*;
import java.text.DateFormat;  
import java.text.SimpleDateFormat;  

public class ReportGenerator extends TimerTask{

	@Override
	public void run() {
		DatabaseManager DBM = new DatabaseManager();
		
		//get the date
		Date date = Calendar.getInstance().getTime();  
        DateFormat dateFormat = new SimpleDateFormat("mm-dd-yyyy");  
        String strDate = dateFormat.format(date); 
        
        String[] info = DBM.getDailyInfo();
		
		DBM.addReport(strDate, info[0], info[1]);
		
		DBM.resetDailyInfo();
		
		DBM.closeDB();
		
		System.out.println("test");
	}

}
