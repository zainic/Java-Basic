import javax.swing.JOptionPane;

public class GUI {

	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog("Enter your name");
		JOptionPane.showMessageDialog(null, "Hello "+name);
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter age"));
		JOptionPane.showMessageDialog(null, "You're "+age+", Right?");
		
		double height = Double.parseDouble(JOptionPane.showInputDialog("Enter Height"));
		JOptionPane.showMessageDialog(null, "Seems like you're "+height+" cm tall");
		
		
	}
}
