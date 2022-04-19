package exercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionMaxMinTest6 {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("one Two three Four five six one three Four".split(" "));
	      System.out.println(list);
	      System.out.println("max: " + Collections.max(list));
	      System.out.println("min: " + Collections.min(list));

	}

}
