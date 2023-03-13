import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class FrameClassShortcut extends JFrame{
	
	JButton button;
	
	FrameClassShortcut(){
		
		ImageIcon icon = new ImageIcon("twitter_logo.png");
		
		button = new JButton();
		button.setBounds(150,100,200,100);
		button.setText("PLAY");
		button.setFocusable(false);
		button.setIcon(icon);
		button.setFont(new Font("Arial Black", Font.PLAIN, 20));
		button.addActionListener(e -> System.out.println("Burpp...")); // Shortcut with lambda function
		// it's like "lambda x : function(x)" in Python
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(null);
		this.setVisible(true);
		this.add(button);
	}
	
}
