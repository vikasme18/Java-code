package taskio;

import java.io.FileOutputStream;

public class WriteTextFile {

	public static void main(String[] args) {
		try {
			FileOutputStream fout = new FileOutputStream("D:\\FileHandling\\Tasksample1.txt");
			String text = "hello sir";
			byte[] fileData = text.getBytes();
			fout.write(fileData);
			System.out.println("File written successfully");
			fout.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
