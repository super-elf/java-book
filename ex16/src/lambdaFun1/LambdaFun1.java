package lambdaFun1;

import java.util.Arrays;

public class LambdaFun1 {
	public static void main(String[] args) {
		// �إ�name[0]~name[3]�r��}�C����
		String[] name = new String[] { "peter", "Tom", "Jasper", "anita" };
		// ��@�r�������W�h
		Arrays.sort(name, (str1, str2) -> str1.compareToIgnoreCase(str2));
		// �L�X�Ƨǫ᪺���G
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}
	}
}
