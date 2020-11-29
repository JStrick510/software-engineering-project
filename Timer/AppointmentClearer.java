package project1;

import java.util.TimerTask;

public class AppointmentClearer extends TimerTask{

	@Override
	public void run() {
		DatabaseManager DBM = new DatabaseManager();
		DBM.wipeSchedule();
		DBM.closeDB();
		
	}

}
