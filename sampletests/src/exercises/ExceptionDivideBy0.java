package exercises;

public class ExceptionDivideBy0 {

	public static void main(String[] args) {
		
		try {
			int i = 9;
			int j = 0;
			
			System.out.println(i/j); 	// Exception will occur at this line 
				
			System.out.println(i*j);	// This line will not be execute 
			
		}catch (ArithmeticException e) {
			System.out.println("Can not devide 0");		// Output 
		}

	}

}
