package linkedListDemo;
import java.util.*;
public class LinkedListDemo {
	public static void main(String[] args) {
	    var place = List.of("ī�G", "����", "����", "�_���G", "�ݼ�");
		var night = new ArrayList<>();
		for(String p : place)
		    night.add(p);
		System.out.println("��C�����e�ᶶ��");
		for(int i=0; i<night.size(); i++)
		    System.out.println("�� " + (i+1) + " �ӡG" + night.get(i));
		
		var queue = new LinkedList<>(night);
		System.out.println("\n���X�覡(��C)�G���i���X");
		for(int j=queue.size()-1; j>=0; j--) {
		    System.out.print(queue.getFirst() + "  ");
		    queue.removeFirst();
		}
		System.out.println();
		
		var stack = new LinkedList<>(night);
		System.out.println("\n���X�覡(���|)�G��i���X");
		while(true) {
		    System.out.print(stack.removeLast() + "  ");
		    if(stack.isEmpty()) break;
		}
	}
}
