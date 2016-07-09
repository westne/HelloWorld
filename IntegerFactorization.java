/*
 * 将一个正整数分解质因数，例如输入90，打印90=2*3*3*5
 * 程序分析：设数字A，遍历[2,A)，获得最小质因数x、余数A_1，遍历[x,A_1)...直到x_n==A_n+1
 */
import java.util.Scanner;

public class IntegerFactorization {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个正整数：");
		int integer = sc.nextInt();
		System.out.println(integer+"=");
		int factor = 2;
		for(int i=factor;i<integer;i++) {
			if(integer%i==0) {
				integer = integer/i;
				factor = i;
				i--;           //防止跳过两个因子factor相同的情况
				System.out.print(factor+"*");
			} 
		}
		System.out.print(integer);
	}
}