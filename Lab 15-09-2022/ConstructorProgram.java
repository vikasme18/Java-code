import java.util.Scanner;

public class ConstructorProgram {
	
	// non static student variable
	int id;
	String name;
	String location;
	
	// This method will take single agruments
	ConstructorProgram(int id) {
		this.id = id;
	}
	
	// This method will take two agruments
	ConstructorProgram(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	// This method will take three agruments
	ConstructorProgram(int id, String name, String location) {
		this.id = id;
		this.name = name;
		this.location = location;
	}
	
	// THis method display details of student
	void showInfo() {
		System.out.println("ID: " + id);
		System.out.println("Name: " + name);
		System.out.println("location: " + location);
		System.out.println();
	}
	
	// calling main method
	public static void main(String[] args) {
		// scanner object
		Scanner scan = new Scanner(System.in);
		
		// creating objects
		ConstructorProgram emp1 = new ConstructorProgram(001);
		ConstructorProgram emp2 = new ConstructorProgram(002, "Vikas");
		ConstructorProgram emp3 = new ConstructorProgram(003, "Ashutosh", "Murbad");
		emp1.showInfo();
		emp2.showInfo();
		emp3.showInfo();
		
	}
}
