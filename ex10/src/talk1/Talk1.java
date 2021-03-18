package talk1;

class ThreadB extends Thread {	//ThreadB繼承自Thread類別
	String str;
	int  m;				
	ThreadB(String a, int s) { 	//ThreadB類別的建構式
		str = a;	//設str等於指定的字串					
		m=s;		//設m等於指定的間隔時間
	}
	public void run() { 			//覆寫Thread類別的run方法
		try {
			for(int i=0;i<str.length();i++) {
				System.out.print(str.charAt(i));
				sleep(m);  //暫停執行緒
			}
		} catch (InterruptedException e) {
			System.out.println("產生例外.....!");
		}
	}
}

public class Talk1 {
	public static void main(String[] args) {
		String str1="HELLO,WORLD";
		String str2="Java SE 12";
		ThreadB obT1 = new ThreadB(str1, 200);  //建立obT1執行緒傳入值str1和200
		ThreadB obT2 = new ThreadB(str2, 500);  //建立obT2執行緒傳入值str2和500
		obT1.start(); //啟動obT1執行緒
		obT2.start(); //啟動obT2執行緒
	}
}
