public class PerfectNumber {

	void findNumber(int l, int u) {
		int num_count = 0, sum = 0;
		for (int i = l; i <= u; i++) {
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					sum += j;
				}
			}
			if (sum == i) {
				num_count += 1;
			}
			sum = 0;
		}
		
		System.out.print("Total number of perfect: " + num_count);
	}
	
	public static void main(String[] args) {
		PerfectNumber pnum1 = new PerfectNumber();
		pnum1.findNumber(1, 30);
	}
}
