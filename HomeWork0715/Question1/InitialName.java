package Question1;

import java.util.Scanner;

public class InitialName {

	public static void main(String[] args) {
		getInitialName();
	}

	public static void getInitialName() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your fullname: ");
		String myFullname = sc.nextLine();
		String[] Fullname = myFullname.split(" ");
		sc.close();
		String[] Firstname = Fullname[0].split("");
		String[] Lastname = Fullname[1].split("");
		System.out.println("Your initial name is: " + Firstname[0]
				+ Lastname[0] + ".");
	}
}