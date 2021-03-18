package fileSample;
import java.io.*;
import java.util.Scanner;

public class FileSample {
	public static void main(String[] args) {
		String msg, fname, fpath;
		System.out.print("�п�J�ɦW�G");
		Scanner sn = new Scanner(System.in);
		fpath = sn.next();
		File fin = new File(fpath);
		fname = fin.getName();
		long len = fin.length();
		msg = "�ɮצW�١G" + fname;
		if (fin.isFile()) {
			msg += "�O�@���ɮ�.";
		} else if (fin.isDirectory()) {
			msg += "�O�@�ӥؿ�.";
		} else {
			System.out.print("�L���ɮשΥؿ�");
			System.exit(0);
		}
		System.out.print(msg + "\n�ɮת���" + String.valueOf(len));
		sn.close();
	}
}
