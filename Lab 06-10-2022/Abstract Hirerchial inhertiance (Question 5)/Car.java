package lab5;

public abstract class Car {
	int no_of_tires = 4;
	
	public void start() {
		System.out.println("Car is starting...");
	}
	
	abstract void gearShifting();
	
	abstract void moving();
	
	public void steering() {
		System.out.println("Steer to left");
	}
}
