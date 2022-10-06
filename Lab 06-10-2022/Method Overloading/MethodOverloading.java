package lab5;

public class MethodOverloading {
	
	public void area(int l, int b) {
		int result = l * b;
		System.out.println(result);
	}
	
	public void area(double l, double b) {
		double result = l * b;
		System.out.println(result);
	}

	public static void main(String[] args) {
		MethodOverloading mo = new MethodOverloading();
		mo.area(7, 3);
		mo.area(5.6, 3.5);
	}

}
