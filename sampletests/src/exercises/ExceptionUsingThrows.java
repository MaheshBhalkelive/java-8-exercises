package exercises;

import java.util.Scanner;

public class ExceptionUsingThrows {
	
	static void check(int a,int b) throws ArithmeticException, ArrayIndexOutOfBoundsException{
		   System.out.println(10/a); 
		   int[] arr={1,2,3};
		   System.out.println(arr[b]);
	}

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);		//2 1
		for(int i=0;i<3;i++){
		try{
			check(in.nextInt(),in.nextInt());
		    
    		}catch(ArithmeticException e){
    		   System.out.println("can't divide by zero");
    		}catch(ArrayIndexOutOfBoundsException e){
    		   System.out.println("Out of bounds!");
    		}
		     }
		
	}

}
