/*
 * ��һ���������ֽ�����������������90����ӡ90=2*3*3*5
 * ���������������A������[2,A)�������С������x������A_1������[x,A_1)...ֱ��x_n==A_n+1
 */
import java.util.Scanner;

public class IntegerFactorization {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ����������");
		int integer = sc.nextInt();
		System.out.println(integer+"=");
		int factor = 2;
		for(int i=factor;i<integer;i++) {
			if(integer%i==0) {
				integer = integer/i;
				factor = i;
				i--;           //��ֹ������������factor��ͬ�����
				System.out.print(factor+"*");
			} 
		}
		System.out.print(integer);
	}
}