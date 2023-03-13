import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		// JOptionPane = pop up a standard dialog box that prompts users for a value or informs them of something.
		
		//JOptionPane.showMessageDialog(null, "This is some useless info", "title", JOptionPane.PLAIN_MESSAGE);
		//JOptionPane.showMessageDialog(null, "This is some useless info", "title", JOptionPane.INFORMATION_MESSAGE);
		//JOptionPane.showMessageDialog(null, "This is some useless info", "title", JOptionPane.QUESTION_MESSAGE);
		//JOptionPane.showMessageDialog(null, "This is some useless info", "title", JOptionPane.WARNING_MESSAGE);
		//JOptionPane.showMessageDialog(null, "This is some useless info", "title", JOptionPane.ERROR_MESSAGE);

		int ans1 = JOptionPane.showConfirmDialog(null, "Do you wanna crash your computer?", "Confirmation Box", JOptionPane.YES_NO_CANCEL_OPTION);
		
		System.out.println(ans1);
		
		String name = JOptionPane.showInputDialog("What's your name?");
		
		System.out.println(name);
		
		String[] responses = {"I'll do it anyway", "Well, I guess", "*sweating*"};
		ImageIcon icon = new ImageIcon("twitter.png");
		
		int ans2 = JOptionPane.showOptionDialog(null,
				"Hello "+name+", Just kidding! Your computer would never crash, OR IS IT?",
				"Secret Message",
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.INFORMATION_MESSAGE, 
				icon,
				responses,
				0);
		
		System.out.println(responses[ans2]);
		
	}

}
