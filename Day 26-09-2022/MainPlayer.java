package firstproject;

public class MainPlayer {

	public static void main(String[] args) {
		Player p = new Player();
		p.jersey();
		
		p = new Cricketer(); // upcasting
		p.jersey();
		
		if (p instanceof Cricketer) {
			((Cricketer) p).bat(); // downcasting
		}
		
		if (p instanceof Cricketer) {
			((Cricketer) p).ball(); // downcasting
		}
		
		p = new Footballer(); // upcasting
		p.jersey();
		
		if (p instanceof Footballer) {
			((Footballer) p).goal(); // downcasting
			
		}
		
		if (p instanceof Footballer) {
			((Footballer) p).defence(); // downcasting
		}
		
		
	}

}
