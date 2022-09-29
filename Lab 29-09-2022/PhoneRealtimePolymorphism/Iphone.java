package runtime;

public class Iphone extends Phone {

	@Override
	public void price() {
		System.out.println("Price: 1,40,000");
	}
	
	@Override
	public void ram() {
		System.out.println("Ram: 12GB");
	}
	
	@Override
	public void processor() {
		System.out.println("Process: A16 Bionic");
	}
	
	@Override
	public void turnOn() {
		System.out.println("IPhone is Turning On");
	}

	@Override
	public void turnOff() {
		System.out.println("IPhone is Turning Off");
	}

}
