import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FlowLayoutExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Layout Manager = Defines the natural layout for components within a container
		
		// FlowLayout = places components in a row, sized at their prefered size.
		//				If the horizontal spaces in the container too small,
		//				the FlowLayout class uses the next available row.
		
		JFrame frame = new JFrame();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(100,250));
		panel.setBackground(Color.blue);
		panel.setLayout(new FlowLayout());
		
		for(int i=1;i<=10;i++) {
			panel.add(new JButton(Integer.toString(i)));
		}
		
		frame.add(panel);
		
		frame.setVisible(true);
	}

}
