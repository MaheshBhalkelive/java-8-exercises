package exercises;

/*
 * public class Test102 {
 * 
 * public final static int i = 10;
 * 
 * public static void main(String[] args) {
 * 
 * System.out.println(" i = " + i);
 * 
 * }
 * 
 * }
 */

public class Test102 {

	public final int i;
	
	public Test102(int i) {
		this.i = i;
	}
	
	public static void main(String[] args) {
		
		Test102 t = new Test102(10);
		System.out.println(" i = " + t.i);

	}

}