package ex03;
public class BreakLabel1 {
	public static void main(String[] args) {
		boolean i=false;
		Block1:{
			System.out.println("�o�O�Ĥ@�ӵ{���϶�");
			i=true;
			Block2:{
				if (i==true)
					break Block2;
				System.out.println("�o�O�ĤG�ӵ{���϶�"); // ���|����
			}
			System.out.println("�w�g���X�F�ĤG�ӵ{���϶�");
		}
	}
}
