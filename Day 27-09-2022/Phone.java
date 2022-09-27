package abstract2;

public abstract class Phone {
	
	public void turnOn() {
		System.out.println("Phone turning on");
	}
	
	public abstract void ring();
	
	public abstract void pick();
	
	public void turnOff() {
		System.out.println("Phone turning off");
	}
}
