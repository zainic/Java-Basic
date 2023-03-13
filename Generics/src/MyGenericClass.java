
public class MyGenericClass <Thing, V> {

	Thing x;
	V y;
	
	MyGenericClass(Thing x, V y){
		
		this.x = x;
		this.y = y;
		
	}
	
	public Thing getValue1() {
		
		return x;
		
	}
	
	public V getValue2() {
		
		return y;
		
	}
	
}
