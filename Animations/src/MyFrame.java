import javax.swing.*;

public class MyFrame extends JFrame{

	JPanel panel;
	
	MyFrame(){
		
		panel = new MyPanel();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.add(panel);
		this.pack();
		this.setVisible(true);
		
	}
	
}
