package task1;

public class MaxNumberFromArray {
	public static void main(String[] args) {
		int[] numarr = {100,25,56,95,32};
		int tempMaxVal = numarr[0];
		for (int i = 1; i < numarr.length; i++) {
			if (tempMaxVal < numarr[i]) {
				tempMaxVal = numarr[i];
			}
		}
		System.out.println(tempMaxVal);
	}
}
