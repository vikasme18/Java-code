import java.util.Scanner;

public class ConstructorProgram {
	
	int id;
	String name;
	String location;
	
	ConstructorProgram(int id) {
		this.id = id;
	}
	
	ConstructorProgram(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	ConstructorProgram(int id, String name, String location) {
		this.id = id;
		this.name = name;
		this.location = location;
	}
	
	void showInfo() {
		System.out.println("ID: " + id);
		System.out.println("Name: " + name);
		System.out.println("location: " + location);
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		ConstructorProgram emp1 = new ConstructorProgram(001);
		ConstructorProgram emp2 = new ConstructorProgram(002, "Vikas");
		ConstructorProgram emp3 = new ConstructorProgram(003, "Ashutosh", "Murbad");
		emp1.showInfo();
		emp2.showInfo();
		emp3.showInfo();
		
	}
}