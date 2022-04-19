package exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionArryListTest3 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		List<Integer> list1 = new ArrayList<>();
		list.add(12);
		list.add(15);
		list.add(3);
		list.add(12);
		list.add(29);
		
		Collections.sort(list);
		System.out.println(list);
		
		Iterator<Integer> itr =  list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
		
		list1 = list.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
		 System.out.println(list1);

	}

}
