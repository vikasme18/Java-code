package task15nov;

import java.util.ArrayList;

public class CustomerDetailEntry {

	public static void main(String[] args) {
		ArrayList<Customer> bank = new ArrayList<>();
		bank.add(new Customer(5467, "Vikas", 42000));
		bank.add(new Customer(8756, "Ashutosh", 17000));
		bank.add(new Customer(2325, "Gyanendra", 87000));
		bank.add(new Customer(8632, "Bhagyashree", 67000));
		bank.add(new Customer(1243, "Rajnish", 9000));
		
		// getting all customers detail using toString method
		System.out.println(bank);
	}

}
