package rsDb1;
import java.sql.*;
public class RsDb1 {

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
	          Connection cn=DriverManager.getConnection
	("jdbc:sqlserver://localhost;user=sa;password=ab8626043;database=sample");
	          Statement sm = cn.createStatement();
	          ResultSet rs = sm.executeQuery("SELECT * FROM 產品");
	          ResultSetMetaData rsmd = rs.getMetaData();
	          for (int i=1; i<=rsmd.getColumnCount(); i++)
	          {
	              System.out.print(rsmd.getColumnName(i) + "\t");
	          }
	          System.out.println("\n-----------------------------");
	          while (rs.next())
	          {
	              System.out.print(rs.getString(1) + "\t" + 
							rs.getString(2) + "\t"+ 
							rs.getInt(3) + "\t" + 
							rs.getInt(4) + "\n");
	          }	          
	          sm.close();
	          cn.close();
	       }
	       catch(SQLException e)
	       {
	       		System.out.println("資料庫連接失敗\n" + e.getMessage());
	       }
	}
}
