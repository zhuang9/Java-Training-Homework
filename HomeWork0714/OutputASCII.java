package Question5;

public class OutputASCII {

	public static void main(String[] args) {
		int i = 1;
		System.out.print("The output is: ");
		do {
			System.out.print((char) i + " ");
			i++;
		} while (i < 123);
	}
}