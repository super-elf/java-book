package productSys;

//DB��Ʈw���O
//DB���O�t��ProductTable���~��ƪ����O�A�z�L���~��ƪ����O�i�s�貣�~��ƪ����O��
public class DB {
	//�ŧiProductTable���~��ƪ����O
	public ProductTable Products;
	//isJDBC�O���O�_��JDBC�X�ʵ{��
	public boolean isJDBC=false;
	//DB��Ʈw���O�غc��
	public DB() {	
        try
        {
           //���JJDBC�X�ʵ{��
     	   Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
     	   isJDBC=true;	//��JDBC�X�ʵ{��
     	   Products = new ProductTable();	//�إ߲��~��ƪ���Products
        }
        catch(ClassNotFoundException ce)
        {
           //�LJDBC�X�ʵ{���A�Y��ܴ��ܰT��
     	   System.out.println("JDBC�S���X�ʵ{��" + ce.getMessage());
     	   isJDBC=false;	//�LJDBC�X�ʵ{��
        }	
	}
}
