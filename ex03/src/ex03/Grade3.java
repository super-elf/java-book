package ex03;
import java.util.Scanner;
public class Grade3 {
	@SuppressWarnings("preview")
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J�Ҹդ���: ");
		int score = scn.nextInt();
		
		char grade = switch(score / 10) {
		    case 10,9,8 -> '��';
		    case 7 -> '�A';
		    case 6 -> '��';	
		    default -> '�B'; 
	    };
		System.out.println(score + "���O�ݩ�" + grade + "�Ū����Z�C");
		scn.close();
	}
}