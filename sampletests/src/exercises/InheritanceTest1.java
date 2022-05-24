package exercises;

class Animal {

	  // field and method of the parent class
	  String name;
	  public void eat() {
	    System.out.println("I can eat");
	  }
	}

	// inherit from Animal
	class Dog extends Animal {

	  // new method in subclass
	  public void display() {
	    System.out.println("My name is " + name);
	  }
	}

public	class InheritanceTest1 {
	  public static void main(String[] args) {

	    // create an object of the subclass
	    Dog d = new Dog();

	    // access field of superclass
	    d.name = "Monty";
	    d.display();

	    // call method of superclass
	    // using object of subclass
	    d.eat();

	  }
	}