package parking;

class Drive implements Runnable {
	public void run() {
		System.out.println("�Ѥ��찱����");
		System.out.println("�R���b������");
		Thread machine = new Thread(new Power()); // �ŧimachine�����
		machine.start();   // �Ұ�machine������A�������}�l�B�@
		try {
			machine.join();  // ��machine�����������
		} catch (InterruptedException e) {
			System.out.println("�Ѥ��������I");
		}
		System.out.println("�Ѥ��i�H�}�����}");
	}
}

class Power implements Runnable {
	public void run() {
		System.out.println("���񦡰������}�l�B��");
		try {
			for (int i = 1; i <= 6; i++) {
				Thread.sleep(100);
				System.out.print(i * 5 + "��...");
			}
			System.out.println();
		} catch (InterruptedException e) {
			System.out.println("�������G�١A�L�k�X���I");
		}
		System.out.println("�z���R���w�g��F�X�f�I");
	}
}

public class Parking {
	public static void main(String[] args) {
		Thread wang = new Thread(new Drive()); // �ŧi wang �����
		wang.start(); // �Ұ� wang �����
	}
}
