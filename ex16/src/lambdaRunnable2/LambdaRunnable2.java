package lambdaRunnable2;

public class LambdaRunnable2 {
	public static void main(String[] args) {
		// �إ�t���������A�ña�JRunnable�������ΦW����
		Thread t = new Thread(new Runnable() {
			// ��@Runnable��������run()��k
			public void run() {
				// ������Ұ��檺�B�z�A�̧ǱN�ثe��������L10��
				for (int i = 1; i <= 10; i++) {
					System.out.println(Thread.currentThread().getName() + "; �L�� " + i + " ��");
				}
			}
		});
		t.start();
	}
}
