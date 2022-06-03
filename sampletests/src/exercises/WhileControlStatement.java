package exercises;

import java.util.Scanner;

public class WhileControlStatement {

	public static void main(String[] args) {
		
		System.out.println("enter your age ....");
		
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int age = Integer.parseInt(input);
		
		switch (age) {
		case 18: System.out.println("you can vote now...");
			
			break;

			case 10 : System.out.println("you can not vote");
			
		default:System.out.println("your age should be above 18 for voting..");
			break;
		}
		
	

	}

}
