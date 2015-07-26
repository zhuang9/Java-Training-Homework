package Question3;

import java.util.Scanner;

/*
 * 3. Write a Java program that determines a student’s grade. The program will read three types 
 * of scores(quiz, mid-term, and final scores) and determine the grade based on the following rules:
 * -if the average score >=90% =>grade=A
 * -if the average score >= 70% and <90% => grade=B
 * -if the average score>=50% and <70% =>grade=C
 * -if the average score<50% =>grade=F                                                                                                              
 * 
 * See the example output below:
 * 
 * Quiz score: 80
 * 
 * Mid-term score: 68
 * 
 * Final score: 90
 * 
 * Your grade is B.
 * 
 */

public class StudentGrade {

	public static void main(String[] args) {
		System.out.println("Please enter the Quiz score:");
		Scanner sc1 = new Scanner(System.in);
		int Quiz = sc1.nextInt();
		System.out.println("Please enter the Mid-term score:");
		Scanner sc2 = new Scanner(System.in);
		int Midterm = sc1.nextInt();
		System.out.println("Please enter the Final score:");
		Scanner sc3 = new Scanner(System.in);
		int Final = sc1.nextInt();
		sc1.close();
		sc2.close();
		sc3.close();
		int average = (Quiz + Midterm + Final) / 3;

		if (average >= 90)
			System.out.println("grade = A");
		else if (average >= 70 & average <= 90)
			System.out.println("grade = B");
		else if (average >= 50 & average <= 70)
			System.out.println("grade = C");
		else
			System.out.println("grade = F");
	}
}
