package ex05;

public class MyClass {
	void sub(int x, int y) {
		System.out.print(" �I�sMyClass���O��sub��k-->");
		System.out.println(x + " - " + y + " = " + (x - y));
	}

	public static void main(String[] args) {
		int a = 25;
		MyClass c1 = new MyClass(); // �إ��ݩ�MyClass���O������c1
		c1.sub(a - 5, 3); // �I�s����c1��sub��k
		MyCal c2 = new MyCal(); // �إ��ݩ�MyCal���O������c2
		c2.sub(a + 3, 5); // �I�s����c2��sub��k
	}
}

class MyCal {
	void sub(int x, int y) {
		System.out.print(" �I�sMyCal  ���O��sub��k-->");
		System.out.println(x + " - " + y + " = " + (x - y));
	}
}
