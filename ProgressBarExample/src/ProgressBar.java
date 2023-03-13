
import java.awt.*;
import javax.swing.*;

public class ProgressBar {
	
	JFrame frame = new JFrame("This is example of progress bar");
	JProgressBar bar = new JProgressBar(0,500);
	
	ProgressBar(){
		
		bar.setValue(0);
		bar.setBounds(0,0,420,50);
		bar.setStringPainted(true);
		bar.setFont(new Font("Courier New", Font.BOLD, 20));
		bar.setForeground(Color.red);
		bar.setBackground(Color.black);
		
		frame.add(bar);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
		
		fill();
	}
	
	public void fill() {
		
		Integer counter = 0;
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		while(counter<=500) {
			
			bar.setValue(counter);
			bar.setString(counter + "/500");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			counter += 1;
		}
		
		bar.setString("Done!!");
	}
	
}
