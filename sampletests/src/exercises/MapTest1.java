package exercises;

import java.util.HashMap;
import java.util.Iterator;

public class MapTest1 {

	public static void main(String[] args) {
		 // Create a HashMap object called capitalCities
	    HashMap<String, String> capitalCities = new HashMap<String, String>();

	    // Add keys and values (Country, City)
	    capitalCities.put("England", "London");
	    capitalCities.put("Germany", "Berlin");
	    capitalCities.put("Norway", "Oslo");
	    capitalCities.put("USA", "WashingtonDC");
	    
	    System.out.println(capitalCities);
	    
	    
	    //print map using iterator
	    Iterator <String> it = capitalCities.keySet().iterator();  //keyset is a method  
	    while(it.hasNext())  
	    {  
	    String key=(String)it.next();  
	    System.out.println("Country: "+key+"     Capital city: "+capitalCities.get(key));  
	    }  
	    
	    //iteration over map using forEach() method  
	    System.out.println();
	    capitalCities.forEach((k,v) -> System.out.println("Country: "+ k + ", Capital city: " + v));   
	    
	}

}
