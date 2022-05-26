package exercises;


//Java program to convert object into primitives  
//Unboxing example of Integer to int  
public class WrapperClassWithUnboxing {

	public static void main(String[] args) {
		
		//Converting Integer to int    
		Integer a=new Integer(3);    
		
		//converting Integer to int explicitly 
		int i=a.intValue(); 
		
		int j=a;//unboxing, now compiler will write a.intValue() internally    
		    
		System.out.println(a+" "+i+" "+j);    

	}

}
