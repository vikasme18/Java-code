package task15nov;

import java.io.*;
import java.sql.*;

public class EmployeeDetail {
	static Connection con;
	static BufferedReader br;
	
	public void makeConnection() throws SQLException {
		con = DriverManager.getConnection("jdbc:mysql://localhost:3307/vikasdb", "root", "1234");
	}
	
	public void createTable() {
		// creating a emps table
		try {
						PreparedStatement pst1 = con.prepareStatement("CREATE TABLE EMPS(EID INT, ENAME VARCHAR(30), SAL INT)");
						pst1.executeUpdate();
						System.out.println("Table created successfully");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void insertValue() {
		// inserting values
		try {
			PreparedStatement pst2 = con.prepareStatement("INSERT INTO EMPS VALUES(?,?,?)");
			do {
				br = new BufferedReader(new InputStreamReader(System.in));
				System.out.print("Enter emp id: ");
				int empid = Integer.parseInt(br.readLine());
				System.out.print("Enter emp name: ");
				String empname = br.readLine();
				System.out.print("Enter emp salary: ");
				int empsal = Integer.parseInt(br.readLine());
				pst2.setInt(1, empid);
				pst2.setString(2, empname);
				pst2.setInt(3, empsal);
				pst2.executeUpdate();
				System.out.println("row inserted");
				System.out.print("Do you want to insert another record (y/n): ");
				String anotherRec = br.readLine();
				if (anotherRec.equals("n")) {
					break;
				}
			}while (true);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void fetchRows() {
		// printing rows from table
		try {
			Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			ResultSet rs = st.executeQuery("SELECT * FROM EMPS");
			while (rs.next()) {
				System.out.println(rs.getInt(1)+ "  " + rs.getString("ENAME") + "  " + rs.getInt("SAL"));
				
			}
		} catch (Exception e) {
			
		}
	}
	
	public static void main(String[] args) {
		try {
			EmployeeDetail emp = new EmployeeDetail();
			emp.makeConnection();
			br = new BufferedReader(new InputStreamReader(System.in));
			do {
				System.out.print("What is your request(CREATE/INSERT/SELECT): ");
				String userReq = br.readLine().toLowerCase();
				switch (userReq) {
				case "create":
					emp.createTable();
					break;
				case "insert":
					emp.insertValue();
					break;
				case "select":
					emp.fetchRows();
					break;
				default:
					System.out.println("Invalid request");
				}
				System.out.print("Do you want to continue program (y/n): ");
				String shouldContinue = br.readLine();
				if (shouldContinue.equals("n")) {
					break;
				}
			} while (true);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
