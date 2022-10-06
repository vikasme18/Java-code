package lab5;

public class Mercedes extends Car {
	String name = "Mercedes";
	int top_speed = 240;
	int no_of_doors = 4;
	boolean sun_roof = true;

	@Override
	void moving() {
		System.out.println("Mercedes moving");
	}

	@Override
	void gearShifting() {
		System.out.println("Shifting gears in mercedes");
	}
	
	void memorySeats() {
		System.out.println("Mercedes is adjusting your seat.");
	}

}
