package runtime;

import java.util.Scanner;

public class MobileFactory {
	
	Phone buyPhone() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Sir, which phone do you want to see: ");
		String phone_name = scan.next().toLowerCase();
		scan.close();
		
		if (phone_name.equals("iphone")) {
			return new Iphone();
		}
		else if (phone_name.equals("realme")) {
			return new Realme();
		}
		else {
			return null;
		}
	}
	
}
