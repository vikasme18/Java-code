package firstproject;

public class Footballer extends Player {
	public void goal() {
		System.out.println("Goal...");
	}
	
	public void defence() {
		System.out.println("Defencing...");
	}
	
	@Override
	public void stadium() {
		System.out.println("Footballer stadium - Wembley Stadium, London, England");
	}
	
	@Override
	public void jersey() {
		System.out.println("Red jersey for footballer");
	}
}
