package lab6;

import java.util.Scanner;

public class ThrowAndThrowsDemo {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Write your message: ");
		String str = scan.nextLine();
		
		if (str.equals("")) {
			throw new NullPointerException("String is empty");
		} else {
			System.out.println(str);
		}
		scan.close();
	}

}
