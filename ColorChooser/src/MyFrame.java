
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener{

	JButton button;
	JLabel label;
	
	MyFrame(){
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(null);
		
		button = new JButton("Change Color");
		button.setBounds(150,50,200,50);
		button.addActionListener(this);
		
		label = new JLabel();
		label.setBackground(Color.white);
		label.setText("This is your color");
		label.setFont(new Font("MV Boli", Font.PLAIN, 50));
		label.setOpaque(true);
		label.setBounds(0,150,500,200);
		label.setHorizontalAlignment(JLabel.CENTER);
		
		this.add(button);
		this.add(label);
		this.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==button) {
			
			JColorChooser colorChooser = new JColorChooser();
			Color color;
			color = JColorChooser.showDialog(null, "Choose a color", label.getForeground());
			label.setForeground(color);
			color = JColorChooser.showDialog(null, "Choose a color", label.getBackground());
			label.setBackground(color);
			
		}
		
	}
	
}
