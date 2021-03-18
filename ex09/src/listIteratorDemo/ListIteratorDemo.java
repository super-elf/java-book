package listIteratorDemo;
import java.util.*;
public class ListIteratorDemo {
	public static void main(String[] args) {
	    System.out.println("�إ�alist���X����...");
	    ArrayList<String> alist = new ArrayList<>();
	    String[] place = {"�y��", "�Ὤ", "�Ѳ�", "�x�F", "����"};
	    for(String p : place)
	        alist.add(p);
	    System.out.println("���alist���X�����l����...");
	    System.out.println(alist);
	
	    ListIterator<String> litera = alist.listIterator();
	    System.out.println("\n�ק�alist���X���󤸯�...");
	    while(litera.hasNext()) {
	        litera.next();
	        if (litera.nextIndex()==3)
	            litera.set("���J");
	    }
	
	    System.out.println("\n�ϦV���Xalist���X���󤸯�...");
	    while(litera.hasPrevious())
	       System.out.print(litera.previous() + "  ");
	    System.out.println();
	
	    System.out.println("\n�s�Walist���X���󤸯�...");
	    litera = alist.listIterator(3);
	    litera.add("���W");
	 
	    System.out.println("\n���alist���X����̲פ���");
	    System.out.println(alist);
	}
}
