
package taskio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class MultipleFileRead {
	public static void main(String[] args) throws IOException {
		FileInputStream fInput1 = new FileInputStream("D:\\FileHandling\\abc.txt");
		FileInputStream fInput2 = new FileInputStream("D:\\FileHandling\\xyz.txt");
		SequenceInputStream seqInput = new SequenceInputStream(fInput1, fInput2);
		FileOutputStream fout = new FileOutputStream("D:\\FileHandling\\hai.txt");
		int i;
		while ((i = seqInput.read()) != -1) {
			fout.write((char)i);
		}
		System.out.println("File has been copied");
		fInput1.close();
		fInput2.close();
		seqInput.close();
		fout.close();
	}
}
