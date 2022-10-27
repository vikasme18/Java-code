package lab8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class ReadWriteFile {
	
	static void readFile() throws FileNotFoundException {
		try {
			int i = 0;
			FileInputStream file = new FileInputStream("D://FileHandling//demo6.txt");
			while ((i=file.read()) != -1) {
				System.out.print((char)i);
			}
			file.close();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	static void writeFile() {
		try {
			FileOutputStream file = new FileOutputStream("D://FileHandling//demo7.txt");
			String msg = "Taj Mahal";
			byte[] msgArr = msg.getBytes();
			file.write(msgArr);
			System.out.println("Content as been written successfully");
			file.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		System.out.print("type 1 to read a file or 2 to write a file: ");
		int userSelection = sc.nextInt();
		if (userSelection == 1) {
			ReadWriteFile.readFile();
		} else if (userSelection == 2) {
			ReadWriteFile.writeFile();
		} else {
			System.out.println("Invalid input");
		}
		sc.close();
	}
}
