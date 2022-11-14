package jdbctask;

import java.sql.*;

public class TableUsingJDBC {
	static Connection con;
	
	static void getCon() throws SQLException {
		con = DriverManager.getConnection("jdbc:mysql://localhost:3307/vikasdb", "root", "1234");
	}
	
	static void createTable() {
		try {
			Statement st = con.createStatement();
			st.executeUpdate("CREATE TABLE STUDENT(SID INT, SNAME VARCHAR(30), MARKS INT)");
			System.out.println("Table created successfully");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	static void insertRows() {
		try {
			Statement st = con.createStatement();
			int r = st.executeUpdate("INSERT INTO STUDENT VALUES(1, 'Vikas', 67),(2, 'Ashutosh', 99),(3, 'Rohan', 76)");
			System.out.println(r+" rows affected.");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	

	public static void main(String[] args) throws SQLException {
		getCon();
		createTable();
		insertRows();
	}
}