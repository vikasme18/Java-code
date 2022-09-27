package abstract2;

public class Iphone extends Mobile {

	public void camera() {
		System.out.println("Iphone Camera");
	}
	
	@Override
	public void ring() {
		System.out.println("IPhone is ringing");
	}

	@Override
	public void pick() {
		System.out.println("picking a call on iphone");
	}
	
}
