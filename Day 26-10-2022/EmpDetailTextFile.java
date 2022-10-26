package task2;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class EmpDetailTextFile {
	private int eid;
	private String ename;
	private long salary;
	
	void setFile() throws IOException {
		try {
			FileOutputStream file = new FileOutputStream("D://FileHandling//demo2.txt");
			String empId = "Employee ID: " + this.eid + "\n" + "Employee Name: " + this.ename + "\n" + "Employee Salary: " + this.salary;
			byte[] byteArrEmp = empId.getBytes();
			file.write(byteArrEmp);
			System.out.println("File have been written successfully");
			file.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	void getDetails() throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter employee name: ");
		this.ename = scan.nextLine();
		System.out.print("Enter employee id: ");
		this.eid = scan.nextInt();
		System.out.print("Enter employee salary: ");
		this.salary = scan.nextLong();
		scan.close();
		setFile();
	}

	public static void main(String[] args) throws IOException {
		EmpDetailTextFile edetail1 = new EmpDetailTextFile();
		edetail1.getDetails();
	}
}
