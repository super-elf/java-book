package ex03;
import java.util.Scanner;
public class Grade {
	//@SuppressWarnings("preview")
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		char grade;
		System.out.print("�п�J�Ҹդ���: ");
		int score = scn.nextInt();
		//switch (score / 10) {
		//	case 10,9,8 -> grade = '��';
		//	case 7 -> grade = '�A';
		//	case 6 -> grade = '��';	
		//	default -> grade = '�B'; 
		//}
		switch (score / 10) {
			case 10: // �H�U�O�ݩ�үŪ�����
			case 9:
			case 8:
				grade = '��';	break;
			case 7: // �ݩ�A�Ū�����
				grade = '�A';	break;
			case 6: // �ݩ���Ū�����
				grade = '��';	break;
			default:// �ݩ�B�Ū�����
				grade = '�B'; 
		}
		System.out.println(score + "���O�ݩ�" + grade + "�Ū����Z�C");
		scn.close();
	}
}
