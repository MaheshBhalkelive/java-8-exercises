package exercises;

// condition 1
public class ExceptionaParentChild {

	public static void main(String[] args) {
		
		 int i = 23;
		 int j = 0;
		
		 	try{
	            System.out.println(i/j);
	        }catch(Exception e)
	        {
	            System.out.println("Exception : divide by 0");
	        }catch(ArithmeticException e)
	        {
	            System.out.println("ArithmeticException :divide by 0");
	        }
		 	
			/*
			 * try{ System.out.println(i/j); }catch(Exception e) {
			 * System.out.println("Exception : divide by 0"); }catch(ArithmeticException e)
			 * { System.out.println("ArithmeticException :divide by 0"); }
			 */
	}

}
