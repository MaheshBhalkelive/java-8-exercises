package exercises;

abstract class MotorBike {
	abstract void brake();
}

class SportsBike extends MotorBike {

	// implementation of abstract method
	public void brake() {
		System.out.println("Drum breake");
	}
}

class MountainBike extends MotorBike {

	// implementation of abstract method
	public void brake() {
		System.out.println("ABS Disc breake");
	}
}

public class AbstractTest102 {

	public static void main(String[] args) {

		MountainBike m1 = new MountainBike();
		m1.brake();
		SportsBike s1 = new SportsBike();
		s1.brake();

	}

}
