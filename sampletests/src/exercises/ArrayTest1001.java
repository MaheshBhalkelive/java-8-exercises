package exercises;

import java.util.Arrays;

// Sort a numeric array and a string array
public class ArrayTest1001 {

	public static void main(String[] args) {
		
		 int[] my_array1 = {
		            1789, 2035, 1899, 1456, 2013, 
		            1458, 2458, 1254, 1472, 2365, 
		            1456, 2165, 1457, 2456};
		            
		    String[] my_array2 = {
		            "Java",
					
		            "Python",
		            "PHP",
		            "C#",
		            "C Programming",
		            "C++"
		        };   
		    
		    //Original numeric array
		    System.out.println("Original numeric array : "+Arrays.toString(my_array1));
		   
		    //Sorted numeric array
		    Arrays.sort(my_array1);
		    System.out.println("Sorted numeric array : "+Arrays.toString(my_array1));
		    
		    //Original string array
		    System.out.println("Original string array : "+Arrays.toString(my_array2));
		    
		    //Sorted string array
		    Arrays.sort(my_array2);
		    System.out.println("Sorted string array : "+Arrays.toString(my_array2));
		    

	}

}
