package inputFile02;

import java.io.*;

public class InputFile02 {
	public static void main(String args[]) {
		try {
			BufferedInputStream fin = new BufferedInputStream(new FileInputStream("C:/Java/ex14/mytxt.txt"));
			int size = fin.available();
			byte b[] = new byte[size];
			fin.read(b);
			System.out.println("C:/Java/ex14/mytxt.txt �iŪ�줸�ժ��ƶq�G " + size);
			for (int i = 0; i < size; i++) {
				System.out.print((char) b[i]);
			}
			fin.close();
		} catch (IOException e) {
			System.out.println("��J�ɮ׸��|���~!!");
		}
	}
}