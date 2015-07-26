package Question2;

import java.util.Scanner;

/*
 *   What is the correct way to declare a variable to store an integer value in Java?
 *   a. int 1x=10;
 *   b. int x=10;
 * 	c. float x=10.0f;
 * 	d. string x="10";
 * 	Enter your choice: 
 */

public class ChoiceQuestion {

	public static void main(String[] args) {
		ChoiceQuestion CQ = new ChoiceQuestion();
		CQ.Choice();
	}

	public void Choice() {
		Scanner sc = new Scanner(System.in);
		String input = "y";
		while (input.compareTo("y") == 0) {
			System.out.println("What is the correct way to declare a variable to store an integer value in Java?");
			System.out.println("a. int 1x=10");
			System.out.println("b. int x=10");
			System.out.println("c. float x=10.0f");
			System.out.println("d. string x='10'");
			input = sc.nextLine();
			if (input.compareTo("b") == 0)
				System.out.println("Correct!!");
			else {
				System.out.println("Do you want to try again?");
				Scanner sc1 = new Scanner(System.in);
				String input1 = sc1.nextLine();
				if (input1.compareTo("y") == 0)
					Choice();
			}
		}
		sc.close();
	}
}