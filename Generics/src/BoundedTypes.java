
public class BoundedTypes {

	public static void main(String[] args) {

		MyBoundedClass<Integer> myInt = new MyBoundedClass<>(1);
		MyBoundedClass<Double> myDouble = new MyBoundedClass<>(3.14);
		// MyBoundedClass<Character> myChar = new MyBoundedClass<>('#');
		// MyBoundedClass<String> myString = new MyBoundedClass<>("Hello");

		System.out.println(myInt.getValue());
		System.out.println(myDouble.getValue());
		// System.out.println(myChar.getValue());
		// System.out.println(myString.getValue());

	}

}
