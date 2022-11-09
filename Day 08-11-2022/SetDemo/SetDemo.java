package taskcollection;

import java.util.HashSet;

public class SetDemo {
	public static void main(String[] args) {
		HashSet<BankCustomer> set=new HashSet<>();
		set.add(new BankCustomer(543466, "Omkar", 67400));  
		set.add(new BankCustomer(456783, "Vikas", 56000));  
		set.add(new BankCustomer(323522, "Rahul", 85600));  
		set.add(new BankCustomer(960654, "Abhishek", 97400));  
		set.add(new BankCustomer(367764, "Yadav", 12500));  
		set.add(new BankCustomer(946745, "Raj", 63200));
		
		// checking the given account number is matches with set bankcustomer acno
		for (BankCustomer data: set) {
			if (data.acno == 543466) {
				// if true then print the below details
				System.out.println("Customer acno: " + data.acno +"\n"+ "Customer name: " 
			+ data.cname + "\n" + "Customer Current amount: " + data.amt);
			}
		}
		
		
	}
}