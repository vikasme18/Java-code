package lab4;

public class AndroidPhoneMain {

	public static void main(String[] args) {
		AndroidPhone phone1 = new AndroidPhone(6, "Blue", "Realme");
		AndroidPhone phone2 = new AndroidPhone(4, "Grey", "Vivo");
		AndroidPhone phone3 = new AndroidPhone(8, "Black", "Oppo");
		AndroidPhone phone4 = new AndroidPhone(6, "Red", "ROG");
		
		AndroidPhone[] phonearr = new AndroidPhone[4];
		phonearr[0] = phone1;
		phonearr[1] = phone2;
		phonearr[2] = phone3;
		phonearr[3] = phone4;
		
		for (AndroidPhone phone : phonearr) {
			System.out.println("Phone Name: " + phone.name + ", Ram: " + phone.ram + ", Color: " + phone.color);
		}
	}

}
