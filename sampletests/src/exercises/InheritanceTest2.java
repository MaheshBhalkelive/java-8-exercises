package exercises;

class Vehicle {
	protected String brand = "suzuki";

	public void honk() {
		System.out.println("Tuut, tuut!");
	}
}

public class InheritanceTest2 extends Vehicle {

	private String modelName = "Mustang";

	public static void main(String[] args) {

		InheritanceTest2 myFastCar = new InheritanceTest2();
		
		//calling parent class method using child class object
		myFastCar.honk();

		System.out.println(myFastCar.brand + " " + myFastCar.modelName);
	}

}
