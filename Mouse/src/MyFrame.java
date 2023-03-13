
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame implements MouseListener{

	JLabel label;
	
	MyFrame(){
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(null);
		
		label = new JLabel();
		label.setBounds(200,200,100,100);
		label.setBackground(Color.red);
		label.setOpaque(true);
		label.addMouseListener(this);
		
		this.add(label);
		this.getContentPane().setBackground(Color.black);
		this.setVisible(true);
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// Invoked when the mouse button has been clicked (pressed and released) on a component
		System.out.println("You clicked the red button");
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// Invoked when a mouse button has been pressed on a component
		System.out.println("You pressed the red button");
		label.setBackground(Color.pink);
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// Invoked when a mouse button has been released on a component
		System.out.println("You released the red button");
		label.setBackground(Color.black);
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// Invoked when a mouse button has been entered on a component
		System.out.println("You entered the red button");
		label.setBackground(Color.blue);
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// Invoked when a mouse button has been exited on a component
		System.out.println("You exited the red button");
		label.setBackground(Color.yellow);
		
	}
	
}
