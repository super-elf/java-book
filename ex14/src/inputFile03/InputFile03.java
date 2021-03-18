package inputFile03;

import java.io.*;

public class InputFile03 {
	public static void main(String[] args) {
		String str = "Hello World!!!";
		byte b[] = str.getBytes();
		ByteArrayInputStream f = new ByteArrayInputStream(b);
		int size = f.available();
		for (int i = 0; i < size; i++) {
			int ch = f.read();
			System.out.print((char) ch);
		}
	}
}
