package exercises;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

public class EnumerationTest {

	public static void main(String[] args) {
		
		Vector<String> Enum = new Vector<String>();         
        Enum.add("JAVA");  
        Enum.add("JSP");  
        Enum.add("SERVLET");  
        Enum.add("C");  
        Enum.add("PHP");  
        Enum.add("PERL");
        
        //Create Enumeration  
        Enumeration<String> en = Collections.enumeration(Enum);  
        System.out.println("The Enumeration List are: ");  
        
        while(en.hasMoreElements()){  
             System.out.println(en.nextElement());  
        }   

	}

}
