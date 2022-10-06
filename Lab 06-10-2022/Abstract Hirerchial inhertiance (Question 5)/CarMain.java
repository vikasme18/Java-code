package lab5;

public class CarMain {

	public static void main(String[] args) {
		Car c1 = new Fortuner();
		Car c2 = new Mercedes();
		Car c3 = new Chiron();
		
		
		c1.start();
		c1.moving();
		if (c1 instanceof Car) {
			System.out.println(((Fortuner) c1).name);
			((Fortuner) c1).fourWheelDrive();
		}
		System.out.println();
		
		c2.start();
		c2.moving();
		if (c2 instanceof Car) {
			System.out.println(((Mercedes) c2).name);
			((Mercedes) c2).memorySeats();
		}
		System.out.println();
		
		c3.start();
		c3.moving();
		if (c3 instanceof Car) {
			System.out.println(((Chiron) c3).name);
			((Chiron) c3).chironSpeed();
		}
		
	}

}
