import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class TextF extends JFrame implements ActionListener{

	JButton button;
	JTextField textField;
	
	TextF(){
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		button = new JButton("Submit");
		button.addActionListener(this);
		
		textField = new JTextField();
		textField.setPreferredSize(new Dimension(450,40));
		textField.setFont(new Font("Courier New", Font.PLAIN, 30));
		textField.setForeground(new Color(100,200,150));
		textField.setBackground(Color.black);
		textField.setCaretColor(Color.white);
		textField.setText("Input your text here..");
		
		this.add(button);
		this.add(textField);
		this.setTitle("Hellow World");
		this.pack();
		this.setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == button) {
			
			String txt = textField.getText();
			button.setEnabled(false);
			System.out.println("This is yout text : "+txt);
			
		}
		
	}

}
