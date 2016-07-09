/*
 * 找出1000以内全部完数
 * 设完数A，A=sum(A%i=0的i)
 */
public class PerfectNumber {
	public static void main(String[] args) {
		for(int integer=5,factor=0;integer<=1000;integer++) {
			for(int i=1;i<integer;i++) {
				if(integer%i==0) factor += i;
			}
			if(integer==factor) System.out.print(integer+"\t");
			factor = 0;       //如果此处不清零，则factor的值会一直累加！！
		}
	}	
}