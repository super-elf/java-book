package ex05;

public class Static1 {
	static void sub(int x, int y) { // �Q�I�s��k�D��
		System.out.print("�I�sStatic1���O��sub��k-->");
		System.out.println(x + " - " + y + " = " + (x - y));
	}
	public static void main(String[] args) {
		int a = 25;
		// �I�s�P�@���O��sub��k
		sub(a - 5, 3); // �I�s�ԭz
		// �I�s���P���O��sub��k
		Static2.sub(a + 3, 5); // �I�s�ԭz
	}
}

class Static2 {
	static void sub(int x, int y) { // �Q�I�s��k�D��
		System.out.print("�I�sStatic2���O��sub��k-->");
		System.out.println(x + " - " + y + " = " + (x - y));
	}
}
