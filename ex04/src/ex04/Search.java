package ex04;
import java.util.Arrays;
import java.util.Scanner;
public class Search {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String[] aName = { "Jerry", "Jack", "Winnie", "Max", "Amy",
		                   "Peter", "Tony" };
		System.out.print("�Ƨǫe: ");
		for (int i = 0; i < aName.length; i++)
			System.out.print(aName[i] + ", ");
		System.out.println();
		Arrays.sort(aName);
		System.out.print("�Ƨǫ�: ");
		for (int i = 0; i < aName.length; i++)
			System.out.print(aName[i] + ", ");
		System.out.println();
		System.out.print("�п�J�j�M��: ");
		String sName = scn.nextLine();
		int find = -1;
		if ((find = Arrays.binarySearch(aName, sName)) > -1) {
			System.out.println("��� "+sName +"������ " + find + " �B");
		} else
			System.out.println("�䤣��"+sName);
		scn.close();
	}
}
