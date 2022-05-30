package exercises;

import java.util.Arrays;

//Form the largest number from a given list of non negative integers using java 8 features

public class ArrayTest1002 {
	
	public static String  largest_Numbers(int[] num) {
		
        String[] array_nums = Arrays.stream(num).mapToObj(String::valueOf).toArray(String[]::new);
        
        Arrays.sort(array_nums, (String str1, String str2) -> (str2 + str1).compareTo(str1 + str2));
        
        return Arrays.stream(array_nums).reduce((a, b) -> a.equals("0") ? b : a + b).get();
    }	
	

	public static void main(String[] args) {
		
		 {
			    int[] nums = {1, 2, 3, 0, 4, 6};
				System.out.printf("\nOriginal array: "+Arrays.toString(nums));	
				System.out.printf("\nLargest number using the said array numbers: "+largest_Numbers(nums));
			   } 

	}

}
