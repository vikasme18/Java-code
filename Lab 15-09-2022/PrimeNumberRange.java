import java.util.Scanner;

public class PrimeNumberRange {

	 static int smaller(int n1, int n2) {
		 if (n1<n2) {
			 return n1;
		 }
		 else {
			 return n2;
		 }
	 }
	 
	 static int greater(int n1, int n2) {
		 if (n1<n2) {
			 return n2;
		 }
		 else {
			 return n1;
		 }
	 }
	 
	 void number(int lower, int upper) {
		 int count_prime_num = 0;
		 for (int i = lower; i <= upper; i++) {
			 boolean is_prime = true;
			 for (int j = 2; j <= i/2; j++) {
				 if (i % j == 0) {
					 is_prime = false;
					 break;
				 }
			 }
			 if(is_prime) {
				 System.out.print(i + ", ");
				 count_prime_num += 1;
			 }
		 }
		 System.out.println();
		 if (count_prime_num == 1) {
			 System.out.print("There are total " + count_prime_num + " prime number" + " between " + lower + " to " + upper);
		 }
		 else if (count_prime_num > 1) {
			 System.out.print("There are total " + count_prime_num + " prime numbers" + " between " + lower + " to " + upper);
		 }
	 }
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any two numbers: ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		if (num1 != num2) {
			int lower = smaller(num1, num2);
			int upper = greater(num1, num2);
			PrimeNumberRange pnr = new PrimeNumberRange();
			pnr.number(lower, upper);
		}
		else {
			System.out.print("Numbers should not be same");
		}
	}
	
}
