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
			str += "�� " + (k + 1) + " �աG";
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
					+ "\t\t�S�O���G" + myNum[6] + "\r\n";
		}
		try {
			String fpath = "D:/lottly.txt";
			BufferedWriter fout = new BufferedWriter(new FileWriter(fpath));
			fout.write(str);
			fout.close();
		} catch (IOException e) {
			System.out.println("��J�ɮ׸��|���~!!");
		}
		System.out.println("�p�U��Ƥw�g�JD:/lottly.txt���G");
		System.out.println(str);
	}
}