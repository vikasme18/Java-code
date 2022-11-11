package airline.ticketing;

public class AddPassenger {
	int bookid;
	int passengerid;
	String pname;
	int age;
	String bookingStatus;
	
	public AddPassenger(int bookid, int passengerid, String pname, int age, String bookingStatus) {
		this.bookid = bookid;
		this.passengerid = passengerid;
		this.pname = pname;
		this.age = age;
		this.bookingStatus = bookingStatus;
	}

	@Override
	public String toString() {
		return "AddPassenger [bookid=" + bookid + ", passengerid=" + passengerid + ", pname=" + pname + ", age=" + age
				+ ", bookingStatus=" + bookingStatus + "]";
	}
	
	
	
}
