package task4;

import java.util.ArrayList;

public class BankCustomerMain {

	public static void main(String[] args) {
		ArrayList<BankCustomer> cusDetail = new ArrayList<>();
		cusDetail.add(new BankCustomer(14431, "Vikas Meena", 35000));
		cusDetail.add(new BankCustomer(54235, "Bhagyshree Sahu", 66000));
		cusDetail.add(new BankCustomer(76453, "Ashutosh Mishra", 99000));
		cusDetail.add(new BankCustomer(11254, "Rajnish Kumar", 64000));
		cusDetail.add(new BankCustomer(76864, "Gyanendra Mishra", 86000));
		cusDetail.add(new BankCustomer(97543, "Ravishankar Mishra", 100000));
		
		// Getting customer details using get method
		System.out.println(cusDetail.get(4));
		System.out.println(cusDetail.get(2).cname);
		System.out.println(cusDetail.get(1).amt);
		
		// Printing customer details using for each loop
		for(BankCustomer cusList: cusDetail) {
			System.out.println(cusList);
		}
		
		
		
	}

}
