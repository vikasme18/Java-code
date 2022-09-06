import java.util.Scanner;

class SwitchSimpleCalculator {

	static void add(int num1, int num2) {
		System.out.print(num1 + num2);
	}
	
	static void sub(int num1, int num2) {
		System.out.print(num1 - num2);
	}

	static void mul(int num1, int num2) {
		System.out.print(num1 * num2);
	}

	static void div(int num1, int num2) {
		System.out.print(num1 / num2);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int num1 = scan.nextInt();
		System.out.print("Operation: +,-,*,/ ? ");
		char oper = scan.next().charAt(0);
		System.out.print("Enter the second number: ");
		int num2 = scan.nextInt();

		switch(oper) {
			case '+':
				SwitchSimpleCalculator.add(num1, num2);
				break;
			
			case '-':
				SwitchSimpleCalculator.sub(num1, num2);
				break;

			case '*':
				SwitchSimpleCalculator.mul(num1, num2);
				break;

			case '/':
				SwitchSimpleCalculator.div(num1, num2);
				break;

			default:
				System.out.print("Invalid input");
		}
		
	}
}