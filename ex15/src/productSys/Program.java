package productSys;

import java.util.Scanner;

public class Program {	
	//顯示功能選項
	static void showMenu() {
		System.out.println("=====產品管理=====");
		System.out.println("1. 新增產品");
		System.out.println("2. 刪除產品");
		System.out.println("3. 修改產品");
		System.out.println("4. 顯示產品所有記錄");
		System.out.println("5. 離開");
		System.out.print("請輸入選項：");
	}
	//主程式
	public static void main(String[] args) {
		//建立DB資料庫物件db
		DB db = new DB();
		//判斷是否有JDBC驅動程式
		if (db.isJDBC==false) {
			System.out.println("離開系統");
			return ;  //無JDBC驅動程式則離開主程式
		}
		
		Scanner scn = new Scanner(System.in);
		int op;
		//無窮迴圈
		while(true) {
			showMenu();
			op = scn.nextInt();
			System.out.println("#############################");
			if (op==1) {	//新增作業
				Product p = new Product();	//建立產品物件p
				System.out.println("請輸入欲新增的產品記錄");
				System.out.print("編號：");
				p.Id = scn.next().replace("'", "''");	//指定產品物件的編號
				System.out.print("品名：");
				p.Name = scn.next().replace("'", "''");	//指定產品物件的品名
				System.out.print("單價：");				
				p.Price = scn.nextInt();				//指定產品物件的單價
				System.out.print("數量：");
				p.Qty = scn.nextInt();					//指定產品物件的數量
				db.Products.create(p);	//新增產品記錄
			}else if(op==2) {	//刪除作業
				System.out.println("請輸入欲刪除的產品編號");
				System.out.print("編號：");
				String id = scn.next().replace("'", "''");
				db.Products.delete(id);	//刪除產品記錄
			}else if(op==3) {	//修改作業
				Product p = new Product();
				System.out.println("請輸入欲修改的產品記錄");
				System.out.print("編號：");
				p.Id = scn.next().replace("'", "''");	//指定產品物件的編號
				System.out.print("品名：");
				p.Name = scn.next().replace("'", "''");	//指定產品物件的品名
				System.out.print("單價：");				
				p.Price = scn.nextInt();				//指定產品物件的單價
				System.out.print("數量：");
				p.Qty = scn.nextInt();					//指定產品物件的數量
				db.Products.update(p);	
			}else if(op==4) {	//顯示產品記錄
				db.Products.printProducts();
			}else {
				System.out.println("離開系統");
				break ;
			}
			System.out.println("#############################");
		}
	}
}
