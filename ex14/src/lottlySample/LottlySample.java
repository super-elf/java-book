package lottlySample;

import java.io.*;

public class LottlySample {
	public static void main(String[] args) {
		int[] lot = new int[49];
		String str = "";
		int[] myNum = new int[7];
		int maxIndex;
		int r = 0;
		for (int k = 0; k < 10; k++) {
			str += "第 " + (k + 1) + " 組：";
			maxIndex = lot.length - 1;
			for (int i = 0; i < lot.length; i++) {
				lot[i] = (i + 1);
			}
			for (int i = 0; i < myNum.length; i++) {
				r = (int) Math.floor(Math.random() * maxIndex);
				myNum[i] = lot[r];
				lot[r] = lot[maxIndex];
				maxIndex--;
			}
			str += myNum[0] + " " + myNum[1] + " " + myNum[2] + " " + myNum[3] + " " + myNum[4] + " " + myNum[5]
					+ "\t\t特別號：" + myNum[6] + "\r\n";
		}
		try {
			String fpath = "D:/lottly.txt";
			BufferedWriter fout = new BufferedWriter(new FileWriter(fpath));
			fout.write(str);
			fout.close();
		} catch (IOException e) {
			System.out.println("輸入檔案路徑有誤!!");
		}
		System.out.println("如下資料已寫入D:/lottly.txt內：");
		System.out.println(str);
	}
}