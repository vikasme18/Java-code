package runtime;

public class Realme extends Phone {
	
	@Override
	public void price() {
		System.out.println("Price: 30,000");
	}
	
	@Override
	public void ram() {
		System.out.println("Ram: 8GB");
	}
	
	@Override
	public void processor() {
		System.out.println("Process: Qualcomm Snapdragon 870");
	}

	@Override
	public void turnOn() {
		System.out.println("Realme Phone is Turning On");
	}


	@Override
	public void turnOff() {
		System.out.println("Realme Phone is Turning Off");
	}

}
