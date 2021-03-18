package editDb;
import java.sql.*;
import java.util.Scanner;

public class EditDb {
	//���wSQL Server��Ʈw�s���r��	
	static String cnstr="jdbc:sqlserver://localhost;user=sa;password=ab8626043;database=sample";
	
	//��ܲ��~��ƪ�Ҧ��O��
	static void showProduct(){
		try{
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		}catch(ClassNotFoundException ce){
			System.out.println("JDBC�S���X�ʵ{��" + ce.getMessage());
			return ;
		}
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
	
	//�̾ڥN�J��SQL�y�k�s�貣�~�O��
	static void editProduct(String sqlstr){
		try{
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		}catch(ClassNotFoundException ce){
			System.out.println("JDBC�S���X�ʵ{��" + ce.getMessage());
			return ;
		}
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
		Scanner scn = new Scanner(System.in);
		String sqlstr, id, name;
		int op, price, qty;
		while(true) {
			showMenu();
			op = scn.nextInt();
			System.out.println("#############################");
			if (op==1) {	//�s�W�@�~
				System.out.println("�п�J���s�W�����~�O��");
				System.out.print("�s���G");
				id = scn.next().replace("'", "''");
				System.out.print("�~�W�G");
				name = scn.next().replace("'", "''");
				System.out.print("����G");
				price = scn.nextInt();
				System.out.print("�ƶq�G");
				qty = scn.nextInt();
                sqlstr = "INSERT INTO ���~(�s��,�~�W,���,�ƶq)Values('" + id + "','" + name + "'," + price +"," + qty + ")";		
                editProduct(sqlstr);
			}else if(op==2) {	//�R���@�~
				System.out.println("�п�J���R�������~�s��");
				System.out.print("�s���G");
				id = scn.next().replace("'", "''");
                sqlstr = "DELETE FROM ���~ WHERE �s��='" + id + "'" ;
                editProduct(sqlstr);				
			}else if(op==3) {	//�ק�@�~
				System.out.println("�п�J���ק諸���~�O��");
				System.out.print("�s���G");
				id = scn.next().replace("'", "''");
				System.out.print("�~�W�G");
				name = scn.next().replace("'", "''");
				System.out.print("����G");
				price = scn.nextInt();
				System.out.print("�ƶq�G");
				qty = scn.nextInt();
                sqlstr = "UPDATE ���~ SET �~�W='" + name + "',���=" +  price + ",�ƶq=" + qty + " WHERE �s��='" + id + "'" ;
                editProduct(sqlstr);			
			}else if(op==4) {	//��ܲ��~�O��
				showProduct();
			}else {
				System.out.println("���}�t��");
				break ;
			}
			System.out.println("#############################");
		}
	}
}
