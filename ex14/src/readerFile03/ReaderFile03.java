package readerFile03;
import java.util.Scanner;
import java.io.*;

public class ReaderFile03 {
	public static void main(String[] args) {
		String data;
		try {
			System.out.print("�п�J�ɮ׸��|�G");
			Scanner sn = new Scanner(System.in);
			String fpath = sn.next();
			FileReader f = new FileReader(fpath);
			BufferedReader bfin = new BufferedReader(f);
			do {
				data = bfin.readLine();
				if (data == null) {
					break;
				}
				System.out.println(data);
			} while (true);
			bfin.close();
			sn.close();
		} catch (IOException e) {
			System.out.println("��J�ɮ׸��|���~!!");
		}
	}
}