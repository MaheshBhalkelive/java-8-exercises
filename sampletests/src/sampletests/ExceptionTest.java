package sampletests;

public class ExceptionTest {

	public static void main(String[] args)   {
		int a = 5;
		int b = 0;
		int c =0;
		try {
			c = a/b;
		}catch (Exception e) {
			// TODO: handle exception
		}catch (NullPointerException e) {
			System.out.println(e);
		}
		
		
		
	}

}
