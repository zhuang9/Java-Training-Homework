package Question3;
/*
 * Examples of use String and StringBuilder
 */

import java.util.Scanner;

public class PalindromicWord {

	public static void main(String[] args) {
		PalindromicWord PW = new PalindromicWord();
		PW.TestPalindromicWord();
	}

	public void TestPalindromicWord() {
		System.out.println("Please enter a word: ");
		Scanner sc = new Scanner(System.in);
		String myWord = sc.nextLine();
		sc.close();
		String[] TestWord = myWord.split("");
		StringBuilder ReverseWord = new StringBuilder();
		for (int i = TestWord.length - 1; i >= 0; i--) {
			ReverseWord = ReverseWord.append(TestWord[i]); //Reverse input word
		}
		if (ReverseWord.toString().equalsIgnoreCase(myWord)) { //Convert StringBuilder to String and compare with input word
			System.out.println("The input word is a palindromic.");
		} else {
			System.out.println("The input word is not a palindromic.");
		}
	}
}