package finallyDemo;

public class FinallyDemo {
	public static void main(String[] args) {
	    int[] myarray = new int[10];
	    try {
	        myarray[20] = 120;
	   	}
	    catch (ArrayIndexOutOfBoundsException e) {
	        System.out.println("�ҥ~���e�G" + e.toString());
	        System.out.println("�]�N�O�G�W�X�}�C���޽d��");
	    }
	    finally {     //finally�ԭz�϶��@�w�|����
	        System.out.println("����finally �{���϶�����");
	    }
	    System.out.println("�{�����T���槹��!!");
	}
}
