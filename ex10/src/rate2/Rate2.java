package rate2;

public class Rate2 {
	public static void main(String[] args) {
		Thread tortoise = new Thread(() ->{
			for(int i = 1; i <= 20; i ++) {
				System.out.println("�Q�t�@�] " + i + " ����");
			}
			System.out.println("�Q�t��F���I�I");
		});
		Thread rabbit = new Thread(() ->{
			for(int i = 4; i <= 20; i += 4) {
				if(Math.random() > 0.2) { 
					System.out.println("�ߤl��");
					i -= 4;  //�Ϩߤl����
				} else {
					System.out.println("�ߤl�@�] " + i + " ����");
				}
			}
			System.out.println("�ߤl��F���I�I");
		});
		rabbit.start();
		tortoise.start();
	}
}
