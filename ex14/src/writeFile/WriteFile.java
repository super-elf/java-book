package writeFile;

import java.io.*;

public class WriteFile {
	public static void main(String[] args) {
		try {
			String fpath = "D:/pair.txt";
			BufferedWriter fout = new BufferedWriter(new FileWriter(fpath));
			fout.write("花花世界,看不完紅男綠女");
			fout.newLine();
			fout.close();
			System.out.println(fpath + " 寫檔完成");
		} catch (IOException e) {
			System.out.println("輸入檔案路徑有誤!!");
		}
	}
}
