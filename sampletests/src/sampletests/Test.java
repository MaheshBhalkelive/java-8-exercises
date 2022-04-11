package sampletests;

import java.util.Scanner;

interface A1 {
void calculate(int number, int b);
}

public class Test {
public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
		System.out.println("enter any choice");
		System.out.println("1. check Even\n2. Check Odd\n3. check prime");
			int a1 = sc.nextInt();
				System.out.println("Enter number");
			int a2 = sc.nextInt();
				A1 obj = (number,b) -> {
					while (number < 5) {
						switch (number) {
						case 1:
							if (b % 2 == 0)
								System.out.println(b + " is even");
							else
								System.out.println(b + " is not even");
							break;
						case 2:
							if (b % 2 != 0)
								System.out.println(b + " is odd");
							else
									System.out.println(b + " not odd");
							break;
						case 3:
							int i, m = 0, flag = 0;
							m = b / 2;
							if (b == 0 || b == 1)
								System.out.println(b + " is not prime number");
							else {
								for (i = 2; i <= m; i++) {
									if (b % i == 0) {
										System.out.println(b + " is not prime number");
										flag = 1;
							break;
									}
								}
								if (flag == 0)
									System.out.println(b + " is prime number");
							}
							break;
						
						default:
							System.out.println("incorrect no");
							break;
						}
					//	System.out.println("1. check Even\n2. Check Odd\n3. check prime");
						number=sc.nextInt();
					}


				};
				obj.calculate(a1, a2);
	}
}
