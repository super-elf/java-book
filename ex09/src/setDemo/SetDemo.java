package setDemo;
import java.util.*;
public class SetDemo {
	public static void main(String[] args) {
		var hset = new HashSet<>();
		hset.add("�ժ�");              //�N�r��`�ȸ�Ʀs�J���X����
		var chiaAnimal = Set.of("�C�s", "�ժ�", "����", "�ȪZ");  //�r�궰�X
		//String[] chiaAnimal = {"�C�s", "�ժ�", "����", "�ȪZ"}; //�r��}�C
		for (String p : chiaAnimal)   //�N�r�궰�X������Ʀs�J���X����
		hset.add(p);
		String myAni = "Ź�K";
		hset.add(myAni);              //�N�r���ܼƸ�Ʀs�J���X����
		System.out.println("���꯫�~�G" + hset);  //��ܶ��X�����Ҧ��������e
	}
}
