package exceptionMethod;

public class ExceptionMethod {
	static int[] data = new int[10];
	    public static void init() {
	    data[10] = 250;
	}
	
	public static void main(String[] args) {
	    try {
	        init();
	    }
	    catch (ArrayIndexOutOfBoundsException e) {
	        System.out.println("�ҥ~���e�G" + e.toString());
	        System.out.println("�]�N�O�G�W�X�}�C���޽d��");
	    }
	}
}
