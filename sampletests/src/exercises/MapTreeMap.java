package exercises;

import java.util.Map;
import java.util.TreeMap;

public class MapTreeMap {

	public static void main(String[] args) {

		Map<String, Integer> vehicles = new TreeMap<>();

		// Add some vehicles.
		vehicles.put("BMW", 5);
		vehicles.put("Mercedes", 3);
		vehicles.put("Tata", 4);
		vehicles.put("Ford", 10);

		System.out.println("Total vehicles: " + vehicles.size());

		// Iterate over all vehicles, using the keySet method.
		for (String key : vehicles.keySet())
			System.out.println(key + " - " + vehicles.get(key));
		System.out.println();

		System.out.println("Highest key: " + ((TreeMap) vehicles).lastKey());
		System.out.println("Lowest key: " + ((TreeMap) vehicles).firstKey());

		System.out.println("\nPrinting all values:");

		for (Integer val : vehicles.values())
			System.out.println(val);
		System.out.println();

		// Clear all values.
		vehicles.clear();

		// Equals to zero.
		System.out.println("After clear operation, size: " + vehicles.size());


	}

}
