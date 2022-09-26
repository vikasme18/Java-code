package firstproject;

public class Cricketer extends Player {
	
	public void bat() {
		System.out.println("Batting...");
	}
	
	public void ball() {
		System.out.println("Balling...");
	}
	
	@Override
	public void stadium() {
		System.out.println("Cricket Stadium - M. A. Chidambaram Stadium");
	}
	
	@Override
	public void jersey() {
		System.out.println("Blue jersey for cricketer");
	}
}
