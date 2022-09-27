package abstract2;

public class Mobile extends Phone {
	
	@Override
	public void turnOn() {
		System.out.println("Mobile turning on");
	}
	
	public void connecting() {
		System.out.println("Mobile connecting to internet");
	}

	@Override
	public void ring() {
		System.out.println("Mobile ringing");
	}

	@Override
	public void pick() {
		System.out.println("Picking mobile");
	}
	
	@Override
	public void turnOff() {
		System.out.println("Mobile turning off");
	}
	
}
