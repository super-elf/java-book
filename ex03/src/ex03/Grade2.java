package ex03;
import java.util.Scanner;
public class Grade2 {
	@SuppressWarnings("preview")
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J�Ҹդ���: ");
		int score = scn.nextInt();
		char grade;
		switch (score / 10) {
			case 10,9,8 -> grade = '��';
			case 7 -> grade = '�A';
			case 6 -> grade = '��';	
			default -> grade = '�B'; 
		}
		System.out.println(score + "���O�ݩ�" + grade + "�Ū����Z�C");
		scn.close();
	}
}
