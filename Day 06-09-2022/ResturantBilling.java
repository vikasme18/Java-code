import java.util.Scanner;

class ResturantBilling {

	static double calculate(int s, int m, int d) {
		double service_charge = (m + d) * 0.04;
		double cost = s + m + d + service_charge;
		return cost;
	}
	
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

	System.out.print("Enter your Starter bill(in Rs): ");
	int starter = scan.nextInt();

	System.out.print("Enter your Main course bill(in Rs): ");
	int main_course = scan.nextInt();

	System.out.print("Enter your Desert bill(in Rs): ");
	int desert = scan.nextInt();

	double total_bill = calculate(starter , main_course, desert);
	System.out.print("You have to pay " + total_bill);
	
	}
}