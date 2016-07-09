/*
 * 旨在解决一个古典问题：
 * 	有一对兔子，从出生后第3个月起每个月都生一对小兔子，
 * 小兔子长到第3个月后每月又生一对兔子，假如兔子都不死，
 * 问每个月的兔子总数？
 * 分析：月份：1 2 3 4 5  6  7  8  9
 * 		  个数：2 2 4 6 10 16 26 42 68
 * 		也就是说，当月兔子总数=前一个月总数+前前一个月总数
 */
import java.util.Scanner;
public class RabbitBreeds {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入将要查询的月份：");
		int monthCount = sc.nextInt();
		System.out.println(mathCount(monthCount));
	}
		
		
	public static int mathCount(int month1) {	
		int total = 0;//声明变量月份和兔子
		int total_1 = 0;//声明前一个月的兔子数
		int total_2 = 2;//声明前前一个月的兔子数
		for(int month=1;month<=month1;month++) {
			total = total_1 + total_2;
			total_2 = total_1;
			total_1 = total;
		}
		return total;
	}
}