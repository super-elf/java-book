package lambdaRunnable3;

public class LambdaRunnable3 {
	public static void main(String[] args) {
		// MyThread obR = new MyThread();
		Thread t = new Thread(() -> {
			// ��@Runnable��������run()��k
			// run()��k�i�������Ұ��檺�B�z�A�̧ǱN�ثe��������L10��
			for (int i = 1; i <= 10; i++) {
				System.out.println(Thread.currentThread().getName() + "; �L�� " + i + " ��");
			}
		});
		t.start();
	}
}
