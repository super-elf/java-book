package ex06;

public class Ccar {
	public double gas, tbo;              //�ŧi�̦h���o�q, �����Ӫo�q
	public double max_dist = 0;          //�[���o�i��p�̪��Z��
	
	public void maxDist() {              //�p��i��p�̪��Z��
	    max_dist = gas * tbo;
	}
	 
	public double dist(double oil) {     //�@��[�o�i��p�Z��
	    return oil * tbo;
	}
}
