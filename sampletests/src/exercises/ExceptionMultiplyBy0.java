package exercises;

public class ExceptionMultiplyBy0 {

	public static void main(String[] args) {
		
		try {
			int i = 6;
			int j = 0;
			
			int k = i*j;
			System.out.println(k);	// Exception will not be occur
			
		}catch (ArithmeticException e) {
			System.out.println(" can not multiply by 0");
		}

	}

}
