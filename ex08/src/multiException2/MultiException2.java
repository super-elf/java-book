package multiException2;

public class MultiException2 {
	public static void main(String[] args) {
	    int[] myarray = new int[10];
		try {
		    int test = 120 / 5;
		    myarray[5] = 120;
		    int n = Integer.parseInt("�A�n��");  //�r��L�k�ഫ�����
		}
		catch(Exception e) {      //��catch�����n�g�b�̫�@��catch�~��
		    System.out.println("�ҥ~���e�G" + e.toString());
		    System.out.println("�ҥ~�o��!");
		}
		catch(ArrayIndexOutOfBoundsException e) {
		    System.out.println("�ҥ~���e�G" + e.toString());
		    System.out.println("���G�W�X�}�C���޽d�򪺨ҥ~�o��");
		}
		catch(ArithmeticException e) {
		    System.out.println("�ҥ~���e�G" + e.toString());
		    System.out.println("���G�ƾǹB����~�A�p���Ƭ�0!");
		}
		System.out.println("\n�{�����T���槹��!!");
	}
}