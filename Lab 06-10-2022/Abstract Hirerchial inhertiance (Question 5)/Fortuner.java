package lab5;

public class Fortuner extends Car {
	String name = "Fortuner";
	int top_speed = 180;
	int no_of_doors = 4;
	boolean sun_roof = false;

	@Override
	void moving() {
		System.out.println("Fortuner moving");
	}

	@Override
	void gearShifting() {
		System.out.println("Shifting gears in fortuner");
	}
	
	void fourWheelDrive() {
		System.out.println("Engaging 4x4 in fortuner.");
	}
	
}