package productSys;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

//產品資料表類別(表示產品資料表物件)
public class ProductTable {
	//資料庫連接字串
	private String cnstr="jdbc:sqlserver://localhost;user=sa;password=ab8626043;database=sample";
	//依傳入的sql字串進行新增、修改、刪除資料表記錄的方法
	private void editProduct(String sqlstr){
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
	//create方法可在產品資料表新增一筆產品記錄
	public void create(Product p) {
		String sqlstr = "INSERT INTO 產品(編號,品名,單價,數量)Values('" + p.Id + "','" + p.Name + "'," + p.Price +"," + p.Qty + ")";		
        editProduct(sqlstr);
	}
	//update方法可在產品資料表修改一筆產品記錄
	public void update(Product p) {
        String sqlstr = "UPDATE 產品 SET 品名='" + p.Name + "',單價=" +  p.Price + ",數量=" + p.Qty + " WHERE 編號='" + p.Id + "'" ;
        editProduct(sqlstr);
	}
	//delete方法可在產品資料表刪除一筆產品記錄
	public void delete(String PId) {
        String sqlstr = "DELETE FROM 產品 WHERE 編號='" + PId + "'" ;
        editProduct(sqlstr);
	}
	//printProducts方法可顯示產品資料表所有產品記錄
	public void printProducts() {
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
}
