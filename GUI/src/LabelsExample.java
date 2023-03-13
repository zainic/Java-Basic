import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class LabelsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// JLabel = a GUI display area for a string of text, an image, or both
		
		ImageIcon image = new ImageIcon("logo.png");
		Border border = BorderFactory.createLineBorder(Color.green, 3);
		
		JLabel label = new JLabel(); // create a label
		label.setText("Universitas Brawijaya"); // set text of label
		label.setIcon(image); // insert image
		label.setHorizontalTextPosition(JLabel.CENTER); // set text LEFT, CENTER, RIGHT of image icon
		label.setVerticalTextPosition(JLabel.TOP); // set text UP, CENTER, BOTTOM of image icon
		label.setForeground(new Color(200,100,23)); // set label color
		label.setFont(new Font("Times New Roman", Font.PLAIN, 50)); // set font of label
		label.setIconTextGap(10); // set gap from text to image
		label.setBackground(Color.blue); // set background color
		label.setOpaque(true); // display background color
		label.setBorder(border); // set border
		label.setVerticalAlignment(JLabel.CENTER); // set vertical position text + icon within label
		label.setHorizontalAlignment(JLabel.CENTER); // set horizontal position text + icon within label
		// label.setBounds(0,0,400,500); // set x,y position within frame as well as dimensions
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// frame.setSize(500,500);
		// frame.setLayout(null);
		frame.setVisible(true);
		frame.add(label);
		frame.pack();

	}

}
