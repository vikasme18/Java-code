package lab8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterClass {
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("D://FileHandling//printwritefile.txt");
		String name = "Name: Vikas Meena\n";
		String address = "Address: kalyan, thane";
		PrintWriter pw = new PrintWriter(file);
		pw.write(name);
		pw.write(address);
		System.out.println("Content as been written successfully");
		pw.close();
	}
}
