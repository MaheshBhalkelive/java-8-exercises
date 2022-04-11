package sampletests;

public class StringTest {

	public static void main(String[] args) {
		
		boolean b; //false
		String s10; // null
		int i; //0
		
	
		
		String s1 = "hello"; //immutable
		String s2 = "hello";
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());

		String s3 = new String("kriti");
		String s4 = new String("kriti");
		String s5 = new String("kriti");
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		
		System.out.println(s3.equals(s4));
		System.out.println(s3==s5);
		
		
		String s7 = "Mahi";
		s7="kriti";
		s7.concat("mahesh");
		System.out.println(s7);
		
		
	}

}
