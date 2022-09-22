package ques2;

public class VehicleMain {

	public static void main(String[] args) {
		Innova car1 = new Innova();
		Fortuner car2 = new Fortuner();
		
		car1.mileage();
		car2.mileage();
		
		car1.moving();
		car2.moving();
		
		Toyota toyo = new Toyota();
		toyo.moving();
		
		Vehicle veh = new Vehicle();
		veh.moving();
	}

}
