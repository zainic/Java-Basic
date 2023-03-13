import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener{

	JMenuBar menuBar;
	JMenu fileMenu, editMenu, helpMenu;
	JMenuItem loadItem, saveItem, exitItem;
	ImageIcon loadIcon, saveIcon, exitIcon;
	
	MyFrame(){
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(new FlowLayout());
		
		menuBar = new JMenuBar();
		
		loadIcon = new ImageIcon("e1277.png");
		saveIcon = new ImageIcon("e1274.png");
		exitIcon = new ImageIcon("e2327.png");
		
		loadIcon = new ImageIcon(loadIcon.getImage().getScaledInstance(24, 24, Image.SCALE_SMOOTH));
		saveIcon = new ImageIcon(saveIcon.getImage().getScaledInstance(24, 24, Image.SCALE_SMOOTH));
		exitIcon = new ImageIcon(exitIcon.getImage().getScaledInstance(24, 24, Image.SCALE_SMOOTH));
		
		fileMenu = new JMenu("File");
		editMenu = new JMenu("Edit");
		helpMenu = new JMenu("Help");
		
		loadItem = new JMenuItem("Load");
		saveItem = new JMenuItem("Save");
		exitItem = new JMenuItem("Exit");
		
		loadItem.addActionListener(this);
		saveItem.addActionListener(this);
		exitItem.addActionListener(this);
		
		fileMenu.setMnemonic(KeyEvent.VK_F); // f for load
		editMenu.setMnemonic(KeyEvent.VK_E); // e for save
		helpMenu.setMnemonic(KeyEvent.VK_H); // h for exit
		
		loadItem.setMnemonic(KeyEvent.VK_L); // l for load
		saveItem.setMnemonic(KeyEvent.VK_S); // s for save
		exitItem.setMnemonic(KeyEvent.VK_E); // e for exit
		
		loadItem.setIcon(loadIcon);
		saveItem.setIcon(saveIcon);
		exitItem.setIcon(exitIcon);
		
		fileMenu.add(loadItem);
		fileMenu.add(saveItem);
		fileMenu.add(exitItem);
		
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(helpMenu);
		
		this.setJMenuBar(menuBar);
		this.setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource()==loadItem) {
			
			System.out.println("You are loaded a file");
			
		}
		else if(e.getSource()==saveItem) {
			
			System.out.println("You are saving a file");
		
		}
		else if(e.getSource()==exitItem) {
			
			System.out.println("You are exitting the file");
			System.exit(0);
			
		}
		
	}

	
	
}
