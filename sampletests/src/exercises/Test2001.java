package exercises;


public class Test2001 {

	public static void main(String[] args) {
		String[] str = {"1","2","3"};
		int[] values = new int[str.length];
		int sum=0;
		int i = 0;
		for(String s : str) {
			System.out.println(s);
			values [i] = Integer.parseInt(str[i]);
			sum=sum+values[i];
			i++;
		}


		/*
		 * for(int i = 0;i<=str.length-1;i++) { values [i] = Integer.parseInt(str[i]);
		 * sum=sum+values[i];
		 * 
		 * }
		 */
		System.out.println(sum);




	}

}
