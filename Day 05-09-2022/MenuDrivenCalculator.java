import java.util.Scanner;
class MenuDrivenCalculator {
	static void addition(int num1, int num2) {
		int result = num1 + num2;
		System.out.print("The addition of "+num1+" and "+num2+" is "+result);
	}
	static void multiplication(int num1, int num2, int num3) {
		int result = num1 * num2 * num3;
		System.out.print("The multiplication of " +num1+ " , " +num2+ " and " +num3+ " is "+result);
	}
	static void subtraction(int num1, int num2) {
		int result = num1 - num2;
		System.out.print("The subtraction of "+num1+" and "+num2+" is "+result);
	}	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = 6;
		int num2 = 3;
		int num3 = 5;
		
		System.out.print("Type 1 for addition, 2 for multiplication or 3 for Subtraction: ");
		int user_choice = scan.nextInt();

		switch(user_choice) {
			case 1:
				MenuDrivenCalculator.addition(num1, num2);
				break;
			case 2:
				MenuDrivenCalculator.multiplication(num1, num2, num3);
				break;
			case 3:
				MenuDrivenCalculator.subtraction(num1, num2);
				break;
			default:
				System.out.println("Invalid input!");

		}
		
	}
}