package test08_5;

public class Test08_5 {
	public static void main(String[] args) {
		try {
		   int x = 1 / 0;
		   System.out.println("try");
		}
		catch (ArithmeticException ex) {
		   System.out.println("catch ArithmeticException");
		}
		catch (Exception ex) {
		   System.out.println("catch Exception");
		}
		finally {
		   System.out.println("finally");
		}
	}
}
