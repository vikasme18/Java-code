package jdbclab;
import java.sql.*;
import java.io.*;

public class StatementProgram {
	static Connection conn;
	static BufferedReader br;
	
	public void createTable() throws SQLException {
		// creating table using Statement interface and its methods
		Statement stmt = conn.createStatement();
		stmt.executeUpdate("CREATE TABLE PSG(psgid int PRIMARY KEY auto_increment, psgname varchar(30), psgemail varchar(255))");
		System.out.println("Table created.");
	}
	
	public void insertRows() throws SQLException, IOException {
		// inserting rows using preparedstatement interface
		PreparedStatement pstmt = conn.prepareStatement("INSERT INTO PSG(psgname, psgemail) VALUES(?,?)");
		System.out.print("Write passenger name: ");
		String psgName = br.readLine();
		pstmt.setString(1, psgName);
		System.out.print("Write passenger email: ");
		String psgEmail = br.readLine();
		pstmt.setString(2, psgEmail);
		int rows = pstmt.executeUpdate();
		System.out.println(rows + " row inserted");
	}
	
	public static void main(String[] args) {
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/vikasdb", "root", "1234");
			StatementProgram prg = new StatementProgram();
			do {
				System.out.print("Enter '1' to create table or '2' to insert rows: ");
				int userChoice = Integer.parseInt(br.readLine());
				switch (userChoice) {
				case 1:
					prg.createTable();
					break;
				case 2:
					prg.insertRows();
					break;
				default:
					System.out.println("Wrong input! Try again");
				}
				System.out.print("Do you want to continue with the program? Type(yes/no): ");
				String isContinue = br.readLine().toLowerCase();
				if (isContinue.equals("no")) {
					break;
				}
			} while (true);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
