package task15nov;

public class Customer {
	int acno;
	String cname;
	int amt;
	
	public Customer(int acno, String cname, int amt) {
		super();
		this.acno = acno;
		this.cname = cname;
		this.amt = amt;
	}

	@Override
	public String toString() {
		return "Customer [acno=" + acno + ", cname=" + cname + ", amt=" + amt + "]";
	}
	
	
}
