package task1;
import java.util.Scanner;

public class UserLoginMain {
	
	private void loginCheck(String username, String password) {
		UserLogin login = new UserLogin();
		if (username.equals(login.getUsername()) && password.equals(login.getPassword())) {
			System.out.println("Login successful");
		} else {
			System.out.println("Invalid credentials");
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your username: ");
		String username = scan.nextLine();
		System.out.print("Enter your password: ");
		String password = scan.nextLine();
		scan.close();
		
		UserLoginMain user1 = new UserLoginMain();
		user1.loginCheck(username, password);
	}

}
