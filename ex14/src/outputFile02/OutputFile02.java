package outputFile02;

import java.io.*;

public class OutputFile02 {
	public static void main(String[] args) throws IOException {
		BufferedOutputStream fout = new BufferedOutputStream(new FileOutputStream("D:/Sample.txt"));
		String str = "Java SE";
		byte b[] = str.getBytes();
		for (int i = 0; i < b.length; i++) {
			fout.write(b[i]);
		}
		fout.close();
	}
}