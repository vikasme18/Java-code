package airline.ticketing;

import java.io.*;
import java.util.*;

public class AirlineTicketingValidation {
	boolean log_status;
	Login log;
	BookFlight bookValid;
	ArrayList<BookFlightList> cusDetail;
	BufferedReader br;
	PassengerDetail psgInfo;
	ArrayList<AddPassenger> psgDetail;
	
	public void login() throws IOException {
		System.out.println("***** Welcome to Online Flight Booking *****\n");
		System.out.println("--User Login--");
		log = new Login();
		
		br = new BufferedReader(new InputStreamReader(System.in));
		do {
			System.out.print("Enter your id: ");
			String id = br.readLine();
			System.out.print("Enter your password: ");
			String password = br.readLine();
			
			if (id.equals(log.getId()) && password.equals(log.getPassword())) {
				log_status = true;
				System.out.println("Login successful");
				System.out.println();
			}
			else {
				System.out.println("Credentials invalid");
			}
		} while(log_status != true);
	}
	
	public void bookFlight() throws NumberFormatException, IOException {
		System.out.println("--Enter Booking Details--");
		br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter bookid: ");
		int bookid = Integer.parseInt(br.readLine());
		System.out.print("Enter flightid: ");
		int flightid = Integer.parseInt(br.readLine());
		System.out.print("Enter flight class(First/Business/Economy): ");
		String flightclass = br.readLine().toLowerCase();
		System.out.print("Enter the date of your jounrey: ");
		String dateOfFlight = br.readLine();
		System.out.print("Enter the date of booking: ");
		String dateOfBooking = br.readLine();
		System.out.print("Enter number of adults: ");
		int noOfAdult = Integer.parseInt(br.readLine());
		System.out.print("Enter number of child: ");
		int noOfChild = Integer.parseInt(br.readLine());
		System.out.print("Enter passenger gender: ");
		String gender = br.readLine().toLowerCase();
		System.out.print("Enter ticket fare: ");
		int ticketFare = Integer.parseInt(br.readLine());
		System.out.print("Enter the customerid: ");
		int customerid = Integer.parseInt(br.readLine());
		
		bookValid = new BookFlight();
		bookValid.setBookid(bookid);
		bookValid.setFlightid(flightid);
		bookValid.setFlightclass(flightclass);
		bookValid.setDateOfFlight(dateOfFlight);
		bookValid.setDateOfBooking(dateOfBooking);
		bookValid.setNoOfAdult(noOfAdult);
		bookValid.setNoOfChild(noOfChild);
		bookValid.setGender(gender);
		bookValid.setTicketFare(ticketFare);
		bookValid.setCustomerid(customerid);
		
	}
	
	public void detailList() {
		cusDetail = new ArrayList<>();
		cusDetail.add(new BookFlightList(bookValid.getBookid(), 
				bookValid.getFlightid(), bookValid.getFlightclass(), bookValid.getDateOfFlight(), 
				bookValid.getDateOfBooking(), bookValid.getNoOfAdult(), bookValid.getNoOfChild(), 
				bookValid.getGender(), bookValid.getTicketFare(), bookValid.getCustomerid()));
	}
	
	public void Passenger() throws NumberFormatException, IOException {
		System.out.println("--Add Passenger Details--");
		br = new BufferedReader(new InputStreamReader(System.in));
		psgInfo = new PassengerDetail();
		int bookid = 0, psgid = 0, psgage = 0;
		String psgname = null, bookStatus = null;
		boolean bookidMatch = false;
		do {
			System.out.print("Enter bookid: ");
			psgDetail = new ArrayList<>();
			bookid = Integer.parseInt(br.readLine());
			for (BookFlightList ticketList: cusDetail) {
				if (bookid == ticketList.bookid) {
					bookidMatch = true;
					System.out.print("Enter passengerid: ");
					psgid = Integer.parseInt(br.readLine());
					System.out.print("Enter passenger name: ");
					psgname = br.readLine().toLowerCase();
					System.out.print("Enter passenger age: ");
					psgage = Integer.parseInt(br.readLine());
					System.out.println("(Book/Cancel): ");
					bookStatus = br.readLine().toLowerCase();
					psgInfo.setBookid(bookid);
					psgInfo.setPassengerid(psgid);
					psgInfo.setPname(psgname);
					psgInfo.setAge(psgage);
					psgInfo.setBookingStatus(bookStatus);
					psgDetail.add(new AddPassenger(bookid, psgid, 
							psgname, psgage, bookStatus));
				} else {
					System.out.println("No ticket found with this bookid");
				}
			}
		}while(bookidMatch != true);
	}
	
	public void addPassenger() throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Do you want to add another passenger(y/n): ");
		String addPsg = br.readLine().toLowerCase();
		if (addPsg.equals("y")) {
			Passenger();
		}
	}
	
	public void deletePassenger() throws IOException {
		boolean psgFound = true;
		br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Do you want to remove passenger(y/n): ");
		String delPsg = br.readLine();
		do {
			if (delPsg.equals("y")) {
				System.out.print("Enter passenger id: ");
				int psgid = Integer.parseInt(br.readLine());
				for (AddPassenger psgList: psgDetail) {
					if (psgid == psgList.passengerid) {
						psgFound = false;
						System.out.println("Passenger removed");
					}
					else {
						System.out.println("Passenger Not Found");
						System.out.println("Try again");
					}
				}
			} else {
				psgFound = false;
			}
		} while(psgFound);
	}
	
	public void fetchTicketData() throws NumberFormatException, IOException, TicketNotAvailableException {
		System.out.println();
		System.out.println("Ticket details");
		String shouldContinue;
		br = new BufferedReader(new InputStreamReader(System.in));
		do {
			System.out.print("Enter your ticket id: ");
			int requestBookId = Integer.parseInt(br.readLine());
			for (BookFlightList ticketList: cusDetail) {
				if (ticketList.bookid == requestBookId) {
					System.out.println(ticketList);
				} else {
					System.out.println("Ticket Not Available");
				}
			}
			System.out.print("do you want continue Type 'y' to continue or 'n' to exit: ");
			shouldContinue = br.readLine();
		} while (shouldContinue.equals("y"));
	}
}
