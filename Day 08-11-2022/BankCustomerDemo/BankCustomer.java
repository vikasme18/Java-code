package task4;

public class BankCustomer {
	int acno;
	String cname;
	int amt;
	
	BankCustomer(int acno, String cname, int amt) {
		this.acno = acno;
		this.cname = cname;
		this.amt = amt;
	}

	@Override
	public String toString() {
		return "BankCustomer [acno=" + acno + ", cname=" + cname + ", amt=" + amt + "]";
	}
}