package ex03;
import java.util.Scanner;
public class Train {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J������:");
		int km = scn.nextInt();
		System.out.print("�п�J�Ʀr��ܨ���(1-�۱j�B2-�����B3-�_��/�϶�):");
		int kind = scn.nextInt();
		double unit;
		if(kind==1) {
			unit=2.27;
		} else if(kind==2) {
			unit=1.75;
		} else {
			unit=1.46;
		}
		System.out.print("�п�J�Ʀr��ܥh�^(1-��{�B2-�h�^):");
		int back = scn.nextInt();
		double returnT = back == 1 ? 1 : 1.8;
		System.out.printf("����: %4d ��%n", (int) (km * unit * returnT));
		scn.close();
	}
}
