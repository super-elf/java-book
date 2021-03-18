package editDb;
import java.sql.*;
import java.util.Scanner;

public class EditDb {
	//指定SQL Server資料庫連接字串	
	static String cnstr="jdbc:sqlserver://localhost;user=sa;password=ab8626043;database=sample";
	
	//顯示產品資料表所有記錄
	static void showProduct(){
		try{
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		}catch(ClassNotFoundException ce){
			System.out.println("JDBC沒有驅動程式" + ce.getMessage());
			return ;
		}
		try{
			Connection cn=DriverManager.getConnection(cnstr);
			Statement sm = cn.createStatement();
			ResultSet rs = sm.executeQuery("SELECT * FROM 產品");
			ResultSetMetaData rsmd = rs.getMetaData();
			for (int i=1; i<=rsmd.getColumnCount(); i++){
				System.out.print(rsmd.getColumnName(i) + "\t");
			}
			System.out.println("\n-----------------------------");
			while (rs.next()){
	            System.out.print(rs.getString("編號") + "\t" + 
					rs.getString("品名") + "\t"+ 
					rs.getInt("單價") + "\t" + 
					rs.getInt("數量") + "\n");
	        }	          
			sm.close();
			cn.close();
		}catch(SQLException e){
	       	System.out.println("資料庫連接失敗\n" + e.getMessage());
	    }
	}	
	
	//依據代入的SQL語法編輯產品記錄
	static void editProduct(String sqlstr){
		try{
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		}catch(ClassNotFoundException ce){
			System.out.println("JDBC沒有驅動程式" + ce.getMessage());
			return ;
		}
		try{
			Connection cn=DriverManager.getConnection(cnstr);
			Statement sm = cn.createStatement();
			int count=sm.executeUpdate(sqlstr);
			sm.close();
			cn.close();
			if (count==0) {
				System.out.println("產品編輯失敗\n");
			}else {
				System.out.println("產品編輯成功\n");
			}
		}catch(SQLException e){
	        System.out.println("資料庫連接失敗\n" + e.getMessage());
	    }
	}	
	
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
		Scanner scn = new Scanner(System.in);
		String sqlstr, id, name;
		int op, price, qty;
		while(true) {
			showMenu();
			op = scn.nextInt();
			System.out.println("#############################");
			if (op==1) {	//新增作業
				System.out.println("請輸入欲新增的產品記錄");
				System.out.print("編號：");
				id = scn.next().replace("'", "''");
				System.out.print("品名：");
				name = scn.next().replace("'", "''");
				System.out.print("單價：");
				price = scn.nextInt();
				System.out.print("數量：");
				qty = scn.nextInt();
                sqlstr = "INSERT INTO 產品(編號,品名,單價,數量)Values('" + id + "','" + name + "'," + price +"," + qty + ")";		
                editProduct(sqlstr);
			}else if(op==2) {	//刪除作業
				System.out.println("請輸入欲刪除的產品編號");
				System.out.print("編號：");
				id = scn.next().replace("'", "''");
                sqlstr = "DELETE FROM 產品 WHERE 編號='" + id + "'" ;
                editProduct(sqlstr);				
			}else if(op==3) {	//修改作業
				System.out.println("請輸入欲修改的產品記錄");
				System.out.print("編號：");
				id = scn.next().replace("'", "''");
				System.out.print("品名：");
				name = scn.next().replace("'", "''");
				System.out.print("單價：");
				price = scn.nextInt();
				System.out.print("數量：");
				qty = scn.nextInt();
                sqlstr = "UPDATE 產品 SET 品名='" + name + "',單價=" +  price + ",數量=" + qty + " WHERE 編號='" + id + "'" ;
                editProduct(sqlstr);			
			}else if(op==4) {	//顯示產品記錄
				showProduct();
			}else {
				System.out.println("離開系統");
				break ;
			}
			System.out.println("#############################");
		}
	}
}
