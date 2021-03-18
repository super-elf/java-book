package productSys;

//DB資料庫類別
//DB類別含有ProductTable產品資料表類別，透過產品資料表類別可編輯產品資料表中的記錄
public class DB {
	//宣告ProductTable產品資料表類別
	public ProductTable Products;
	//isJDBC記錄是否有JDBC驅動程式
	public boolean isJDBC=false;
	//DB資料庫類別建構式
	public DB() {	
        try
        {
           //載入JDBC驅動程式
     	   Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
     	   isJDBC=true;	//有JDBC驅動程式
     	   Products = new ProductTable();	//建立產品資料表物件Products
        }
        catch(ClassNotFoundException ce)
        {
           //無JDBC驅動程式，即顯示提示訊息
     	   System.out.println("JDBC沒有驅動程式" + ce.getMessage());
     	   isJDBC=false;	//無JDBC驅動程式
        }	
	}
}
