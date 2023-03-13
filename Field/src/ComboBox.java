import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class ComboBox extends JFrame implements ActionListener{
	
	String[] animals = {"dog", "cat", "bird"};
	
	JComboBox comboBox = new JComboBox(animals);
	
	ComboBox(){
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		comboBox.addActionListener(this);
		comboBox.setEditable(true);
		comboBox.setSize(100, 40);
		comboBox.setFont(new Font("Times New Roman", Font.BOLD, 30));
		System.out.println(comboBox.getItemCount());
		
		comboBox.addItem("Horse");
		comboBox.insertItemAt("Chicken", 1);
		comboBox.setSelectedIndex(3);
		comboBox.removeItem("bird");
		comboBox.removeItemAt(0);
		// comboBox.removeAllItems();
		
		this.add(comboBox);
		this.pack();
		this.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==comboBox) {
			
			String choose = comboBox.getSelectedItem().toString();
			System.out.println(choose);
			System.out.println(comboBox.getSelectedIndex());
			
		}
		
	}

}
