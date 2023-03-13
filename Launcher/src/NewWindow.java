import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class NewWindow {
	
	JFrame frame = new JFrame();
	JLabel label = new JLabel("Hello world");
	
	NewWindow(){
		
		label.setBounds(200,100,100,50);
		label.setFont(new Font(null, Font.PLAIN, 25));
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.add(label);
		frame.setLayout(null);
		frame.setVisible(true);
		
	}

}
