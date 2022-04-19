package exercises;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionComparatorTest5 {

	public static void main(String[] args) {
		
		List<Integer> ints = Stream.of(1,2,4,5).collect(Collectors.toList());
	    Integer maxInt = ints.stream()
	                              .max(Comparator.comparing(i -> i))
	                              .get();

	    System.out.println("Maximum number in the set is " + maxInt);

		
	}

}
