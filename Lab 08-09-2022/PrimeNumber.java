import java.util.Scanner;

class PrimeNumber {
	
	// checks the given number is prime is not
	static void checkPrime(int num) {
		boolean is_prime = true;
		if (num == 0 || num == 1) {
			System.out.print("Not a prime number");
		}
		else {
			for (int i = 2; i <= num/2; i++) {
				if (num % i == 0) {
					System.out.print("Not a prime number");
					is_prime = false;
					break;
				}
			}
			if (is_prime) {
				System.out.print("Prime Number");
			}
		}
	}
	
	// Main method
	public static void main(String[] args) {
		// creating scanner object
		Scanner scan = new Scanner(System.in);

		// Creating user input
		System.out.print("Enter any number to check number is prime or not: ");
		int num = scan.nextInt();
		
		checkPrime(num);	
	}

}