package sampletests;

public class Test16 {

	public static void main(String[] args) {
		
		int x = 10;
		int y = new Test16().change(x);
		System.out.println(x+y);

	}
	int change(int x) {
		x = 12;
		return x;
	}

}
