/*
*	���101~200��������������������ֵ
*	���������101~200 ��������101 ... 199
*
*/
public class PrimeNumber_101_200 {
	public static void main(String[] args) {
		int k=0,l=0;
		for(int i=101;i<200;i++) {
			for(int j=2;j<100;j++) {
				if(i%j==0) l++;
			}
			if(l==0) {
				System.out.print(i+"\t");
				k++;
			}
			l = 0;
		}
		System.out.println();
		System.out.println(k);
	}
}