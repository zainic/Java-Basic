
public class AbstractKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// abstract = abstract classes cannot be instantiated but they can have subclasses
		//            abstract methods are declared without an implementation
		
		Fruit fruit1 = new Fruit("Apple");
		Fruit fruit2 = new Fruit("Grape");
		
		fruit1.buy();
		fruit2.buy();

	}

}
