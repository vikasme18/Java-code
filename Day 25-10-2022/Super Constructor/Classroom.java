package task1;

public class Classroom extends College {
	public Classroom(int classNo, String collegeName, int collegeNo) {
		super(collegeName, collegeNo);
		System.out.println("Base Class Constructor");
		System.out.println("Class No : " + classNo);
	}
}
