package threadMethod;

class MyThread extends Thread {  //�~��Thread���O
	MyThread() {
		start();  //�Ұʰ����
	}

	public void run() {
		try {
			for (int i = 1; i <= 5; i++) {
				System.out.println(getName()+"������G" + " ����� " + i + "��");
				sleep(500);  //������Ȱ�0.5��
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class ThreadMethod {
	public static void main(String[] args) {
		MyThread obT1 = new MyThread();
		obT1.setName("T1");  //�]�w������W�٬�T1
		System.out.println("�ثe����������G" + Thread.currentThread().getName());
		System.out.println("����� T1 �O�_���ۡG" + obT1.isAlive());
		try {
			obT1.join();  //���ݩҩI�s��obT1��������槹��
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("�����T1 �O�_���ۡG" + obT1.isAlive());
	}
}
