package ex03;
import java.util.Scanner;
public class NestIf {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num1, num2, num3, max;
		System.out.print("叫块计(フ跋筳):");
		num1 = scn.nextInt();
		num2 = scn.nextInt();
		num3 = scn.nextInt();
		if (num1 > num2) {        // ノ盻癹伴ㄓ耞计い街琌程计
			if (num1 > num3)
				max = num1;
			else
				max = num3;
		} else {
			if (num2 > num3)
				max = num2;
			else
				max = num3;
		}
		System.out.println("程计琌:" + max);
		scn.close();
	}
}
