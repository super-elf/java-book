package arithmeticExceptionDemo;

public class ArithmeticExceptionDemo {
	public static void main(String[] args) {
	    int a=3, b=0, c;
		try {
		    c = a / b;  //a���Hb���w��c�A��b��0�A�ҥH�|�o�Ͱ��Ƭ�0���ҥ~
		    System.out.println( a + "��" + b + " ����" + c);
		}
		catch(ArithmeticException e) {
		    System.out.println("�ҥ~���e�G" + e.toString());
		    System.out.println("�]�N�O�G�ƾǹB����~�A�p���Ƭ�0");
		}
		System.out.println("�{���̫�@����槹��");
	}
}
