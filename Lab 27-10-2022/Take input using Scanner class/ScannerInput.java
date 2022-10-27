package lab8;
import java.util.Scanner;
public class ScannerInput {
	
	static void printer(String name, int id, double salary, long number, boolean ques) {
		System.out.println("Name: " + name);
		System.out.println("ID: " + id);
		System.out.println("Salary: " + salary);
		System.out.println("Phone Number: " + number);
		System.out.println("Answer: " + ques);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = sc.nextLine();
		System.out.print("Enter your id: ");
		int id = sc.nextInt();
		System.out.print("Enter your salary: ");
		double salary = sc.nextDouble();
		System.out.print("Enter your phone number: ");
		long number = sc.nextLong();
		System.out.print("Java is Oject Oriented Programming language(True/False): ");
		boolean ques = sc.nextBoolean();	
		ScannerInput.printer(name, id, salary, number, ques);
		sc.close();
	}

}
