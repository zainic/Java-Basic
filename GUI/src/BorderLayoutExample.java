import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class BorderLayoutExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Layout Manager = Defines the natural layout for components within a container
		
		// 3 common managers
		
		// BorderLayout = A BorderLayout places components in five areas: NORTH, SOUTH, WEST, EAST, CENTER.
		//                All extra space is places in center area.
		
		JFrame frame = new JFrame();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setLayout(new BorderLayout(10, 10));
		frame.setVisible(true);
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();
		
		panel1.setBackground(Color.red);
		panel2.setBackground(Color.blue);
		panel3.setBackground(Color.green);
		panel4.setBackground(Color.pink);
		panel5.setBackground(Color.yellow);
		
		panel1.setPreferredSize(new Dimension(100,100));
		panel2.setPreferredSize(new Dimension(50,50));
		panel3.setPreferredSize(new Dimension(50,50));
		panel4.setPreferredSize(new Dimension(100,100));
		panel5.setPreferredSize(new Dimension(100,100));
		
		
		// ---- sub panels ---- //
		
		JPanel panel6 = new JPanel();
		JPanel panel7 = new JPanel();
		JPanel panel8 = new JPanel();
		JPanel panel9 = new JPanel();
		JPanel panel0 = new JPanel();
		
		panel6.setBackground(Color.black);
		panel7.setBackground(Color.gray);
		panel8.setBackground(Color.lightGray);
		panel9.setBackground(Color.magenta);
		panel0.setBackground(Color.white);
		
		panel5.setLayout(new BorderLayout());
		
		panel6.setPreferredSize(new Dimension(20,20));
		panel7.setPreferredSize(new Dimension(20,20));
		panel8.setPreferredSize(new Dimension(20,20));
		panel9.setPreferredSize(new Dimension(20,20));
		panel0.setPreferredSize(new Dimension(20,20));
		
		panel5.add(panel6, BorderLayout.NORTH);
		panel5.add(panel7, BorderLayout.WEST);
		panel5.add(panel8, BorderLayout.EAST);
		panel5.add(panel9, BorderLayout.SOUTH);
		panel5.add(panel0, BorderLayout.CENTER);
		
		// --------------------------
		
		frame.add(panel1, BorderLayout.NORTH);
		frame.add(panel2, BorderLayout.WEST);
		frame.add(panel3, BorderLayout.EAST);
		frame.add(panel4, BorderLayout.SOUTH);
		frame.add(panel5, BorderLayout.CENTER);

	}

}
