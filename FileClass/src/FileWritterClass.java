import java.io.FileWriter;
import java.io.IOException;

public class FileWritterClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileWriter writer = new FileWriter("poem.txt");
			writer.write("Roses are red\nViolets are blue\nEverything become black\nAnd this is fricking true");
			writer.append("\n\n (A Poem by Dzaky)");
			writer.close();
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
