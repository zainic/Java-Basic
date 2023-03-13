import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Layout Manager = Defines the natural layout for components within a container
		
		// GridLayout = places components in a grid of cells with same size each.
		
		JFrame frame = new JFrame();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setLayout(new GridLayout(2,4,10,10)); // rows, columns, hgap, vgap
		
		for(int i=1;i<=10;i++) {
			frame.add(new JButton(Integer.toString(i)));
		}
		
		frame.setVisible(true);
		
	}

}
