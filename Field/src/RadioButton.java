import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class RadioButton extends JFrame implements ActionListener{

	JRadioButton maleButton = new JRadioButton("Male");
	JRadioButton femaleButton = new JRadioButton("Female");
	JRadioButton notPublicButton = new JRadioButton("Better Not Public");
	
	ImageIcon xIcon, vIcon;
	
	ButtonGroup group = new ButtonGroup();
	
	RadioButton(){
		
		group.add(maleButton);
		group.add(femaleButton);
		group.add(notPublicButton);
		
		xIcon = new ImageIcon("star_uncollected.png");
		vIcon = new ImageIcon("star_collected.png");
		
		maleButton.addActionListener(this);
		femaleButton.addActionListener(this);
		notPublicButton.addActionListener(this);
		
		maleButton.setSelectedIcon(vIcon);
		femaleButton.setSelectedIcon(vIcon);
		notPublicButton.setSelectedIcon(vIcon);
		
		maleButton.setIcon(xIcon);
		femaleButton.setIcon(xIcon);
		notPublicButton.setIcon(xIcon);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.add(maleButton);
		this.add(femaleButton);
		this.add(notPublicButton);
		this.setTitle("Hello World");
		this.pack();
		this.setVisible(true);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == maleButton) {
			
			System.out.println("You are male");
			
		}
		else if(e.getSource() == femaleButton) {
			
			System.out.println("You are female");
		
		}
		else if(e.getSource() == notPublicButton) {
			
			System.out.println("I don't know what are you");
			
		}
		
	}
	
}
