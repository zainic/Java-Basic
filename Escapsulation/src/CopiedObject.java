
public class CopiedObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car1 = new Car("Chevrolet", "Camero", 2021);
		Car car2 = new Car("Ford", "Mustang", 2022);
		Car car3 = new Car(car2);
		
		System.out.println(car1);
		System.out.println(car2);
		System.out.println(car3);
		
		car2.copy(car1);
		
		System.out.println(car1);
		System.out.println(car2);
		System.out.println(car3);
		
		System.out.println(car1.getModel());
		System.out.println(car2.getModel());
		System.out.println(car3.getModel());

	}

}
