/*
 * �ҳ�1000����ȫ������
 * ������A��A=sum(A%i=0��i)
 */
public class PerfectNumber {
	public static void main(String[] args) {
		for(int integer=5,factor=0;integer<=1000;integer++) {
			for(int i=1;i<integer;i++) {
				if(integer%i==0) factor += i;
			}
			if(integer==factor) System.out.print(integer+"\t");
			factor = 0;       //����˴������㣬��factor��ֵ��һֱ�ۼӣ���
		}
	}	
}