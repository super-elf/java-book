package writeFile;

import java.io.*;

public class WriteFile {
	public static void main(String[] args) {
		try {
			String fpath = "D:/pair.txt";
			BufferedWriter fout = new BufferedWriter(new FileWriter(fpath));
			fout.write("���@��,�ݤ������k��k");
			fout.newLine();
			fout.close();
			System.out.println(fpath + " �g�ɧ���");
		} catch (IOException e) {
			System.out.println("��J�ɮ׸��|���~!!");
		}
	}
}
