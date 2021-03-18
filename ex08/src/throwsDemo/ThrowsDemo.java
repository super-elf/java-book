package throwsDemo;

public class ThrowsDemo {
	public static void main(String[] args) {
		try {
		    showSalary("���p��", 35000);
		    showSalary("���p��", 50000);
		}
		catch(IllegalArgumentException e) {  //�����ۦ�ߥX���ҥ~
		    System.out.println("�ҥ~���e�G" + e.getMessage());
		}
	}
	
	static void showSalary(String name, int money) throws
	                       IllegalArgumentException {
	    System.out.println("���u�G" + name);
		if(money>=20000 && money<=40000)
		    System.out.printf("\t���~�G%d\t�����G%.1f %n", money,(int)money * 0.08);
		else
		    throw new IllegalArgumentException("�I�s��k�޼ƿ��~");  //�ۦ�ߥX�ҥ~
	}
}
