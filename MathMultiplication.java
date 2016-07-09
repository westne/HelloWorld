/*
 	控制台输出九九乘法表
 	注：内循环终止条件j<=i，原因为九九乘法表为三角形
*/

public class MathMultiplication {
	public static void main(String[] args) {
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i+"*"+j+"="+(i*j)+" ");
			}
			System.out.println();
		}
	}
}