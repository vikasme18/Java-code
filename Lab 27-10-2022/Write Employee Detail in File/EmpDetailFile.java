package lab8;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class EmpDetailFile {
	String ename;
	int eid;
	long salary;
	
	void setFile() throws IOException {
		try {
			FileOutputStream file = new FileOutputStream("D://FileHandling//demo6.txt");
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
		EmpDetailFile detailFile = new EmpDetailFile();
		detailFile.getDetails();
	}
}
