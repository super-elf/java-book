package ex04;
import java.util.Scanner;
public class Order {
	public static void main(String[] args) {
		String[][] menu = new String[3][];
		menu[0] = new String[] { "���ĨF��", "�M���F��" };
		menu[1] = new String[] { "�������L", "�g�����", "��������" };
		menu[2] = new String[] { "���", "�@��", "�h���", "�B�L" };
		int[] sel = new int[] { 0, 0, 0 };
		Scanner scn = new Scanner(System.in);
		for (int i = 0; i < menu.length; i++) { //menu.length��Ĥ@���}�C�Ӽ�
			System.out.println("** �п�� **");
			for (int j = 0; j < menu[i].length; j++) {
				System.out.println(menu[i][j] + " ->��J" + (j + 1));
			}
			sel[i] = scn.nextInt() - 1; // ��J��-1����Э�
		}
		System.out.println("** �z��� **");
		System.out.printf("�e��G%s�A�D�\�G%s�A���ơG%s",
		               menu[0][sel[0]], menu[1][sel[1]], menu[2][sel[2]]);
		scn.close();
	}
}
