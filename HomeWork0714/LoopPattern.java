package Question4;

public class LoopPattern {

	public static void main(String[] args) {
		for(int i = 1; i <= 7; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			for(int k = 6; k >= i; k--) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

}
