package runtime;

public class PhoneMain {
	
	public static void main(String[] args) {
			Phone phone1 = new MobileFactory().buyPhone();
			User u1 = new User();
			
			if (phone1 != null) {
				u1.using(phone1);
			}
			else {
				System.out.println("Sorry, we don't have this phone.");
			}
	}
}