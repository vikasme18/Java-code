package jdbclab;
import java.sql.*;
import java.io.*;

public class StoringFileUsingJDBC {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException, NumberFormatException, IOException {
		
		// create connection object
		Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3307/vikasdb", "root", "1234");
		
		// create preparedstatement
		PreparedStatement ps=cn.prepareStatement("insert into emp(ename, message) values(?,?)");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// taking users name to store in database
		System.out.print("Enter your name: ");
		String userName = br.readLine().toLowerCase();
		ps.setString(1,userName);
		
		// create a file inside filehandling and write some content in the file
		File f=new File("D:\\FileHandling\\filethroughjdbc.txt");
		FileReader fr=new FileReader(f);
		ps.setCharacterStream(2, fr,(int)f.length());
		int n=ps.executeUpdate();
		System.out.println(n+" row inserted");
		cn.close();
	}
	
}