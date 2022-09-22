package ques2;

public class Toyota extends Vehicle {
	
	String name = "Toyota";
	double engine_bhp = 0;
	int mileage = 0;
	
	public void mileage() {
		System.out.println(mileage);
	}
	
	@Override
	public void moving() {
		System.out.println(name + "Car Moving");
	}
}
