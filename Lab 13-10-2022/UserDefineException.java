package lab6;

// This program is for eligiblity test
public class UserDefineException extends Exception {
	static double person_age = 0;
	public static void main(String[] args) {
		try {
			if (person_age > 18) {
				throw new ArithmeticException("Sorry, you are not eligible for driving");
			}
			else {
				System.out.println("You are eligible for driving");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}
}
