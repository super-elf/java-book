package talk2;

class ThreadX extends Thread {	//ThreadX繼承自Thread類別
	String str;
	int  m;				
	ThreadX(String a, int s) { 	//ThreadX類別的建構式
		str = a;	//設str等於指定的字串					
		m=s;		//設m等於指定的間隔時間
		start();	//呼叫建構式時，直接啟動執行緒
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

public class Talk2 {
	public static void main(String[] args) {
		String str1="HELLO,WORLD";
		String str2="Java SE 12";
		ThreadX obT1 = new ThreadX(str1, 200);  //建立obT1執行緒傳入值str1和200
		ThreadX obT2 = new ThreadX(str2, 500);  //建立obT2執行緒傳入值str2和500
	}
}
