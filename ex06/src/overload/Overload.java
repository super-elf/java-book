package overload;              //�ŧi�{���ɪ����O�m��overload�M��

class Cavg {
    public double getAvg(int num1, int num2) {
       return (num1+num2)/2;
    }

    public double getAvg(int[] vArray) {
       int n = vArray[0];
       for(int i=1; i<vArray.length; i++){
          n += vArray[i];
       }
       double avg = (double)n/vArray.length;
       return avg;
    }
}

public class Overload {                          //�D���O
    public static void main(String[] args) {     //�D�{��
	   Cavg num = new Cavg();
	   int n1 = 20, n2 = 30;
	   System.out.println(n1 + " �M " + n2 + "�����Ȭ� " + num.getAvg(n1, n2));
	   int[] ary = {12,23,31,45,56};
	   System.out.println("{12,23,31,45,56}�����Ȭ� " + num.getAvg(ary));
	}
}