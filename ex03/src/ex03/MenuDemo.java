package ex03;
import java.util.Scanner;
public class MenuDemo {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = 0;
		String sel;
		do {                 // �u�n��J�����O�j�p�g��E�A�N�~�����{��
			System.out.println("********** ���  **********");
			System.out.println("\tA. ����");
			System.out.println("\tB. �T����");
			System.out.println("\tC. ���}�t��");
			System.out.println("*************************");
			do {             // �����JA~C�~���}�j��
				System.out.print("�п�ܥ\��: ");
				sel = scn.next().toUpperCase();    // ��J�r���ন�j�g
			} while ("ABC".indexOf(sel) == -1);
			if(!(sel.equals("C"))) {
				System.out.print("�п�J���: ");
				num = scn.nextInt();				
			}
			switch (sel) {
			case "A":
				System.out.printf(" %d ������ = %d%n", num, num * num);
				break;
			case "B":
				System.out.printf(" %d ���T���� = %d%n", num, num * num * num);
				break;
			case "C":
				System.out.println("�����{��");
			}
		} while (!(sel.equals("C")));
		scn.close();
	}
}
