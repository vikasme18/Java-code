package ques2;

public class Innova extends Toyota {

	String name = "Innova";
	int enigne_bhp = 110;
	
	@Override
	public void mileage() {
		mileage += 14;
		System.out.println(name + " milage " + mileage);
	}
	
	@Override
	public void moving() {
		System.out.println(name + " Moving");
	}
	
}
