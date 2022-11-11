package airline.ticketing;

public class BookFlightList {
	int bookid;
	int flightid;
	String flightclass;
	String dateOfFlight;
	String dateOfBooking;
	int noOfAdult;
	int noOfChild;
	String gender;
	int ticketFare;
	int customerid;
	
	public BookFlightList(int bookid, int flightid, String flightclass, 
			String dateOfFlight, String dateOfBooking,
			int noOfAdult, int noOfChild, String gender, int ticketFare, int customerid) {
		super();
		this.bookid = bookid;
		this.flightid = flightid;
		this.flightclass = flightclass;
		this.dateOfFlight = dateOfFlight;
		this.dateOfBooking = dateOfBooking;
		this.noOfAdult = noOfAdult;
		this.noOfChild = noOfChild;
		this.gender = gender;
		this.ticketFare = ticketFare;
		this.customerid = customerid;			
	}

	@Override
	public String toString() {
		return "BookFlightCollection [bookid=" + bookid + ", flightid=" + flightid + 
				", flightclass=" + flightclass+ ", dateOfFlight=" + dateOfFlight +
				", dateOfBooking=" + dateOfBooking + ", noOfAdult=" + noOfAdult
				+ ", noOfChild=" + noOfChild + ", gender=" + gender + 
				", ticketFare=" + ticketFare + ", customerid="+ customerid + "]";
	}
	
	
}