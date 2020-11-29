package project1;

import java.util.Timer;
import java.util.TimerTask;
import java.time.LocalTime;

public class SystemTimer {
	
	private ReportGenerator RG = new ReportGenerator();
	private AppointmentClearer AC = new AppointmentClearer();
	
	public SystemTimer()
	{
		//create a new instance of timer class
		Timer timer = new Timer();
		
		//create an instance of task to be scheduled
		TimerTask generateReport = RG;
		TimerTask clearNoShow = AC;
		
		int dayMS = 86400000; //24hrs in ms
		int nineMS = 75600000; //time from 12AM to 9PM in ms
		int eightMS = 72000000; //time from 12AM to 8PM in ms
		int currentTimeMS = LocalTime.now().getHour() * 3600000 + LocalTime.now().getMinute() * 60000 + LocalTime.now().getSecond() * 1000;
		int delay9 = 0;
		int delay8 = 0;
		
		if(currentTimeMS < nineMS)
			delay9 = nineMS - currentTimeMS;
		else
			delay9 = 14400000 - currentTimeMS + nineMS; //four hours left in day after minus the current time which is between 9PM and 12AM plus the time from 12AM to 9PM
		
		if(currentTimeMS < eightMS)
			delay8 = eightMS - currentTimeMS;
		else
			delay8 = 18000000 - currentTimeMS + eightMS; //five hours left in day after minus the current time which is between 8PM and 12AM plus the time from 12AM to 8PM
		
		//scheduling the timer instance
		timer.schedule(generateReport, delay9, dayMS); 
		timer.schedule(clearNoShow, delay8, dayMS); //minus an hour for 8pm
		
		
		//timer.cancel(); //this is needed at when the program closes to close the timer
	}

}
