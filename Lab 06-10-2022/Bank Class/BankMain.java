package lab5;

public class BankMain {

	public static void main(String[] args) {
		Axis axis = new Axis();
		axis.interest();
		
		Sbi sbi = new Sbi();
		sbi.interest();
		
		Icici icici = new Icici();
		icici.interest();
	}

}
