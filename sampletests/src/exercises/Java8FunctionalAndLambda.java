package exercises;

@FunctionalInterface
interface MyInterface{

 // abstract method
 double getPiValue();
}

public class Java8FunctionalAndLambda {

	public static void main(String[] args) {
		
		// declare a reference to MyInterface
	    MyInterface ref;
	    
	    // lambda expression
	    ref = () -> 3.1415;
	    
	    System.out.println("Value of Pi = " + ref.getPiValue());

	}

}
