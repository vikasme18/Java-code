import java.util.Scanner;

public class PerfectNumber {
	
	// Lowest Number
	static int lowest(int lower, int upper) {
		if (lower > upper) {
			return upper;
		}
		else {
			return lower;
		}
	}
	
	// Greatest Number
	static int greatest(int lower, int upper) {
		if (upper < lower) {
			return lower;
		}
		else {
			return upper;
		}
	}

	// Then it will calculate the perfect number from the given limits
	void findNumber(int lower, int upper) {
		int num_count = 0, sum = 0;
		for (int i = lower; i <= upper; i++) {
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					sum += j;
				}
			}
			if (sum == i) {
				num_count += 1;	
			}
			sum = 0;
		}
		
		System.out.print("Total number of perfect: " + num_count);
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		boolean should_continue = true;
		while (should_continue) {
			System.out.println("Enter any two numbers: ");
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			PerfectNumber perfect1 = new PerfectNumber();
			if (num1 != num2) {
			int lower_num = lowest(num1, num2);
			int greater_num = greatest(num1, num2);
			perfect1.findNumber(lower_num, greater_num);
			should_continue = false;
			}
			else {
				System.out.println("The numbers should not be same");
			}
		}
		
		scan.close();
	}
}
