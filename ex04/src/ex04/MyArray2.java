package ex04;
public class MyArray2 {
	public static void main(String[] args) {
		int[] score = new int[] { 56, 75, 68, 32 };
		int pass = 0;
		for (int s : score) {      // �v�@Ū���}�Cn�������Ȩ��ܼ�i
			if (s >= 60)
				pass++;
		}
		System.out.println("�ή�ǥͤH�ơG " + pass);
	}
}
