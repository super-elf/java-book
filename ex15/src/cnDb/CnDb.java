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
     	   System.out.println("JDBC�S���X�ʵ{��" + ce.getMessage());
     	   return ;
        }
        try
        {
     	   Connection cn=DriverManager.getConnection ("jdbc:sqlserver://localhost;user=sa;password=ab8626043;database=sample");
     	   System.out.println("��Ʈw�s�����\");
           cn.close();
           System.out.println("����P��Ʈw���s�u");
        }
        catch(SQLException e)
        {
     	   System.out.println("��Ʈw�s������\n" + e.getMessage());
        }
	}
}
