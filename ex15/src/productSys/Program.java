package productSys;

import java.util.Scanner;

public class Program {	
	//��ܥ\��ﶵ
	static void showMenu() {
		System.out.println("=====���~�޲z=====");
		System.out.println("1. �s�W���~");
		System.out.println("2. �R�����~");
		System.out.println("3. �קﲣ�~");
		System.out.println("4. ��ܲ��~�Ҧ��O��");
		System.out.println("5. ���}");
		System.out.print("�п�J�ﶵ�G");
	}
	//�D�{��
	public static void main(String[] args) {
		//�إ�DB��Ʈw����db
		DB db = new DB();
		//�P�_�O�_��JDBC�X�ʵ{��
		if (db.isJDBC==false) {
			System.out.println("���}�t��");
			return ;  //�LJDBC�X�ʵ{���h���}�D�{��
		}
		
		Scanner scn = new Scanner(System.in);
		int op;
		//�L�a�j��
		while(true) {
			showMenu();
			op = scn.nextInt();
			System.out.println("#############################");
			if (op==1) {	//�s�W�@�~
				Product p = new Product();	//�إ߲��~����p
				System.out.println("�п�J���s�W�����~�O��");
				System.out.print("�s���G");
				p.Id = scn.next().replace("'", "''");	//���w���~���󪺽s��
				System.out.print("�~�W�G");
				p.Name = scn.next().replace("'", "''");	//���w���~���󪺫~�W
				System.out.print("����G");				
				p.Price = scn.nextInt();				//���w���~���󪺳��
				System.out.print("�ƶq�G");
				p.Qty = scn.nextInt();					//���w���~���󪺼ƶq
				db.Products.create(p);	//�s�W���~�O��
			}else if(op==2) {	//�R���@�~
				System.out.println("�п�J���R�������~�s��");
				System.out.print("�s���G");
				String id = scn.next().replace("'", "''");
				db.Products.delete(id);	//�R�����~�O��
			}else if(op==3) {	//�ק�@�~
				Product p = new Product();
				System.out.println("�п�J���ק諸���~�O��");
				System.out.print("�s���G");
				p.Id = scn.next().replace("'", "''");	//���w���~���󪺽s��
				System.out.print("�~�W�G");
				p.Name = scn.next().replace("'", "''");	//���w���~���󪺫~�W
				System.out.print("����G");				
				p.Price = scn.nextInt();				//���w���~���󪺳��
				System.out.print("�ƶq�G");
				p.Qty = scn.nextInt();					//���w���~���󪺼ƶq
				db.Products.update(p);	
			}else if(op==4) {	//��ܲ��~�O��
				db.Products.printProducts();
			}else {
				System.out.println("���}�t��");
				break ;
			}
			System.out.println("#############################");
		}
	}
}
