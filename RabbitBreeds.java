/*
 * ּ�ڽ��һ���ŵ����⣺
 * 	��һ�����ӣ��ӳ������3������ÿ���¶���һ��С���ӣ�
 * С���ӳ�����3���º�ÿ������һ�����ӣ��������Ӷ�������
 * ��ÿ���µ�����������
 * �������·ݣ�1 2 3 4 5  6  7  8  9
 * 		  ������2 2 4 6 10 16 26 42 68
 * 		Ҳ����˵��������������=ǰһ��������+ǰǰһ��������
 */
import java.util.Scanner;
public class RabbitBreeds {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�����뽫Ҫ��ѯ���·ݣ�");
		int monthCount = sc.nextInt();
		System.out.println(mathCount(monthCount));
	}
		
		
	public static int mathCount(int month1) {	
		int total = 0;//���������·ݺ�����
		int total_1 = 0;//����ǰһ���µ�������
		int total_2 = 2;//����ǰǰһ���µ�������
		for(int month=1;month<=month1;month++) {
			total = total_1 + total_2;
			total_2 = total_1;
			total_1 = total;
		}
		return total;
	}
}