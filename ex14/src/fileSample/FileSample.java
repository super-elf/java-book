package fileSample;
import java.io.*;
import java.util.Scanner;

public class FileSample {
	public static void main(String[] args) {
		String msg, fname, fpath;
		System.out.print("請輸入檔名：");
		Scanner sn = new Scanner(System.in);
		fpath = sn.next();
		File fin = new File(fpath);
		fname = fin.getName();
		long len = fin.length();
		msg = "檔案名稱：" + fname;
		if (fin.isFile()) {
			msg += "是一個檔案.";
		} else if (fin.isDirectory()) {
			msg += "是一個目錄.";
		} else {
			System.out.print("無此檔案或目錄");
			System.exit(0);
		}
		System.out.print(msg + "\n檔案長度" + String.valueOf(len));
		sn.close();
	}
}
