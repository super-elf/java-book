package waitNotify;

class Baseball{ // �bBaseball���O���]�w�βy�����ݩʩM��k
	private boolean isThrow = false; // �O���βy�O�_��X�Afalse=����X
	public synchronized void pBall(int tNo) { // ��βy����k
		while (isThrow) { // ��isThrow��true�N���_����
			try {
				wait(); // ��y�����i�J���ݪ��A
			} catch (InterruptedException e) {
			}
		}
		System.out.println("��X�� " + tNo + " ���βy");
		isThrow = true; // �]�βy����X
		notify(); // �I�s�����̴��Υ��y
	}
	public synchronized void hBall(int aNo) { // ���Υ��y����k
		while (!isThrow) { // ��isThrow��false�N���_����
			try {
				wait(); // �����̶i�J���ݪ��A
			} catch (InterruptedException e) {
			}
		}
		System.out.println("�� " + aNo + " ������");
		isThrow = false; // �]�βy������X
		notify(); // �I�s��y����y
	}
}

class Pitching implements Runnable{ // Pitching ���O��@ Runnable ����
	Baseball baseball;  //�إ� Baseball ���O���� baseball
	
	Pitching(Baseball baseball){  //�غc�l
		this.baseball = baseball;
	}
	
	public void run() {
		for(int i = 1; i <= 5; i ++) {  //�brun()��k�������y5��
			baseball.pBall(i);
		}
	}
}

class Hit implements Runnable{ // Hit�O��@Runnable����
	Baseball baseball;  // �إ� Baseball ���O���� baseball
	Hit(Baseball baseball){  // �غc�l
		this.baseball = baseball;
	}
	public void run() { // �brun()��k�����楴��5�� 
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
