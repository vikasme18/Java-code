package abstract2;

public class Mi extends Mobile {
	
	public void camera() {
		System.out.println("Mi Camera");
	}
	
	@Override
	public void ring() {
		System.out.println("Mi Ringing");
	}

	@Override
	public void pick() {
		System.out.println("picking a call on Mi");
	}
	

}
