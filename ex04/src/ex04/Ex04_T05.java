package ex04;

public class Ex04_T05 {
	static String welcome(String name) {
		String msg = "�w��";
		msg += name.substring(0,1).toUpperCase()+name.substring(1).toLowerCase();
		return msg;
	}
	
	public static void main(String[] args) {
		System.out.print(welcome("jerry")+"\n");
		System.out.print(welcome("KENNY")+"\n");
		System.out.print(welcome("aMY")+"\n");
	
	}

}
