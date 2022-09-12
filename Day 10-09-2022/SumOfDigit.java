class SumOfDigit {
	
	
	static void add(int num) {
		int sum = 0;
		int last;
		// loop will continue till the number become zero
		while (num != 0) {
			last =  num % 10;  // It store last value from the number
			sum += last;  // last number will added for every iteration
			num /= 10;  // last number will removed by dividing it to 10
		}
		System.out.print(sum);
	}

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.print("Enter any number: ");
		int num = sc.nextInt();
		
		add(num);
	}

}
