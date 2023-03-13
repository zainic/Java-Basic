import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame{
	
	MyFrame(){
		
		this.setTitle("JFrame Title"); // set title of frame
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
		this.setResizable(false); // prevent frame to resized
		this.setSize(420,420); // set the x-dim and y-dim
		this.setVisible(true); // show the this
		
		ImageIcon image = new ImageIcon("logo.png");
		this.setIconImage(image.getImage()); // change icon of frame
		this.getContentPane().setBackground(new Color(124,44,89)); // change background in (R,G,B)
		
	}
	
}
