package ex05;

public class CallByVal {
	public static void main(String[] args) {
		int a = 10, b = 15;
		System.out.println(" �ǭȩI�s�e\ta=" + a + "\tb=" + b );
		byVal(a, b);
		System.out.println(" �ǭȩI�s��\ta=" + a + "\tb=" + b );
	}

	static void byVal(int x, int y) {
		int t; //�H�ܼ�t�@���Ȧs�ϡA�N�޼Ƥ���
		t = x;
		x = y;
		y = t;
		System.out.println(" �ǭȩI�s��\tx=" + x + "\ty=" + y );
	}
}
