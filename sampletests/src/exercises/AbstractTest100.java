package exercises;

abstract class Animals {
	abstract void makeSound();

	public void eat() {
		System.out.println("I can eat.");
	}
}

class Dogs extends Animals {

	// provide implementation of abstract method
	public void makeSound() {
		System.out.println("Bark bark");
	}
}

public class AbstractTest100 {

	public static void main(String[] args) {

		// create an object of Dog class
		Dogs d1 = new Dogs();

		d1.makeSound();
		d1.eat();

	}

}
