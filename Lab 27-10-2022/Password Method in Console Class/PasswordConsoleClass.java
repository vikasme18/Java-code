import java.io.Console;

public class PasswordConsoleClass {
	
	public static void main(String[] args) {
		Console c = System.console();
		System.out.print("Enter the password: ");
		char[] ch = c.readPassword();
		String pass=String.valueOf(ch); 
		System.out.println(pass);
	}
	
}
