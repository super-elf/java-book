package nonSynchronizedDemo;

class GoldClass implements Runnable { // ��@Runnable����
	int grabed; // �w���쪺�����ƶq
	static int totalGold = 20000000; // �����`��
	Thread t;

	GoldClass(String name) {
		grabed = 0;
		t = new Thread(this, name);
		t.start(); // �Ұʰ����
	}
	
	public void run() { // ��@Runnable������run()��k
		while (grabGold() == true) { // �P�_�����O�_�٦���
			grabed++; // ����@��
		}
		System.out.println(t.getName() + " �`�@���o " + grabed + " �Ӫ���.");
	}
	
	private static boolean grabGold() {
		if (totalGold > 0) { // �Y�����٦��Ѥ~�ఽ
			totalGold--; // ���@������
			return true;
		} else {
			return false;
		}
	}
 }

public class NonSynchronizedDemo {
	public static void main(String[] args) {
		System.out.println("�@�� " + GoldClass.totalGold + " �Ӫ���!");
		GoldClass tA = new GoldClass("�i�T");
		GoldClass tB = new GoldClass("���|");
		GoldClass tC = new GoldClass("����");
	}
}
