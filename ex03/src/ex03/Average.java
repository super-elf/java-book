package ex03;
import java.util.Scanner;
public class Average {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int score = 0;	// ��J�����ƹw�]��0
		int sum = 0;	// �֭p���`�M
		int num = 0;		   // �w�]�H�Ƭ�0
		while (score != -1) {
			System.out.print("�п�J���� (��J-1����):");
			score = scn.nextInt();	// Ū������
			if(score != -1) {
		    	sum += score;		// �N��J���ƪ��[���`�Msum��
		    	num++;	// �H�ƥ[1        		
			}
		}
		System.out.printf("�������� = " + (double)((sum+1) / (num-1)));
		scn.close();
	}
}
