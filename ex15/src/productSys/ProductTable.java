package productSys;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

//���~��ƪ����O(��ܲ��~��ƪ���)
public class ProductTable {
	//��Ʈw�s���r��
	private String cnstr="jdbc:sqlserver://localhost;user=sa;password=ab8626043;database=sample";
	//�̶ǤJ��sql�r��i��s�W�B�ק�B�R����ƪ�O������k
	private void editProduct(String sqlstr){
		try{
			Connection cn=DriverManager.getConnection(cnstr);
			Statement sm = cn.createStatement();
			int count=sm.executeUpdate(sqlstr);
			sm.close();
			cn.close();
			if (count==0) {
				System.out.println("���~�s�襢��\n");
			}else {
				System.out.println("���~�s�覨�\\n");
			}
		}catch(SQLException e){
	        System.out.println("��Ʈw�s������\n" + e.getMessage());
	    }
	}
	//create��k�i�b���~��ƪ�s�W�@�����~�O��
	public void create(Product p) {
		String sqlstr = "INSERT INTO ���~(�s��,�~�W,���,�ƶq)Values('" + p.Id + "','" + p.Name + "'," + p.Price +"," + p.Qty + ")";		
        editProduct(sqlstr);
	}
	//update��k�i�b���~��ƪ�ק�@�����~�O��
	public void update(Product p) {
        String sqlstr = "UPDATE ���~ SET �~�W='" + p.Name + "',���=" +  p.Price + ",�ƶq=" + p.Qty + " WHERE �s��='" + p.Id + "'" ;
        editProduct(sqlstr);
	}
	//delete��k�i�b���~��ƪ�R���@�����~�O��
	public void delete(String PId) {
        String sqlstr = "DELETE FROM ���~ WHERE �s��='" + PId + "'" ;
        editProduct(sqlstr);
	}
	//printProducts��k�i��ܲ��~��ƪ�Ҧ����~�O��
	public void printProducts() {
		try{
			Connection cn=DriverManager.getConnection(cnstr);
			Statement sm = cn.createStatement();
			ResultSet rs = sm.executeQuery("SELECT * FROM ���~");
			ResultSetMetaData rsmd = rs.getMetaData();
			for (int i=1; i<=rsmd.getColumnCount(); i++){
				System.out.print(rsmd.getColumnName(i) + "\t");
			}
			System.out.println("\n-----------------------------");
			while (rs.next()){
	            System.out.print(rs.getString("�s��") + "\t" + 
					rs.getString("�~�W") + "\t"+ 
					rs.getInt("���") + "\t" + 
					rs.getInt("�ƶq") + "\n");
	        }	          
			sm.close();
			cn.close();
		}catch(SQLException e){
	       	System.out.println("��Ʈw�s������\n" + e.getMessage());
	    }
	}
}
