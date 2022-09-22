package ques2;

public class Fortuner extends Toyota {
	
	String name = "Fortuner";
	int enigne_bhp = 150;
	
	@Override
	public void mileage() {
		mileage += 10;
		System.out.println(name + " milage " + mileage);
	}
	
	@Override
	public void moving() {
		System.out.println(name + "Moving");
	}
}
