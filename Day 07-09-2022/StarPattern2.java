import java.util.Scanner;
class StarPattern2 {

	public static void main(String[] args) {
		
		// Create scanner object
		Scanner scan = new Scanner(System.in);
		
		// Taking input from the user
		System.out.print("Enter the number of lines: ");
		int rows = scan.nextInt();
		
		for (int i = 1; i <= rows; i++) {
			for (int j = rows-1; j >= i; j--) {
				System.out.print(" ");
			} 

			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}	
	}
}
