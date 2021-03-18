package lambdaMyObject2;

import java.util.*; //�ϥ�Comparator�����ޥΦ��R�W�Ŷ�

//���~���O
class Product {
	private String name; // �~�W
	private int price; // ���
	private int qty; // �ƶq

	public Product(String _name, int _price, int _qty) {
		name = _name;
		price = _price;
		qty = _qty;
	}

	// getTotal()��k�i���o���*�ƶq�p�p
	public int getTotal() {
		return (price * qty);
	}

	// ��ܲ��~�P���T
	public void show() {
		System.out.print(name + "\t" + price + "\t" + qty + "\t" + getTotal() + "\t");
	}
}

public class LambdaMyObject2 {
	public static void main(String[] args) {
		// �إ�p[0]~p[3]��Product����}�C
		Product[] p = new Product[] { new Product("���v�Ԫ�", 120, 77), new Product("�����", 1000, 88),
				new Product("�h��A��", 120, 99), new Product("�p�Y�l", 560, 67) };
		// Arrays.sort�ĤG�ӰѼƫإ�Comparator�ΦW��������
		// �ù�@Comparator������compare��k�ΨӤ��Product���~�P����B(���*�ƶq)
		Arrays.sort(p, new Comparator<Product>() {
			public int compare(Product o1, Product o2) {
				int a, b, r = 1;
				a = o1.getTotal();
				b = o2.getTotal();
				if (a > b) {
					r = 1;
				} else if (a == b) {
					r = 0;
				} else if (a < b) {
					r = -1;
				}
				return r;
			}
		});

		System.out.println("  �~�W \t���\t�ƶq\t���B\t�W��");
		System.out.println("===================================");
		// �H�˦L�覡�L�Xp���~����}�C��T�A�H�β��~�P����B�W��
		for (int i = p.length - 1, k = 1; i >= 0; i--, k++) {
			p[i].show();
			System.out.println(k);
		}
	}
}