import java.util.Scanner;

class ResturantBilling {

	static double total(int s, int m, int d) {
		double service_bill = (m + d) * 0.04;
		double total = s + (m + d + service_bill);
		return total;
	}
	
	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);

	System.out.print("Enter your Starter bill(in Rs): ");
	int s = scan.nextInt();
	System.out.print("Enter your Main course bill(in Rs): ");
	int m = scan.nextInt();
	System.out.print("Enter your Desert bill(in Rs): ");
	int d = scan.nextInt();

	double bill = total(s, m, d);
	System.out.print("You have to pay " + bill);
	
	}

}