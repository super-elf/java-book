package rsDb2;
import java.sql.*;
public class RsDb2 {


	public static void main(String[] args) {
	       try
	       {
	    	   Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	       }
	       catch(ClassNotFoundException ce)
	       {
	    	   System.out.println("JDBC�S���X�ʵ{��" + ce.getMessage());
	    	   return ;
	       }
	       try
	       {
	          Connection cn=DriverManager.getConnection
	("jdbc:sqlserver://localhost;user=sa;password=ab8626043;database=sample");
	          Statement sm = cn.createStatement();
	          ResultSet rs = sm.executeQuery("SELECT * FROM ���~");
	          ResultSetMetaData rsmd = rs.getMetaData();
	          for (int i=1; i<=rsmd.getColumnCount(); i++)
	          {
	              System.out.print(rsmd.getColumnName(i) + "\t");
	          }
	          System.out.println("\n-----------------------------");
	          while (rs.next())
	          {
	              System.out.print(rs.getString("�s��") + "\t" + 
							rs.getString("�~�W") + "\t"+ 
							rs.getInt("���") + "\t" + 
							rs.getInt("�ƶq") + "\n");
	          }	          
	          sm.close();
	          cn.close();
	       }
	       catch(SQLException e)
	       {
	       		System.out.println("��Ʈw�s������\n" + e.getMessage());
	       }
	}
}
