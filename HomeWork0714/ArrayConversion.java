package Question7;

public class ArrayConversion {

	public static int[][] myArray = { { 2, 5, 8, 4 }, { 7, 6, 3, 4 },
			{ 4, 7, 0, 2 }, { 1, 1, 1, 1 } };

	// Set the input array

	public static void main(String[] args) {
		PrintOriginalArray();
		ConvertArray(0, 0);
		PrintNewArray();
	}

	public static void PrintOriginalArray() {
		System.out.println("The input array is:");
		for (int i = 0; i < myArray.length; i++) {
			for (int j = 0; j < myArray[i].length; j++) {
				System.out.print(myArray[i][j] + " ");
			}
			System.out.println(" ");
		}
	}

	public static void ConvertArray(int row, int column) {
		for (int i = 0; i < myArray.length; i++) {
			for (int j = 0; j < myArray[i].length; j++) {
				if (myArray[i][j] == 0) {
					row = i;
					column = j;
					break;
				}
			}
		}// Get the row and column' values when "0" come out in the 2-D array

		for (int i = 0; i < myArray.length; i++) {
			myArray[i][column] = 0;
		}
		for (int j = 0; j < myArray.length; j++) {
			myArray[row][j] = 0;
		}
	}// Replace all the elements in the row and column which come out "0" to "0"

	public static void PrintNewArray() {
		System.out.println("The output array is:");
		for (int i = 0; i < myArray.length; i++) {
			for (int j = 0; j < myArray[i].length; j++) {
				System.out.print(myArray[i][j] + " ");
			}
			System.out.println(" ");
		}
	}
}
