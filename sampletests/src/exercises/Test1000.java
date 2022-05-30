package exercises;

// find even number an array and print them and find the difference between 
//them and print in one for loop. 
public class Test1000 {

	public static void main(String[] args) {
		
		int[] arr = {10,5,7,17,43,87,14,6};
		int eAddition =0;
		int oAddition =0;
		
		String s1 = "";
		String s2 = "";
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2 == 0) {
				eAddition = eAddition+arr[i];
				s1 = s1+ " " +arr[i];
				
			}else if (arr[i]%2 != 0) {
				oAddition = oAddition+arr[i];
				s2 = s2+ " " +arr[i];
			}		
		}
		System.out.println("even no : " + s1);
		System.out.println("odd no : " + s2);
		
		System.out.println("eAddition :" + eAddition);
		System.out.println("oAddition :" + oAddition);
		
		System.out.println(eAddition - oAddition);

	}

}
