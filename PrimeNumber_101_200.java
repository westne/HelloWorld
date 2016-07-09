/*
*	输出101~200以内素数个数及具体数值
*	程序分析：101~200 内素数：101 ... 199
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