import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CheckBox extends JFrame implements ActionListener{

	JButton button;
	JTextField textField;
	JCheckBox checkBox;
	JPanel panel1, panel2;
	ImageIcon xIcon, checkIcon;
	
	CheckBox(){
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new GridLayout(2,1,0,5));
		
		xIcon = new ImageIcon("star_uncollected.png");
		checkIcon = new ImageIcon("star_collected.png");
		
		panel1 = new JPanel();
		panel2 = new JPanel();
		
		panel1.setBounds(0,0,450,40);
		panel1.setBackground(Color.green);
		panel2.setBounds(0,40,450,40);
		panel2.setBackground(Color.yellow);
		
		button = new JButton("Submit");
		button.addActionListener(this);
		
		textField = new JTextField();
		textField.setFont(new Font("Courier New", Font.PLAIN, 30));
		textField.setForeground(new Color(100,200,150));
		textField.setBackground(Color.black);
		textField.setCaretColor(Color.white);
		textField.setText("Input your text here..");
		
		checkBox = new JCheckBox();
		checkBox.setText("I'm not a robot");
		checkBox.setFocusable(false);
		checkBox.setFont(new Font("Arial Black", Font.PLAIN, 20));
		checkBox.setBackground(Color.yellow);
		checkBox.setIcon(xIcon);
		checkBox.setSelectedIcon(checkIcon);
		
		panel1.add(textField);
		panel1.add(button);
		panel2.add(checkBox);
		this.add(panel1);
		this.add(panel2);
		this.pack();
		this.setTitle("Hellow World");
		this.setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == button && checkBox.isSelected()) {
			
			this.dispose();
			String txt = textField.getText();
			button.setEnabled(false);
			System.out.println("This is yout text : "+txt);
			
		}
		
	}
	
}
