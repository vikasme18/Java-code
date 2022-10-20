package lab7;

public class ThreadSchedular implements Runnable {

	Thread t;
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + "  "+ i); 
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
	
	public static void main(String[] args) {
		Thread ts1 = new Thread(new ThreadSchedular());
		ts1.start();
	}


}
