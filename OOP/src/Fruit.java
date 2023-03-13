
public class Fruit extends Shop{

	String name;
	
	Fruit(String name){
		
		this.name = name;
		
	}
	
	@Override
	void buy() {
		
		System.out.println("Somebody buy "+this.name+" fruit");
		
	}

}
