package multiException1;

public class MultiException1 {
	public static void main(String[] args) {
		int[] myarray = new int[10];
		try {
		    int test = 120 / 5;
		    myarray[5] = 120;
		    int n = Integer.parseInt("�A�n��");  //�r��L�k�ഫ�����
		}
		catch (ArrayIndexOutOfBoundsException e) {
		    System.out.println("�ҥ~���e�G" + e.toString());
		    System.out.println("�]�N�O�G�W�X�}�C���޽d�򪺨ҥ~�o��");
		}
		catch(ArithmeticException e) {
		    System.out.println("�ҥ~���e�G" + e.toString());
		    System.out.println("�]�N�O�G�ƾǹB����~�A�p���Ƭ�0!");
		}
		catch(Exception e) {
		    System.out.println("�ҥ~���e�G" + e.toString());
		    System.out.println("�ҥ~�o��!");
		}
		System.out.println("�{�����T���槹��!!");
	}
}