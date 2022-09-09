class StudentConstructor {

	// Student details
	int s_roll_no;
	String s_name;
	long s_number;
	
	// default constructor
	StudentConstructor() {
		System.out.println("I am default constructor...");
	}
	
	// Parameterised constructor
	StudentConstructor(int rollno, String name, long mobile) {
		s_roll_no = rollno;
		s_name = name;
		s_number = mobile;
	}

	// Method to print student details
	void showDetail() {
		System.out.println("Roll No: " + s_roll_no);
		System.out.println("Name: " + s_name);
		System.out.println("Mobile number: " + s_number);
		System.out.println();
	} 
	
	// calling main method
	public static void main(String[] args) {

		// It will call default constructor
		StudentConstructor stud1 = new StudentConstructor();
		
		System.out.println();
		
		// It will call parameterised constructor
		StudentConstructor stud2 = new StudentConstructor(9, "Vikas Meena", 9110011041L);
		StudentConstructor stud3 = new StudentConstructor(8, "Ashutosh Mishra", 9999406002L);
		StudentConstructor stud4 = new StudentConstructor(7, "Gyanendra Mishra", 8005000004L);
		StudentConstructor stud5 = new StudentConstructor(10, "Rajnish Mishra", 9111111122L);

		stud2.showDetail();
		stud3.showDetail();
		stud4.showDetail();
		stud5.showDetail();
	}

}