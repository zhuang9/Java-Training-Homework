package Question1B;

import java.util.Scanner;

public class OddEvenDetector {
	protected void oddEvenDetector() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number:");
		int input = sc.nextInt();
		if (input % 2 == 1)
			System.out.println("The input number is odd number.");
		else
			System.out.println("The input number is even number.");
		sc.close();
	}
}