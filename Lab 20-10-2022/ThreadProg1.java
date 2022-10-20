package lab7;

public class ThreadProg1 {
	
	public static void main(String[] args) {
		Thread th1 = new Thread();
		Thread th2 = new Thread();
		th1.start();
		th2.start();
		th1.setName("Vikas");
		th2.setName("Ashutosh");
		System.out.println("After chaning the name of th1 : " + th1.getName());
		System.out.println(th2.getName());
	}
	
}
