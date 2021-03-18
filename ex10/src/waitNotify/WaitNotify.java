package waitNotify;

class Baseball{ // 在Baseball類別中設定棒球物件的屬性和方法
	private boolean isThrow = false; // 記錄棒球是否投出，false=未丟出
	public synchronized void pBall(int tNo) { // 投棒球的方法
		while (isThrow) { // 當isThrow為true就不斷執行
			try {
				wait(); // 投球機器進入等待狀態
			} catch (InterruptedException e) {
			}
		}
		System.out.println("投出第 " + tNo + " 顆棒球");
		isThrow = true; // 設棒球為丟出
		notify(); // 呼叫打擊者揮棒打球
	}
	public synchronized void hBall(int aNo) { // 揮棒打球的方法
		while (!isThrow) { // 當isThrow為false就不斷執行
			try {
				wait(); // 打擊者進入等待狀態
			} catch (InterruptedException e) {
			}
		}
		System.out.println("第 " + aNo + " 次揮棒");
		isThrow = false; // 設棒球為未丟出
		notify(); // 呼叫投球機投球
	}
}

class Pitching implements Runnable{ // Pitching 類別實作 Runnable 介面
	Baseball baseball;  //建立 Baseball 類別物件 baseball
	
	Pitching(Baseball baseball){  //建構子
		this.baseball = baseball;
	}
	
	public void run() {
		for(int i = 1; i <= 5; i ++) {  //在run()方法中執行投球5次
			baseball.pBall(i);
		}
	}
}

class Hit implements Runnable{ // Hit別實作Runnable介面
	Baseball baseball;  // 建立 Baseball 類別物件 baseball
	Hit(Baseball baseball){  // 建構子
		this.baseball = baseball;
	}
	public void run() { // 在run()方法中執行打擊5次 
		for(int i = 1; i <= 5; i ++) {
			baseball.hBall(i);
		}
	}
}

public class WaitNotify {
	public static void main(String[] args) {
		Baseball baseball = new Baseball();
		Thread machine = new Thread(new Pitching(baseball));
		Thread hitter = new Thread(new Hit(baseball));
		machine.start();
		hitter.start();
	}
}
