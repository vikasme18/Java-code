// Write a program to find the greatest among two numbers
import java.util.Scanner;

class GreatestNumber {	
	// main method
	public static void main(String[] args) {

		// Creating scanner object
		Scanner scan = new Scanner(System.in);

		// Taking an input from the user
		System.out.print("Enter first number: ");
		int first_number = scan.nextInt();

		System.out.print("Enter second number: ");
		int second_number = scan.nextInt();
		
		// Comparing two numbers
		if (first_number < second_number) {
			System.out.println(second_number + " is greater than the " + first_number);
		}
		else if (first_number > second_number) { 
			System.out.println(first_number + " is greater than the " + second_number);
		}

		else {
			System.out.println("Both numbers are equal");
		}

	}
}