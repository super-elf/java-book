package ex06;
public class BuildObject {
	public static void main(String[] args) {
	    Ccar car1;                         //�ŧicar1����
		car1 = new Ccar();                 //�إ�car1����
		car1.gas = 40;                     //�]�wcar1�����ݩʭ�
		car1.tbo = 13.6;
		car1.maxDist();                    //�I�scar1���󪺤�k
		double distance = car1.dist(20);   //�I�scar1���󪺤�k,�è��o�Ǧ^��
		System.out.println("car1�T����T�G");
		System.out.println("�̤j���o�q�G" + car1.gas + " L");
		System.out.println("�����Ӫo�q�G" + car1.tbo + " km/L");
		System.out.println("�[���o�i��p " + car1.max_dist + " km");
		System.out.println("�[�o20L�i��p " + distance + " km");
			    
		Ccar car2 = new Ccar();            //�ŧi�ëإ�car2����
		car2.gas = 60;                     //�]�wcar2�����ݩʭ�
		car2.tbo = 9.5;
	}
}
