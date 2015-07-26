package Question2;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		//WithoutStringBuilder();
		WithStringBuilder();
	}

	public static void WithoutStringBuilder() {
		System.out.println("Please enter a string: ");
		Scanner sc = new Scanner(System.in);
		String myString = sc.nextLine();
		String[] myString1 = myString.split("");
		String myString2 = new String();
		for (int i = myString1.length - 1; i >= 0; i--) {
			myString2 += myString1[i];
		}
		System.out.print("The reversed string is: " + myString2 + " ");
		sc.close();
	}

	public static void WithStringBuilder() {
		System.out.println("Please enter a string: ");
		Scanner sc = new Scanner(System.in);
		String myString = sc.nextLine();
		StringBuilder myString1 = new StringBuilder(myString);
		System.out.println("The reversed string is: " + myString1.reverse());
		sc.close();
	}
}
