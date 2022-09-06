// This program checks whether the given number is negative, positive or zero.
import java.util.Scanner;

class PositiveNegativeProgram {
	// Calling main method
	public static void main(String[] args) {
		
		// Creating scanner object
		Scanner scan = new Scanner(System.in);
		
		// Taking user input
		System.out.print("Enter any number: ");
		int num = scan.nextInt();
		
		if (num<0) {
			System.out.print("Negative number");
		}
		else if (num>0) {
			System.out.print("Positive number");
		}
		else {
			System.out.print("Zero");
		}
		
	}

}
