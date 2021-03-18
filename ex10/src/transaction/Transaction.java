package transaction;

class ATM extends Thread {
	Account account; // �ŧiAccount����
	long money; // �ŧi�����money�O���s���ڼ��B

	public ATM(Account ac, long n) { // �غc�l
		this.account = ac; // �]�waccount�ݩʭ�
		this.money = n; // �]�wmoney�ݩʭ�
	}

	public void run() {
		account.deposit(money); // �I�sAccount���O��deposit��k
	}
}

class Account {
	long balance; // balance�ݩʰO���b��l�B

	public Account(long balance) { // �غc�l
		this.balance = balance; // �]�wbalance�ݩʭ�
	}

	public synchronized void deposit(long amount) {
		long d_balance;
		d_balance = this.balance;
		System.out.println("�b�᤺�l�B = " + d_balance); // ��ܾl�B
		if (amount >= 0) 
			System.out.println("�s�ڼW�[�� = " + amount); // �s��
		else 
			System.out.println("�s�ڴ�ּ� = " + amount); // ����
		System.out.println("����� .....");
		try {// �������o�b���l�B�һݪ��ɶ�
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		d_balance += amount; // �p��X�l�B
		if (d_balance >= 0) { // �Y�b��l�B>=0
			System.out.println("�ثe�b��l�B = " + d_balance + "\n");
			this.balance = d_balance; // �]�wbalance�ݩʭ�(�b��l�B)
		} else {
			System.out.println("�b��l�B�����I \n");
		}
	}
}

public class Transaction {
	public static void main(String[] args) {
		Account account = new Account(5000); // �إ�account����ó]�b��l�B��5000
		ATM A1 = new ATM(account, -1000); // A1���������1000��
		ATM A2 = new ATM(account, 2000); // A2������s��2000��
		ATM A3 = new ATM(account, -9000); // A3���������9000��
		A1.start(); // A1������Ұ�
		A2.start(); // A2������Ұ�
		A3.start(); // A3������Ұ�
		try {
			A1.join(); // ����A1��������槹��
			A2.join(); // ����A2��������槹��
			A3.join(); // ����A3��������槹��
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("�̫�b��l�B: " + account.balance);
	}
}
