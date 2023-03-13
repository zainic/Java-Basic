import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		User user = null;
		
		FileInputStream fileIn = new FileInputStream("C:\\Users\\Dzaky\\eclipse-workspace\\Serialization\\UserInfo.ser");
		ObjectInputStream in = new ObjectInputStream(fileIn);
		user = (User) in.readObject();
		in.close();
		fileIn.close();
		
		user.sayHello();
		
		System.out.println(user.name);
		System.out.println(user.password);
		
		long serialVersion = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
		System.out.println(serialVersion);
	}

}
