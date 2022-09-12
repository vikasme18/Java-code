class SumOfDigit {
	
	
	static void add(int num) {
		int sum = 0;
		int last;
		
		while (num != 0) {
			last =  num % 10;  // It will store last value from the number
			sum += last;  // last number will added for every iteration
			num /= 10;  // removing last number by dividing with 10
		}
		System.out.print(sum);
	}

	public static void main(String[] args) {
		// scanner object
		java.util.Scanner sc = new java.util.Scanner(java.lang.System.in);
		
		// user input
		java.lang.System.out.print("Enter any number: ");
		int num = sc.nextInt();
		
		// calling static method
		add(num);
	}

}
