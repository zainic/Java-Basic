
public class MyBoundedClass <Thing extends Number>{

	Thing x;
	
	MyBoundedClass(Thing x){
		
		this.x = x;
		
	}
	
	public Thing getValue() {
		
		return x;
		
	}
	
}
