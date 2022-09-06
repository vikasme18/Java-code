import java.util.Scanner;

class PositiveNegativeMethod {
	
	// Static method to check positive negative number
	static void numberCheck(int num) {
		if (num<0) {
			System.out.print("Negative Number");
		}
		else if (num>0) {
			System.out.print("Positive Number");
		}
		else {
			System.out.print("Zero");
		}
	}

	// Main Method
	public static void main(String[] args) {

		// Create scanner object
		Scanner scan = new Scanner(System.in);

		// Taking user input
		System.out.print("Enter any number: ");
		int num = scan.nextInt();

		// Calling static method
		PositiveNegativeMethod.numberCheck(num);
	}
}