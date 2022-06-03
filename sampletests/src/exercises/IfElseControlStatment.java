package exercises;

import java.util.Scanner;

public class IfElseControlStatment {

	public static void main(String[] args) {
		
		System.out.println("Enter you age..");
		
		Scanner sc = new Scanner(System.in);
		String i = sc.nextLine();
		int age = Integer.parseInt(i);
			
		if(age >= 18) {
			System.out.println("congratulations...");
			System.out.println("person has permission to apply for driving license");
		}else {
			int apply = 18-age;
			System.out.println("you can apply after :" + apply);
			System.out.println("person can not apply for driving license");
		}
		
	}

}
