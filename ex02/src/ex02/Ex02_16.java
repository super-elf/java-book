package ex02;
import java.util.Scanner;
public class Ex02_16 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J�z���m�W�G");
		String name = scn.nextLine(); // Ū�J�@��r��ë��w��name�r���ܼ�
		System.out.printf("%s �z�n!!%n", name);
		System.out.print("�п�J��Ӿ�ơA�����Ϊťն��j�G");
		int num1 = scn.nextInt(); // Ū�J�@�Ӿ�ƨë��w��age�ܼ�
		int num2 = scn.nextInt(); // Ū�J�@�Ӿ�ƨë��w��age�ܼ�
		System.out.printf("%d + %d = %d%n", num1, num2, num1 + num2);
		scn.close();
	}
}
