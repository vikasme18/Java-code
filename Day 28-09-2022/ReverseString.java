package stringCode;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter any string to reverse: ");
		String s = scan.nextLine();
		char[] sarr = s.toCharArray();
		char[] revarr = new char[s.length()];
		int j = 0;
		for(int i = (s.length()-1); i >= 0; i--) {
			revarr[i] = sarr[j];
			j++;
		}
		System.out.println(revarr);
		scan.close();
	}
}