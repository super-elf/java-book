package ex03;
import java.util.Scanner;
public class If {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J���O���B�G");
		int money = scn.nextInt();    // ���o��J�����B���নint��ƫ��O
		if(money>1000) {			    // �p�G���B�j��1000��
		   money = 1000 + (int)((money - 1000) * 0.9);	//�W�X�������E��
		}
		System.out.printf("��I���B�G%d ��%n", money);
		scn.close();
	}
}
