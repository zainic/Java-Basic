import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FrameClass extends JFrame implements ActionListener{
	
	JButton button;
	JLabel label;
	
	FrameClass(){
		
		ImageIcon icon = new ImageIcon("twitter_logo.png");
		ImageIcon iconLabel = new ImageIcon("twitter.png");
		
		label = new JLabel();
		label.setIcon(iconLabel);
		label.setBounds(150, 250, 200, 200);
		label.setLayout(null);
		label.setVisible(false);
		
		button = new JButton();
		button.setBounds(150,100,200,100);
		button.setText("PLAY");
		button.setFocusable(false);
		button.setIcon(icon);
		button.setFont(new Font("Arial Black", Font.PLAIN, 20));
		button.setHorizontalTextPosition(JButton.CENTER);
		button.setVerticalTextPosition(JButton.BOTTOM);
		button.setIconTextGap(5);
		button.setForeground(Color.blue);
		button.setBackground(Color.pink);
		button.setBorder(BorderFactory.createRaisedSoftBevelBorder());
		button.addActionListener(this);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(null);
		this.setVisible(true);
		this.add(button);
		this.add(label);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button) {
			System.out.println("Burrrppp....");
			label.setVisible(true);
			button.setEnabled(false);
		}
		
	}
	
}
