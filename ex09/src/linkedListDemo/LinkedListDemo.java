package linkedListDemo;
import java.util.*;
public class LinkedListDemo {
	public static void main(String[] args) {
	    var place = List.of("蘋果", "水梨", "香蕉", "奇異果", "芭樂");
		var night = new ArrayList<>();
		for(String p : place)
		    night.add(p);
		System.out.println("串列元素前後順序");
		for(int i=0; i<night.size(); i++)
		    System.out.println("第 " + (i+1) + " 個：" + night.get(i));
		
		var queue = new LinkedList<>(night);
		System.out.println("\n取出方式(佇列)：先進先出");
		for(int j=queue.size()-1; j>=0; j--) {
		    System.out.print(queue.getFirst() + "  ");
		    queue.removeFirst();
		}
		System.out.println();
		
		var stack = new LinkedList<>(night);
		System.out.println("\n取出方式(堆疊)：後進先出");
		while(true) {
		    System.out.print(stack.removeLast() + "  ");
		    if(stack.isEmpty()) break;
		}
	}
}
