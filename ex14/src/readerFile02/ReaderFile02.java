package readerFile02;

import java.io.*;
import java.util.Scanner;

public class ReaderFile02 {
	public static void main(String[] args) {
		try {
			System.out.print("�п�J�ɮ׸��|�G");
			Scanner sn = new Scanner(System.in);
			String fpath = sn.next();
			File f = new File(fpath);
			FileReader fin = new FileReader(f);
			int size = (int) f.length();
			String name = f.getName();
			char buffer[] = new char[size];
			System.out.println("�ɮצW�١G" + name);
			System.out.println("�ɮ��`���סG" + size);
			fin.read(buffer);
			System.out.println(buffer);
			fin.close();
			sn.close();
		} catch (IOException e) {
			System.out.println("��J�ɮ׸��|���~!!");
		}
	}
}
