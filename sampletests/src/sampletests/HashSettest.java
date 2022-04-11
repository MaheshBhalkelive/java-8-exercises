package sampletests;

import java.util.HashSet;
import java.util.LinkedList;

public class HashSettest {

	public static void main(String[] args) {
		
		LinkedList<Integer> i = new LinkedList<>();
		i.add(1);
		i.add(3);
		
		System.out.println(i.get(0));
		
		HashSet<String> s = new HashSet<>();
		s.add("m");
		s.add("k");
		
		System.out.println(s.hashCode());
		
		//s.clear();
		
	}

}
