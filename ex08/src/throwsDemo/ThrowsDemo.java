package throwsDemo;

public class ThrowsDemo {
	public static void main(String[] args) {
		try {
		    showSalary("王小明", 35000);
		    showSalary("李小華", 50000);
		}
		catch(IllegalArgumentException e) {  //捕捉自行拋出的例外
		    System.out.println("例外內容：" + e.getMessage());
		}
	}
	
	static void showSalary(String name, int money) throws
	                       IllegalArgumentException {
	    System.out.println("員工：" + name);
		if(money>=20000 && money<=40000)
		    System.out.printf("\t底薪：%d\t獎金：%.1f %n", money,(int)money * 0.08);
		else
		    throw new IllegalArgumentException("呼叫方法引數錯誤");  //自行拋出例外
	}
}
