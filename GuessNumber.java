/*
	��������Ϸ
	1������һ����1-100���������
		ʹ��Random�ࣨnextInt(maxValue)������ʵ�֣�������java.util����
	2������Ifѡ�����ʵ�����£�
		��¼�����ִ��������ʱ����ӡ��Sorry����´��ˡ�
		��¼������С�������ʱ����ӡ��Sorry�����С�ˡ�
		��¼�����ֵ��������ʱ����ӡ��Bingo��
	3����5�Σ�����δ�¶ԣ���ӡ��Sorry����Ļ��������꣡��
	4���¼ӹ��ܣ�ˢ��5��ѡ�����
*/
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args) {
		/*
			PART1 ���ɣ�1-100���������
		*/
		Random random = new Random();
		int randomNumber = random.nextInt(100)+1;

		/*
			PART2 ����Ifѡ����䣬Ƕ��¼������;
				���Ƕ��for��䣬ʵ��ʵ��¼��5��
		*/
		//System.out.println(randomNumber);
		
		for(int i=0;i<5;i++) {
			System.out.println("\n������һ����1-100��������");

			Scanner scanner = new Scanner(System.in);
			int guessNumber = scanner.nextInt();

			if(guessNumber>randomNumber) {
				System.out.println("Sorry����´���");
			} else if(guessNumber<randomNumber) {
				System.out.println("Sorry�����С��");
			} else {
				System.out.println("Bingo");
				break;
			}

			if(i<4) {
				System.out.println("�㻹��"+(4-i)+"�λ���");
				continue;
			} else {
				System.out.println("��������Ѿ��ù���!");
				System.out.println("�Ƿ��ٴγ�ֵ5����������1/0��\n��ֵ����ø�ǿ��");	
			}
			int continueGuess = scanner.nextInt();
			i = (continueGuess== 1)?-1:4;
			
		}
	}
}
