package exercises;

class Animal3 {

	  // method in the superclass
	  public void eat() {
	    System.out.println("I can eat");
	  }
	}

	// Dog inherits Animal
	class Dog3 extends Animal3 {

	  // overriding the eat() method
	  @Override
	  public void eat() {

	    // call method of superclass
	    super.eat();
	    System.out.println("I eat dog food");
	  }

	  // new method in subclass
	  public void bark() {
	    System.out.println("I can bark");
	  }
	}

	class InheritanceWithSuper {
	  public static void main(String[] args) {

	    // create an object of the subclass
		  Dog3 d3 = new Dog3();

	    // call the eat() method
		  d3.eat();
		  d3.bark();
	  }
	}
