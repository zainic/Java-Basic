import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyPanel extends JPanel implements ActionListener{

	final int PANEL_WIDTH = 500;
	final int PANEL_HEIGHT = 500;
	Image ship;
	Image backgroundImage1, backgroundImage2;
	Timer timer;
	int vI = 3;
	int i = 0;
	int vX = 2;
	int vY = 1;
	int x = 0;
	int y = 0;
	
	MyPanel(){
		
		this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
		this.setBackground(Color.black);
		ship = new ImageIcon("ship.png").getImage();
		backgroundImage1 = new ImageIcon("background.png").getImage();
		backgroundImage2 = new ImageIcon("background.png").getImage();
		timer = new Timer(10, this);
		timer.start();
		
	}
	
	public void paint(Graphics g) {
		
		super.paint(g);
		
		Graphics2D g2D = (Graphics2D) g;
		
		g2D.drawImage(backgroundImage1, 0, i, null);
		g2D.drawImage(backgroundImage2, 0, i + backgroundImage1.getHeight(null), null);
		g2D.drawImage(ship, x, y, null);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(x >= PANEL_WIDTH - ship.getWidth(null) || x < 0) {
			vX = - vX;
		}
		
		if(y >= PANEL_HEIGHT - ship.getHeight(null) || y < 0) {
			vY = - vY;
		}
		
		if(i <= - backgroundImage1.getHeight(null)) {
			i = 0;
		}
		
		i = i - vI;
		x = x + vX;
		y = y + vY;
		repaint();
	}
	
	
	
}
