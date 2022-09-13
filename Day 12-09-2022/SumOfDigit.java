class SumOfDigit {

	static void add(int num) {
		int sum = 0;
		int last;
		while (num != 0) {
			last =  num % 10;
			sum = sum + last;
			num /= 10;
		}
		System.out.print(sum);
	}

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(java.lang.System.in);
		
		java.lang.System.out.print("Enter any number: ");
		int num = sc.nextInt();
		
		add(num);
	}

}