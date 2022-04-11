package sampletests;

import java.util.ArrayList;
import java.util.List;

public class FilterSample1 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(3);
		list.add(234);
		list.add(37);
		list.add(2);
		list.add(2006);
		
		 list.stream().filter(i -> i % 2 == 0).forEach(i->System.out.println("even numbers from array list is : "+ i));
		
		 
	}

}
