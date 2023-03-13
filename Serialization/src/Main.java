import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		User user = new User();
		
		user.name = "Dzaky";
		user.password = "qwerty123";
		
		FileOutputStream fileOut = new FileOutputStream("UserInfo.ser");
		ObjectOutputStream out = new ObjectOutputStream(fileOut);
		
		out.writeObject(user);
		out.close();
		fileOut.close();
		
		System.out.println("Object info saved.. :D");
		
		long serialVersion = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
		System.out.println(serialVersion);
	}

}
