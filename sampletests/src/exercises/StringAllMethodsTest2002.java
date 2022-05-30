package exercises;

public class StringAllMethodsTest2002 {

	public static void main(String[] args) {

		//trim spaces in the given string
		String str = "  My Name is Mahesh   ";
		System.out.println(str.trim());

		System.out.println("--------------------------------------");
		//convert Character array to String object
		char ch[] = {'M','y',' ','J','a','v','a',' ','e','x','a','m','p','l','e'};
		// We can copy a char array to a string by using copyValueOf() method. 
		String chStr = String.copyValueOf(ch);
		System.out.println(chStr);
		// We can also copy only range of characters in a char array by copyValueOf() method.
		String subStr = String.copyValueOf(ch,3,4);
		System.out.println(subStr);   

		System.out.println("--------------------------------------");
		// concat two Strings in java
		String b = "Come on ";
		String c = "man";

		// We can do string concatenation by two ways.One is by using '+' operator, shown below.
		String d = b+c;
		System.out.println(d);
		//Another way is by using concat() method,which appends the specified string at the end.
		d = b.concat(c);
		System.out.println(d);

		System.out.println("--------------------------------------");
		//split a string with a delimiter in java
		String str5 = "This program splits a string based on space";
		String[] tokens = str5.split(" ");
		for(String s:tokens){
			System.out.println(s);
		}
		str5 = "This     program  splits a string based on space";
		tokens = str5.split("\\s+");

		System.out.println("--------------------------------------");
		//change case of a string characters
		String str6 = "Change My Case";
		System.out.println("Upper Case: "+str6.toUpperCase());
		System.out.println("Lower Case: "+str6.toLowerCase());


		System.out.println("--------------------------------------");
		// two stringsSSSSS
		String str1 = "Mahi";
		String str2 = "Mahesh";
		String str3 = "Gao";
		String str4 = "India";

		System.out.println(str1.compareTo(str2));
		//C comes 23 positions before Z, so it will give you 23
		System.out.println(str3.compareTo(str4));
		// I comes 8 positions after A, so it will give you -8

		System.out.println("--------------------------------------");
		// replace string
		String s1="Hey, welcome to mumbai"; 
		String replaceString=s1.replace("mumbai","gao"); 
		System.out.println(replaceString); 

		System.out.println("--------------------------------------");
		// convert double to string
		//double value
		double dnum = 99.9999;  
		//convert double to string using valueOf() method
		String str8 = String.valueOf(dnum);  
		//displaying output string after conversion
		System.out.println("My String is: "+str8);  
		
		System.out.println("--------------------------------------");
		// convert string to boolean
	      String str9 = "false";
	      // Case does not matter for conversion
	      String str10 = "TrUe";
		   
	      // String to boolean conversion
	      boolean bvar = Boolean.parseBoolean(str9);
	      boolean bvar2 = Boolean.parseBoolean(str10);
		    
	      // Displaying boolean values
	      System.out.println("boolean value of String str is: "+bvar);
	      System.out.println("boolean value of String str2 is: "+bvar2);

	}

}
