package ex03;
import java.util.Scanner;
public class ElseIfElse {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("叫块ノ计: ");
		int deg = scn.nextInt();   // 眔ノ计
		double unit;               // –虫基
		if (deg <= 10) {           // 璝计单10
			unit = 7.35;           // –7.35じ
		} else if (deg > 10 && deg <= 30) {     // 璝计ざ10~30
			unit = 9.45;           // –9.45じ
		} else if (deg > 30 && deg <= 50) {     // 璝计ざ30~50
			unit = 11.55;          // –11.55じ
		} else {                   // ㄤ緇50
			unit = 12.075;         // –12.075じ
		}
		System.out.printf("–%6.3f じ%n", unit);
		System.out.printf("龟禣%d じ", (int) (deg * unit));
		scn.close();
	}
}
