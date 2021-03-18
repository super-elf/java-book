package cnDb;
import java.sql.*;
public class CnDb {
	public static void main(String[] args) {
        try
        {
     	   Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        }
        catch(ClassNotFoundException ce)
        {
     	   System.out.println("JDBC沒有驅動程式" + ce.getMessage());
     	   return ;
        }
        try
        {
     	   Connection cn=DriverManager.getConnection ("jdbc:sqlserver://localhost;user=sa;password=ab8626043;database=sample");
     	   System.out.println("資料庫連接成功");
           cn.close();
           System.out.println("釋放與資料庫的連線");
        }
        catch(SQLException e)
        {
     	   System.out.println("資料庫連接失敗\n" + e.getMessage());
        }
	}
}
