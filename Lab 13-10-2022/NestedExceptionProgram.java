package lab6;

public class NestedExceptionProgram {
	public static void main(String[] args) {
		try {
			
			// this nested try-catch block handles NullPointerException
			try {
				String s = null;
				System.out.println(s.length());
			} catch (NullPointerException e) {
				System.out.println(e.getMessage());
			}
			
			// this nested try-catch block handles ArrayIndexOutOfBoundsException
			try {
				int[] numarr = {5, 3, 2, 8, 9};
				System.out.println(numarr[5]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e.getMessage());
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
