package ex03;
import java.util.Scanner;
public class NestWhile {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String msg = "�y��\t�p��\t�{�]\t�`��\n";
		String score = "";        // ��J������
		int sum = 0; int no = 0; int sub = 0;    // �`���B �y���B ���
		while (++no <= 3) {
			msg += no + "��\t";
			sum = 0; sub = 0; 	        // �]�`���B��ج�0
			while (++sub <= 2) {
				System.out.print("�п�J"+no+"��"+(sub==1 ?"�p��":"�{�]")+"����:");
				score = scn.nextLine();  // Ū������
				msg += score + "\t";     // �N���ƥ[�Jmsg�r��
				sum += Integer.parseInt(score);  // �N�����ন��ƫ�[�Jsum
			}
			msg += sum + "\n";       // msg�r��[�J����Ÿ�
		}
		System.out.println(msg);     // ���msg�r��
		scn.close();
	}
}
