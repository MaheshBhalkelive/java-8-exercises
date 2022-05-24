package exercises;

class Animal2 {

	  // method in the superclass
	  public void eat() {
	    System.out.println("I can eat");
	  }
	}

	// Dog inherits Animal
	class Dog2 extends Animal2 {

	  // overriding the eat() method
	  @Override
	  public void eat() {
	    System.out.println("I eat dog food");
	  }

	  // new method in subclass
	  public void bark() {
	    System.out.println("I can bark");
	  }
	}

	class InheritanceMethodOverriding {
	  public static void main(String[] args) {

	    // create an object of the subclass
	    Dog2 d2 = new Dog2();

	    // call the eat() method
	    d2.eat();
	    d2.bark();
	  }
	}
