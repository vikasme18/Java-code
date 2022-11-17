package jdbclab;
import java.sql.*;

public class TableInOracle {
	public static void main(String[] args) throws SQLException {
	      Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "system", "password");
	      Statement stmt = con.createStatement();
	      stmt.execute("CREATE TABLE STUDENTS(SID INT, SNAME VARCHAR(30), MARKS VARCHAR(30), COURSE VARCHAR(20))");
	      System.out.println("Table Created Successfully.");
	}
}
