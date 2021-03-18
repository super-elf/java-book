package runnableThread;

class MyThread2 implements Runnable {
	int m; 				// m�����檺����
	MyThread2(int a) { 		// MyThread���O���غc��
		m = a;
	}
	public void run() { 	// �мgrun��k
		for (int i = 1; i <= m; i++) {
			System.out.println(Thread.currentThread().getName() + " = " + i);
		}
	}
}

public class RunnableThread {
	public static void main(String[] args) {
		//�إ�Runnable����obR1�A�öǤJ�޼�20
		MyThread2 obR1 = new MyThread2(20);
		//�إ�Runnable����obR2�A�öǤJ�޼�25
		MyThread2 obR2 = new MyThread2(25);
		//�إ�Thread����obT1�A�öǤJobR1�M������W��
		Thread obT1 = new Thread(obR1, "�����1");
		//�إ�Thread����obT2�A�öǤJobR2�M������W��
		Thread obT2 = new Thread(obR2, "�����2");
		obT1.start(); // �Ұ�obT1�����
		obT2.start(); // �Ұ�obT2�����
	}
}
