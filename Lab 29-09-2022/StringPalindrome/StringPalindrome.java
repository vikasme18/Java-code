package lab4;
import java.util.Scanner;

public class StringPalindrome {
	
	static void PalindromeCheck(String check_string) {
		String rev_string = "";
		for (int i = check_string.length()-1; i >= 0; i--) {
			rev_string += check_string.charAt(i);
		}
		if (check_string.equals(rev_string)) {
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("String is not palindrome");
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a string to check whether the string is palindrome: ");
		String check_string = scan.next().toLowerCase();
		PalindromeCheck(check_string);
		
		scan.close();
	}
}
