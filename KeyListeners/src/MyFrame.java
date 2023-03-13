
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame implements KeyListener{

	JLabel label;
	ImageIcon icon;
	
	MyFrame(){
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(null);
		
		icon = new ImageIcon("ship.png");
		
		label = new JLabel();
		label.setBounds(0,0,64,64);
		label.setIcon(icon);
		// label.setBackground(Color.red);
		// label.setOpaque(true);
		
		this.getContentPane().setBackground(Color.black);
		this.add(label);
		this.addKeyListener(this);
		this.setVisible(true);
		
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// KeyTyped = Invoked when a key is typed. Uses KeyChar, char output.
		switch(e.getKeyChar()) {
			case 'a': label.setLocation(label.getX()-5,label.getY());break;
			case 'd': label.setLocation(label.getX()+5,label.getY());break;
			case 's': label.setLocation(label.getX(),label.getY()+5);break;
			case 'w': label.setLocation(label.getX(),label.getY()-5);break;
		}
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// KeyPressed = Invoked when a physical key is pressed down. Uses KeyCode, int output.
		switch(e.getKeyCode()) {
			case 37: label.setLocation(label.getX()-5,label.getY());break;
			case 39: label.setLocation(label.getX()+5,label.getY());break;
			case 40: label.setLocation(label.getX(),label.getY()+5);break;
			case 38: label.setLocation(label.getX(),label.getY()-5);break;
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// KeyReleased = called whatever button is released.
		System.out.println("You released key char : "+e.getKeyChar());
		System.out.println("You released key code : "+e.getKeyCode());
		
	}
	
}
