
public class Grocery {
	
	String item = "bread";
	double price = 5000.00;
	int quantity = 20;
	
	void addQuantity(int number) {
		quantity += number;
		System.out.printf("Now we have %d of %s \n", quantity, item);
	}
	
	void removeQuantity(int number) {
		quantity -= number;
		System.out.printf("Now we have %d of %s \n", quantity, item);
	}
	
	void setPrice(double newPrice) {
		price = newPrice;
		System.out.printf("The price is now %,2f rupiahs\n", price);
	}

}
