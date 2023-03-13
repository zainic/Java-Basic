import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;

public class MyPanel extends JPanel{

	Image image;
	
	MyPanel(){
		
		image = new ImageIcon(new ImageIcon("background.png").getImage().getScaledInstance(1920, 540, Image.SCALE_SMOOTH)).getImage();
		this.setPreferredSize(new Dimension(500,500));
		
	}
	
	public void paint(Graphics g) {
		
		Graphics2D g2D = (Graphics2D) g;
		
		g2D.drawImage(image, 0, 0, null);
		
		//g2D.setPaint(Color.blue);
		//g2D.setStroke(new BasicStroke(5));
		//g2D.drawLine(0, 0, 500, 500);
		
		//g2D.setPaint(Color.black);
		//g2D.drawRect(0, 0, 100, 200);
		//g2D.setPaint(Color.red);
		//g2D.fillRect(0, 0, 100, 200);
		
		//g2D.setPaint(Color.orange);
		//g2D.drawOval(0, 0, 200, 300);
		//g2D.setPaint(Color.yellow);
		//g2D.fillOval(0, 0, 200, 300);
		
		//g2D.drawArc(0, 0, 100, 100, 180, 270);
		
		//int[] xPoints = {150,250,400};
		//int[] yPoints = {100,400,300};
		//g2D.setPaint(Color.red);
		//g2D.setStroke(new BasicStroke(4));
		//g2D.drawPolygon(xPoints, yPoints, 3);
		//g2D.setPaint(Color.black);
		//g2D.fillPolygon(xPoints, yPoints, 3);
		
		//g2D.setColor(Color.blue);
		//g2D.setFont(new Font("Ink Free", Font.BOLD, 40));
		//g2D.drawString("Hello World!!", 50, 50);
		
		ArrayList<Integer> x = new ArrayList<Integer>();
		ArrayList<Integer> y = new ArrayList<Integer>();
		
		for(Integer i=0;i<=500;i++) {
			
			x.add(i);
			double rad = (double) (i);
			Integer f = (int) (200 * Math.sin(rad/30) + 200);
			y.add(f);
			
		}
		
		int[] xPoints = new int[x.size()];
		int[] yPoints = new int[y.size()];
		
		for(int i=0;i<x.size();i++) {
			
			xPoints[i] = x.get(i);
			yPoints[i] = y.get(i);
			
		}
		
		g2D.setStroke(new BasicStroke(4));
		g2D.setColor(Color.red);
		g2D.drawPolyline(xPoints, yPoints, x.size());
		
	}

}
