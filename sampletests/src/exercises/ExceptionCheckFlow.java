package exercises;

public class ExceptionCheckFlow {

	public static void main(String[] args) {

		try{
			/*
			 * int i = 87; int j = 0; System.out.println(i/j);	
			 */		// condition 1
			
			try{
				int[] a={1,2,3};
				System.out.println(a[3]);
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Out of bounds");
			}
			
			  int i = 87; int j = 0; 
			  System.out.println(i/j);		// condition 2
			 		
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException : divide by 0");
		}
		finally {
			System.out.println("I will Alsays Execute");
		}
	}

}
