package iteratorDemo;
import java.util.*;
public class IteratorDemo {
	public static void main(String[] args) {
	    //�إ�tset���X����
	    TreeSet<Integer> tset = new TreeSet<>();
		System.out.println("�N1~40����Ʀs�Jtset���X����...");
		for(int i=1; i<=40; i++)
		    tset.add(i);
		System.out.println("�}�l�ɡAtset���X���󤺤����ӼƬ��G" + tset.size());
		//�إߨ��X������itera
		Iterator<Integer> itera = tset.iterator();
		System.out.println("\n�D��Ʋ�����...");
		itera.next();
		itera.remove();                 //1���O���,������
		while(itera.hasNext()) {
		    int num = itera.next();
		    for(int j=2; j<num; j++) {
		       if(num % j == 0) {
		          itera.remove();           //�]����L�]��,�G�D���
		          break;
		       }
		    }
		}
		System.out.println("�D��Ʋ�������");
		System.out.println("�̫�Atset���X���󤺤����ӼƬ��G" + tset.size());
		System.out.println("1~40����Ʀ��G" + tset);
	}
}
