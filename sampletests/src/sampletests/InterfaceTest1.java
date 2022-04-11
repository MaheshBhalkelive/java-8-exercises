package sampletests;

interface InterfaceTest {
	
	public void add();
	public static void divide() {
		System.out.println("I am dividing");
	}

}

public class InterfaceTest1 {

	public void add() {
		System.out.println("I am adding");
		
	}
	
	public static void main(String[] args) {
		InterfaceTest1 r = new InterfaceTest1();
		InterfaceTest.divide();
		r.add();
		
		
		
	}

}
