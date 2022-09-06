import java.util.Scanner;

class CheckEvenOdd {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// Taking input from the user
		System.out.print("Enter a number: ");
		int number = scan.nextInt();

		// Checking the number is completely division by 2
		if (number % 2 == 0) {
			System.out.println("Even Number");
		} 
		else {
			System.out.println("Odd Number");
		}
	}
}