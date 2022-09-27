package abstract2;

public class RealMe extends Mobile {
	
	public void camera() {
		System.out.println("Realme Camera");
	}

	@Override
	public void ring() {	
		System.out.println("RealMe ringing");
	}
	
	@Override
	public void pick() {
		System.out.println("picking a call on realme");
	}

}
