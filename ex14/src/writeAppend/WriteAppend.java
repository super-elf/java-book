package writeAppend;

import java.io.IOException;
import java.util.Scanner;
import java.io.*;

public class WriteAppend {
	public static void main(String[] args) {
		try {
			System.out.print("�п�J�ɮ׸��|�G");
			Scanner sn = new Scanner(System.in);
			String fpath, newdata;
			fpath = sn.nextLine();
			System.out.print("�п�J�s�W��ơG");
			newdata = sn.nextLine();
			BufferedWriter fout = new BufferedWriter(new FileWriter(fpath, true));
			fout.write(newdata);
			fout.newLine();
			fout.close();
			sn.close();
			System.out.println(fpath + " �g�ɧ���\n�[�J " + newdata);
		} catch (IOException e) {
			System.out.println("��J�ɮ׸��|���~!!");
		}
	}
}
