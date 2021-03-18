package encapsulate;

class Ccar {                      //�T�����O
    private double gas, tbo;       //�ŧi�̦h���o�q, �����Ӫo�q
    private double max_dist;       //�[���o�i��p�̪��Z��

    private void maxDist() {       //�p��i��p�̪��Z��
       max_dist = gas * tbo;
    }

    public void setValue(double g, double t) { //�ǤJ���
       gas = g;
       tbo = t;
       maxDist();
    }

    public double getDist() {      //�ǥX���
       return max_dist;
    }
 }

public class Encapsulate {       //�D���O
    public static void main(String[] args) { //�D�{��
       Ccar car1;                            //�ŧicar1����
       car1 = new Ccar();                    //�إ�car1����
       double g1 = 40, t1 = 13.6;
       car1.setValue(g1, t1);                //�]�wcar1�����ݩʭ�
       double distance1 = car1.getDist();    //���ocar1���󪺤�k�Ǧ^��
       System.out.println("car1�[���o�i��p " + distance1 + " km");
       Ccar car2 = new Ccar();               //�ŧi�ëإ�car2����
       car2.setValue(60, 9.5);               //�]�wcar1�����ݩʭ�
       System.out.println("car2�[���o�i��p " + car2.getDist() + " km");
    }
}
