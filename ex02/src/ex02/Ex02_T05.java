package ex02;
import java.util.Scanner;
public class Ex02_T05 {
    public static String getDate(){
        System.out.print("�п�J��¾���(�榡�GMMDDYYYY)");
        Scanner sc = new Scanner(System.in);
        String startDate = sc.next();
        sc.close();
        return startDate;
    }

	public static void main(String[] args) {
        System.out.printf("��¾���= %s", getDate());
	}
}
