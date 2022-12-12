package com.hibernateproj;

import java.io.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
	static Configuration c;
	static SessionFactory factory;
	static Session ss;
	static BufferedReader br;
	static App app;
	static Employee emp;
	
	void insert() throws IOException {
		System.out.print("Enter employee name: ");
		emp.setName(br.readLine());
		System.out.print("Enter employee city: ");
		emp.setCity(br.readLine());
		ss.save(emp);
	}
	
	void delete() throws NumberFormatException, IOException {
		System.out.print("Enter employee id: ");
		emp.setId(Integer.parseInt(br.readLine()));
		ss.delete(emp);
	}
	
	void update() throws NumberFormatException, IOException {
		System.out.print("Enter employee id: ");
		emp.setId(Integer.parseInt(br.readLine()));
		System.out.print("Enter new employee name: ");
		emp.setName(br.readLine());
		System.out.print("Enter new employee city: ");
		emp.setCity(br.readLine());
		ss.update(emp);
	}
	
	void retrieve() {
		
	}

	public static void main(String[] args) throws Exception {
		br = new BufferedReader(new InputStreamReader(System.in));
		app = new App();
		
		emp = new Employee();
		c = new Configuration().configure().addAnnotatedClass(Employee.class);
		factory = c.buildSessionFactory();
		ss = factory.openSession();
		ss.beginTransaction();
		System.out.print("Your request(Enter 1 - insert, 2 - delete, 3 - update, 4 - retrieve): ");
		int userChoice = Integer.parseInt(br.readLine());
		switch (userChoice) {
		case 1: 
			app.insert();
			break;
		case 2:
			app.delete();
			break;
		case 3:
			app.update();
			break;
		default:
			System.out.print("Invalid request");
		}
		
		ss.getTransaction().commit();
		ss.close();
	}
}