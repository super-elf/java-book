package arrayListDemo;
import java.util.*;
public class ArrayListDemo {
	public static void main(String[] args) {
		System.out.println("��F���ȹC�]�J�W����");
		var night = new ArrayList<>();
		var place = List.of("�y��", "�Ὤ", "�Ѳ�", "�Ὤ", "�x�F");
		for (String p : place)
		    night.add(p);
		System.out.println("����W���]�J�a�I�G" + night);
		System.out.println("����W���]�J�ѼơG" + night.size());
		night.add("����");
		night.add(4, "���W");
		System.out.println("�׭q��]�J�a�I�G" + night);
		System.out.println("�]�J�Ѳ��b�ĴX�ѡG"+(night.indexOf("�Ѳ�")+1));
		System.out.println("�R���Ὤ�Ĥ@�ө]�J...");
		night.remove(night.indexOf("�Ὤ"));
		
		System.out.println("\n�T�w�]�J�ѼơG" + night.size());
		System.out.println("��T�w�]�J��C��");
		for (int i = 0; i < night.size(); i++)
		    System.out.println("�� " + (i+1) + " �ѩ]�J�a�I�G" + night.get(i));
	}
}
