package jdbclab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CRUD {
	Connection conn;
	static BufferedReader br;
	
	CRUD() throws SQLException {
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/anudip","root","1234");
	}
	
	public void create() throws SQLException {
		PreparedStatement pstmt = conn.prepareStatement("CREATE TABLE candidates(cid int, cname varchar(25), city varchar(15))");
		pstmt.execute();
		System.out.println("Table has been created successfully");
		
	}
	
	public void insert() throws SQLException {
		PreparedStatement pstmt2 = conn.prepareStatement("INSERT INTO candidates VALUES(1, 'Vikas', 'Kalyan'),"
				+ "(2, 'Ashutosh', 'Murbad'),(3, 'Bhagyashree', 'Kurla'),"
				+ "(4, 'Rajnish', 'Kalyan'), (5, 'Gyanendra', 'Murbad')");
		pstmt2.execute();
		System.out.println("Values inserted");
	}
	
	public void read() throws SQLException {
		PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM candidates");
		ResultSet rs  = pstmt.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt(1)+ "    " +rs.getString(2)+"    "+rs.getString("city"));
		}
	}
	
	public void update() throws SQLException, IOException {
		PreparedStatement pstmt = conn.prepareStatement("UPDATE candidates SET ? = ? WHERE cid = ?");
		while(true) {
			System.out.print("Enter the candidate id for which you have to update the row: ");
			int id = Integer.parseInt(br.readLine());
			System.out.print("For which column do you want to edit the value: ");
			String columnName = br.readLine();
			System.out.print("Enter the value: ");
			int value = Integer.parseInt(br.readLine());
			pstmt.setString(1, columnName);
			pstmt.setInt(2, value);
			pstmt.setInt(3, id);
			int row = pstmt.executeUpdate();
			if (row>0) {
				System.out.println(row + " row deleted+");
			}
			System.out.print("do you want to delete more rows? Type(y/n): ");
			String deleteMore = br.readLine();
			if (deleteMore.equals("n")) {
				break;
			}
		}
		int rs = pstmt.executeUpdate();
		if (rs > 0) {
			System.out.println(rs + " row affected");
		}
	}
	
	public void delete() throws SQLException, IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			PreparedStatement pstmt = conn.prepareStatement("delete from candidates WHERE cid=?");
			System.out.print("Enter the candidate id to delete the details: ");
			int id = Integer.parseInt(br.readLine());
			pstmt.setInt(1, id);
			pstmt.execute();
			System.out.println("row has been deleted.");
			System.out.print("do you want to delete more rows? Type(y/n): ");
			String deleteMore = br.readLine();
			if (deleteMore.equals("n")) {
				break;
			}
		}
	}
		
	public static void main(String[] args) throws SQLException, IOException {
		CRUD oper = new CRUD();
		br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.print("Which operation would you like to perform (CREATE/INSERT/UPDATE/DELETE/READ): ");
			String action = br.readLine().toLowerCase();
			switch (action) {
			case "create":
				oper.create();
				break;
			case "insert":
				break;
			case "update":
				oper.update();
				break;
			case "delete":
				oper.delete();
				break;
			case "read":
				oper.read();
				break;
			default:
				System.out.println("Invalid operation name!");
			}
			
			System.out.print("Do you want to perform another operation? Type(y/n): ");
			String shouldContinue = br.readLine();
			if (shouldContinue.equals("n")) {
				break;
			}
		}
	}
}
