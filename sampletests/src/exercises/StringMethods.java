package exercises;

public class StringMethods {

	public static void main(String[] args) {

		// create a string
		String greet = "Hello Mahesh";
		System.out.println("String: " + greet);

		int length = greet.length();		// get the length of greet
		System.out.println("Length: " + length);

		//-------------------------------------------
		System.out.println("-----------------------------");

		// create first string
		String first = "Mahesh ";
		System.out.println("First String: " + first);

		// create second
		String second = "Bhalke";
		System.out.println("Second String: " + second);

		// join two strings
		String joinedString = first.concat(second);		//Concatenation
		System.out.println("Joined String: " + joinedString);

		//------------------------------------------
		System.out.println("-----------------------------");

		// create 3 strings
		String str1 = "java";
		String str2 = "java";
		String str3 = "python";

		// compare first and second strings
		boolean result1 = str1.equals(str2);		// equals()
		System.out.println("Strings first and second are equal: " + result1);

		// compare first and third strings
		boolean result2 = str1.equals(str3);
		System.out.println("Strings first and third are equal: " + result2);

		//--------------------------------------------
		System.out.println("-----------------------------");

		String str = "Mahi";
		char[] chars = str.toCharArray();		// toCharArray()
		System.out.println(chars);
		for (int i= 0; i< chars.length; i++) {
			System.out.println(chars[i]);
		}

		//-------------------------------------------
		System.out.println("-----------------------------");

		String str11 = "Zeus";
		String str12 = "Chinese";
		String str13 = "American";
		String str14 = "Indian";

		System.out.println(str11.compareTo(str12));		// compairTo()
		//C comes 23 positions before Z, so it will give you 23

		System.out.println(str13.compareTo(str14));
		// I comes 8 positions after A, so it will give you -8

		//----------------------------------------
		System.out.println("-----------------------------");

		String str20 = "Software";
		String str21 = "testing";
		String str22 = "blog";
		System.out.println("testing is a part of Software: " + str20.contains(str21));	// contains()
		System.out.println("blog is a part of Software: " + str20.contains(str22));

		//---------------------------------------
		System.out.println("-----------------------------");

		String str30 = "Thexyzwebsitexyzisxyzsoftwaretestingxyzhelp";
		String[] split = str30.split("xyz");

		for (String obj: split) {
			System.out.println(obj);
		}
		//----------------------------------------
		System.out.println("-----------------------------");

		Integer obj = new Integer(10);
		String str40 = obj.toString();					//toString()
		String str41 = obj.toString(80);
		String str42 = obj.toString(9823, 2); 
		//The above line will represent the String in base 2
		System.out.println("The String representation is " + str40);
		System.out.println("The String representation is " + str41);
		System.out.println("The String representation is " + str42);

		//-----------------------------------------
		System.out.println("-----------------------------");

		String str50 = "plehgnitseterawtfos";
		StringBuffer sb = new StringBuffer(str50);
		sb.reverse();								// reverse()
		System.out.println(sb);

		//------------------------------------------
		System.out.println("-----------------------------");

		String str60 = "Shot";
		String replace = str60.replace('o', 'u');			//replace()
		System.out.println(str60);
		System.out.println(replace);

		//----------------------------------------
		System.out.println("-----------------------------");

		String str70 = "Softwaretestinghelp";
		System.out.println(str70.substring(8,12));
		//It will start from 8th character and extract the substring till 12th character
		System.out.println(str70.substring(15,19));

	}

}
