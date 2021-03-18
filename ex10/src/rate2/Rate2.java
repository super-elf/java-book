package rate2;

public class Rate2 {
	public static void main(String[] args) {
		Thread tortoise = new Thread(() ->{
			for(int i = 1; i <= 20; i ++) {
				System.out.println("烏龜共跑 " + i + " 公里");
			}
			System.out.println("烏龜抵達終點！");
		});
		Thread rabbit = new Thread(() ->{
			for(int i = 4; i <= 20; i += 4) {
				if(Math.random() > 0.2) { 
					System.out.println("兔子休息");
					i -= 4;  //使兔子停止
				} else {
					System.out.println("兔子共跑 " + i + " 公里");
				}
			}
			System.out.println("兔子抵達終點！");
		});
		rabbit.start();
		tortoise.start();
	}
}
