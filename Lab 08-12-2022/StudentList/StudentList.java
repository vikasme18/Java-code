package testclass;

import java.util.ArrayList;

public class StudentList {
	public String student(int index) {
		ArrayList<String> students = new ArrayList<String>();
		students.add("vikas");
		students.add("ashutosh");
		students.add("rajnish");
		students.add("pratham");
		return students.get(index);
	}
}
