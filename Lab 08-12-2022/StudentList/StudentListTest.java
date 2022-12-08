package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import testclass.StudentList;

class StudentListTest {
	@Test
	void studentListCheck() {
		StudentList stud = new StudentList();
		String name = stud.student(0);
		assertEquals("vikas", name);
	}
}