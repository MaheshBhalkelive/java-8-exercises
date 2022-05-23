package exercises;

import java.util.Scanner;

/* let’s say, you are working with an airline company 
You are in the luggage check-in department and as per rules, you can allow 15kg per customer.
So now more than 15kg of weight is an abnormal condition for us or in other words its an exception
*/

class WeightLimitExceeded extends Exception{
	
	private static final long serialVersionUID = 1L;

	WeightLimitExceeded(int x){
        System.out.print(Math.abs(15-x)+" kg : ");
    }
}

public class ExceptionCustom  {
	
	 void validWeight(int weight) throws WeightLimitExceeded{
	        if(weight>15)
	            throw new WeightLimitExceeded(weight);
	        else
	            System.out.println("You are ready to fly!");
	    }	

	public static void main(String[] args) {
		
		ExceptionCustom ec=new ExceptionCustom();
		
        Scanner in=new Scanner(System.in);		// 20 , 10, 5
        for(int i=0;i<2;i++){
            try{
            	ec.validWeight(in.nextInt());
            }catch(WeightLimitExceeded e){
                System.out.println(e);
            }
            
        }    
	
	}
}
