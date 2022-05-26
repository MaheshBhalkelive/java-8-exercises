package exercises;

 class A 
{ 
	public Object m1()
	{ 
		System.out.println("Hello, this is a superclass"); 
		return null; 
	} 
} 

 class B extends A
{ 
	@Override 
	public String m1() 
	{ 
		System.out.println("Hello, this is the subclass"); 
		return null; 
	} 
} 

public class CovarentReturnTypeTest100  {

	public static void main(String[] args) {

		 B b = new B(); 
	      b.m1(); 
	     A a = new B(); 
	      a.m1(); 
		
	}

}
