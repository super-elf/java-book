package ex03;
import java.util.Scanner;
public class ElseIfElse {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J�Τ��׼�: ");
		int deg = scn.nextInt();   // ���o�Τ��׼�
		double unit;               // �C�׳��
		if (deg <= 10) {           // �Y�׼Ƥp�󵥩�10
			unit = 7.35;           // �C��7.35��
		} else if (deg > 10 && deg <= 30) {     // �Y�׼Ƥ���10~30
			unit = 9.45;           // �C��9.45��
		} else if (deg > 30 && deg <= 50) {     // �Y�׼Ƥ���30~50
			unit = 11.55;          // �C��11.55��
		} else {                   // ��l�Y�j��50��
			unit = 12.075;         // �C��12.075��
		}
		System.out.printf("�C�סG%6.3f ��%n", unit);
		System.out.printf("��I���O�G%d ��", (int) (deg * unit));
		scn.close();
	}
}
