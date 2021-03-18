package ex04;
import java.util.Scanner;
public class LineraSearch {
	public static void main(String[] args) {
		int[] Adata = new int[] { 5, 3, 1, 2, 10, 9, 4, 8, 7, 6 };
		for (int i = 0; i < Adata.length; i++) {
			System.out.print("  材 " + (i + 1) + "计=" + Adata[i]);
			if (i == 4 || i == 9)
				System.out.println();
		}
		Scanner scn = new Scanner(System.in);
		System.out.print(" 叫块璶穓碝计 ");
		int searchNum = scn.nextInt();
		int num = -1;                  // num单-1ボ⊿Τт戈
		for (int j = 0; j < Adata.length; j++) {
			if (Adata[j] == searchNum) {
				num = j;
				break;
			}
		}
		System.out.println("================");
		if (num == -1)
			System.out.println(" ⊿Τ硂计--> " + searchNum);
		else
			System.out.println(" " +searchNum +"琌材" + (num + 1)+ "计");
		scn.close();
	}
}
