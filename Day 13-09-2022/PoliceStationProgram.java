class PoliceStationProgram {

	void Area(int pincode) {
		System.out.println(pincode);
	}
	
	void Area(int pincode, String police_s) {
		System.out.println(pincode);
		System.out.println(police_s);
	}

	void Area(int pincode, String police_s, String city) {
		System.out.println(pincode);
		System.out.println(police_s);
		System.out.println(city);
	}	

	public static void main(String[] args) {
		java.util.Scanner scan = new java.util.Scanner(System.in);
		System.out.print("How many data you want to enter: ");
		int num_data = scan.nextInt();
		
		PoliceStationProgram ps1 =  new PoliceStationProgram();
		
		switch(num_data) {
			case 1:
				ps1.Area(421306);
				break;
			case 2:
				ps1.Area(421306, "Chinchpada");
				break;
			case 3:
				ps1.Area(421306, "Chinchpada", "Kalyan");
				break;
			default: 
				System.out.print("Invalid Input");
		}
	}
}