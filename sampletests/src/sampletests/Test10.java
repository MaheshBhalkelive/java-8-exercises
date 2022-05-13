package sampletests;

public class Test10 {

	public static void main(String[] args) {
		
		int a[] = {1,2,053,4};
		int b[][] = { {1,2,4}, {2,2,1},{0,43,2} };
		System.out.println(a[3]==b[0][2]);
		System.out.println("" + (a[2]==b[2][1]));
		
		System.out.println(a instanceof Object);
	}

}
