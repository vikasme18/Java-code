package abstract2;

public class MainPhone {
	public static void main(String[] args) {
		Phone m = new Iphone();
		m.ring();
		m.pick();
		if (m instanceof Iphone) {
			((Iphone) m).camera();
		}
		
		m = new Mi();
		m.ring();
		m.pick();
		if (m instanceof Mi) {
			((Mi) m).camera();
		}
		
		m = new RealMe();
		m.ring();
		m.pick();
		if (m instanceof RealMe) {
			((RealMe) m).camera();
		}
		
		m.turnOn();
		m.turnOff();
		
		if (m instanceof Mobile) {
			((Mobile) m).connecting();
		}
	}
}
