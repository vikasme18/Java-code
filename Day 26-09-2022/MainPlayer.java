package firstproject;

public class MainPlayer {

	public static void main(String[] args) {
		Player p = new Player();
		p.jersey();
		
		p = new Cricketer(); // upcasting
		p.jersey();
		
		if (p instanceof Cricketer) {
			((Cricketer) p).bat(); // downcasting
			((Cricketer) p).ball();
		}
		
		p = new Footballer(); // upcasting
		p.jersey();
		
		if (p instanceof Footballer) {
			((Footballer) p).goal(); // downcasting
			((Footballer) p).defence();	
		}
	}

}
