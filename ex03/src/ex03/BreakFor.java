package ex03;
import java.util.Scanner;
public class BreakFor {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J����ơG");
		int num= scn.nextInt();
		boolean prm = true;  	// �w�]prm��true�A�����
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				prm = false;      // �]prm��false�A���O���
				break;	// ���}for�j��
			}
		}
		if (prm == true) 
			System.out.printf("%d �O���", num);
		else
			System.out.printf("%d ���O���", num);
		scn.close();
	}
}
