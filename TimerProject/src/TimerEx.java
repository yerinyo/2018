import java.util.Timer;
import java.util.TimerTask;

public class TimerEx {
	
	public TimerEx() throws InterruptedException {
		
	
	System.out.println("Hi");
	Timer timer = new Timer(true);
	TimerTask t1 = new TimerEx1();
	TimerTask t2 = new TimerEx2();
	
	timer.schedule(t1, 1000);
	timer.schedule(t2, 5000);
	
	Thread.sleep(7000);
	System.out.println("Bye");
	
	}

}
