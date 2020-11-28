package project1;

import java.util.Timer;
import java.util.TimerTask;
import java.time.LocalTime;

public class ReportManager {
	
	private ReportGenerator RG = new ReportGenerator();
	
	public ReportManager()
	{
		//create a new instance of timer class
		Timer timer = new Timer();
		
		//create an instance of task to be scheduled
		TimerTask task = RG;
		
		int dayMS = 86400000; //24hrs in ms
		int nineMS = 75600000; //time from 12AM to 9PM in ms
		int currentTimeMS = LocalTime.now().getHour() * 3600000 + LocalTime.now().getMinute() * 60000 + LocalTime.now().getSecond() * 1000;
		int delay = 0;
		
		if(currentTimeMS < nineMS)
			delay = nineMS - currentTimeMS;
		else
			delay = 14400000 - currentTimeMS + nineMS; //four hours left in day after minus the current time which is between 9PM and 12AM plus the time from 12AM to 9PM
		
		//scheduling the timer instance
		timer.schedule(task, delay, dayMS); 
		
		//timer.cancel(); //this is needed at when the program closes to close the timer
	}
	

}
