import java.io.File;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file = new File("F:\\Laporan_Dzaky\\Java\\text.txt");
		
		if(file.exists()) {
			System.out.println("That file exists");
			System.out.println(file.getPath());
			System.out.println(file.getAbsolutePath());
			System.out.println(file.isFile());
			System.out.println(file.canRead());
			System.out.println(file.lastModified());
		}
		else {
			System.out.println("That file doesn't exist");
		}
		

	}

}
