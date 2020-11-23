package Timer;

public class Timer
{
    private java.util.Timer timer;

    Timer()
    {
        timer = new java.util.Timer();
        timer.schedule(generateReport(), );
        timer.schedule(clearAppointments(), );
    }

    private void generateReport()
    {

    }

    private void clearAppointments()
    {

    }
}
