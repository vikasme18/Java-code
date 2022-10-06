package lab5;

public class Chiron extends Car {
	String name = "Chiron";
	int top_speed = 400;
	int no_of_doors = 2;
	boolean sun_roof = false;

	@Override
	void moving() {
		System.out.println("Chiron moving");
	}

	@Override
	void gearShifting() {
		System.out.println("Shifting gears in chiron");
	}
	
	void chironSpeed() {
		System.out.println("Chiron change to sport mode");
	}

}
