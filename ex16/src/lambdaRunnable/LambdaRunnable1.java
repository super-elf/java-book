package lambdaRunnable;

class MyThread implements Runnable {// MyThread���O��@Runnable����
	public void run() { // ��@Runnable������run()��k
		// ������Ұ��檺�B�z�A�̧ǱN�ثe��������L10��
		for (int i = 1; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName() + "; �L�� " + i + " ��");
		}
	}
}

public class LambdaRunnable1 {
	public static void main(String[] args) {
		// �إ�Runnable��������obR
		MyThread obR = new MyThread();
		// �إ߰��������t�A�ña�JobR��Runnable��������
		Thread t = new Thread(obR);
		// �Ұʰ��������t�A���ɰ���Runnable��������run()��k
		t.start();
	}
}
