package exceptionDemo;

public class ExceptionDemo {
	public static void main(String[] args) {
	   int[] myarray = new int[10];
	   try {
	       myarray[10] = 250;
	   }
	   catch(ArrayIndexOutOfBoundsException e) {
	       System.out.println("�ҥ~���e�G" + e.toString());
	       System.out.println("�]�N�O�G�W�X�}�C���޽d��");
	   }
	   System.out.println("�{���̫�@����槹��");
   }
}
