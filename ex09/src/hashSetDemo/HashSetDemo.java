package hashSetDemo;
import java.util.*;

public class HashSetDemo {

	public static void main(String[] args) {
		var hset = new HashSet<>();
		int order = 1;
		String st;
		Scanner keyin = new Scanner(System.in);
		System.out.println("��J�|�Ӥ����ƪ��^�y�r��....");
		while (order <= 4) {
		    System.out.print("  �� " + order + " �Ӧr��H ");
		    st = keyin.nextLine();
		    if (hset.add(st))
		       order++;
		    else
		       System.out.println("  " + st + "�r�꭫�ƿ�J�I");
		}
	    System.out.println("�|�Ӧr����O���G");
	    System.out.println(hset);
	    System.out.print("��J�n��M���^�y�r��H ");
		String findSt1 = keyin.nextLine();
		if (hset.contains(findSt1))
	       System.out.println("  " + findSt1 + "�r��s�b���X����");
	    else
	       System.out.println("  " + findSt1 + "�r�ꤣ�b���X����");
	
	    System.out.print("��J�n�R�����^�y�r��H ");
	    String findSt2 = keyin.nextLine();
	    if (hset.remove(findSt2))
	       System.out.println("  " + findSt2 + "�r��w�R��");
	    else
	       System.out.println("  " + findSt2 + "�r�ꤣ�b���X����");
		
		System.out.println("�ثe���X���󪺤����ӼƬ��G" + hset.size());
		keyin.close();
	}
}
