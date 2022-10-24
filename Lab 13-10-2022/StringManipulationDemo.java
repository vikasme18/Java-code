package lab6;

public class StringManipulationDemo {
	public static void main(String[] args) {
		String s1 = "vikas";
		String s2 = "vikas";
		String s3 = new String("vikas");
		String s4 = "Working";
		String s5 = "Hello, my name is vikas";
		
		// == operator check
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		
		// equals method
		System.out.println(s1.equals(s3));
		
		// concat method
		System.out.println(s1.concat(s3));
		
		// replace method
		System.out.println(s4.replace("ing", "ed"));
		
		// split method
		String[] splitarr = s4.split("i", 2);
		for (String arr: splitarr) {
			System.out.println(arr);
		}
		
		// charAt method
		System.out.println(s5.charAt(7));
		
		// compareTo method
		System.out.println(s5.compareTo(s1));
		
		// subString method
		System.out.println(s5.substring(7));
	}
}
