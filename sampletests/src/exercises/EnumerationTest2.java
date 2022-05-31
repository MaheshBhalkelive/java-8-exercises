package exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

public class EnumerationTest2 {

	public static void main(String[] args) {

		List<Integer> Enum = new ArrayList<Integer>();                
		Enum.add(1100);  
		Enum.add(2100);  
		Enum.add(5100);  
		
		//Create Enumeration  
		Enumeration<Integer> en = Collections.enumeration(Enum);  
		System.out.println("The Enumeration List are: ");  
		
		while(en.hasMoreElements()){  
			System.out.println(en.nextElement());  
		}     

	}

}
