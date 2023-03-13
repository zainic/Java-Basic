import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class Main {

	public static void main(String[] args) {

		Timer timer = new Timer();
		
		TimerTask task = new TimerTask() {

			int counter = 0;
			
			@Override
			public void run() {
				
				System.out.println("Task number " + counter + " is Completed");
				counter++;
				
				if(counter>10) {
					
					timer.cancel();
					System.out.println("Congratulation your tasks are completed");
					
				}
			}
			
		};
		
		Calendar date = Calendar.getInstance();
		date.set(Calendar.YEAR, 2022);
		date.set(Calendar.MONTH, Calendar.AUGUST);
		date.set(Calendar.DAY_OF_MONTH, 7);
		date.set(Calendar.HOUR_OF_DAY, 9);
		date.set(Calendar.MINUTE, 6);
		date.set(Calendar.SECOND, 0);
		date.set(Calendar.MILLISECOND, 0);
		
		// timer.schedule(task, 1000);
		// timer.schedule(task, date.getTime());
		timer.scheduleAtFixedRate(task, 1000, 100);
		
	}

}
