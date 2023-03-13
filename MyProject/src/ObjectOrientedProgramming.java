
public class ObjectOrientedProgramming {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Grocery myGrocery = new Grocery();
		
		System.out.println(myGrocery.item);
		System.out.println(myGrocery.price);
		System.out.println(myGrocery.quantity);
		
		myGrocery.addQuantity(10);
		myGrocery.removeQuantity(4);
		myGrocery.setPrice(6000);

	}

}
