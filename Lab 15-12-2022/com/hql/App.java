package com.hql;
import java.util.List;

public class App {
    public static void main(String[] args) {
    	StudentEdit studentDao = new StudentEdit();
        Student student = new Student("Vikas", "Meena", "vikas12@gmail.com");
        studentDao.saveStudent(student);

        studentDao.insertStudent();

        // update student
        Student student1 = new Student("Ravi", "Mishra", "ravimishra3@gmail.com");
        studentDao.updateStudent(student1);

        // get students
        List < Student > students = studentDao.getStudents();
        students.forEach(s -> System.out.println(s.getFirstName()));

        // get single student
        Student student2 = studentDao.getStudent(1);
        System.out.println(student2.getFirstName());

        // delete student
        studentDao.deleteStudent(1);
    }
}
