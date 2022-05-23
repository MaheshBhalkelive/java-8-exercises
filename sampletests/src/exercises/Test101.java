package exercises;

import java.util.Scanner;

public class Test101 {

	public String os1 = "windows" ;
	public String os2 = "IOS";
	
	public void updateSoftware( String os) {
	
		if(os.equals(os1)) { 
			System.out.println("Update chrome.apk");
		}else if (os.equals(os2)) {
			System.out.println("Update chrome.ios");
		}else {
			System.out.println("this is not valid OS");
		}
	}
	public static void main(String[] args) {	
		System.out.println("Select Opertating System");
		System.out.println("1. windows  2. IOS");

		Scanner sc = new Scanner(System.in);
		String operate = sc.nextLine();
		
		Test101 t1 = new Test101();
		t1.updateSoftware(operate);	
	}	
}
