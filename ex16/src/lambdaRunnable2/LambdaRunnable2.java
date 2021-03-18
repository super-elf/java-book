package lambdaRunnable2;

public class LambdaRunnable2 {
	public static void main(String[] args) {
		// 建立t執行緒物件，並帶入Runnable介面的匿名物件
		Thread t = new Thread(new Runnable() {
			// 實作Runnable介面物件的run()方法
			public void run() {
				// 執行緒所執行的處理，依序將目前的執行緒印10次
				for (int i = 1; i <= 10; i++) {
					System.out.println(Thread.currentThread().getName() + "; 印第 " + i + " 次");
				}
			}
		});
		t.start();
	}
}
