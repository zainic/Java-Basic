
import javax.swing.JFrame;

public class GameFrame extends JFrame{

	GameFrame(){
		
		this.add(new GamePanel());
		this.pack();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
		
	}
	
}
