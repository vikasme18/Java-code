package airline.ticketing;

public class AirlineTicketing {

	public static void main(String[] args) throws Exception {
		AirlineTicketingValidation ticket = new AirlineTicketingValidation();
		if (ticket.log_status == false) {
			ticket.login();
			ticket.bookFlight();
			ticket.detailList();
			ticket.Passenger();
			ticket.addPassenger();
			ticket.deletePassenger();
			ticket.fetchTicketData();
		}	
	}
}
