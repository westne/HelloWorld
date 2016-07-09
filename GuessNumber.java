/*
	猜数字游戏
	1、生成一个（1-100）的随机数
		使用Random类（nextInt(maxValue)方法）实现，包含在java.util包中
	2、利用If选择语句实现如下：
		当录入数字大于随机数时，打印“Sorry，你猜大了”
		当录入数字小于随机数时，打印“Sorry，你猜小了”
		当录入数字等于随机数时，打印“Bingo”
	3、猜5次，若仍未猜对，打印“Sorry，你的机会已用完！”
	4、新加功能，刷新5次选择机会
*/
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args) {
		/*
			PART1 生成（1-100）的随机数
		*/
		Random random = new Random();
		int randomNumber = random.nextInt(100)+1;

		/*
			PART2 生成If选择语句，嵌套录入数字;
				外层嵌套for语句，实现实验录入5次
		*/
		//System.out.println(randomNumber);
		
		for(int i=0;i<5;i++) {
			System.out.println("\n请输入一个（1-100）的数字");

			Scanner scanner = new Scanner(System.in);
			int guessNumber = scanner.nextInt();

			if(guessNumber>randomNumber) {
				System.out.println("Sorry，你猜大了");
			} else if(guessNumber<randomNumber) {
				System.out.println("Sorry，你猜小了");
			} else {
				System.out.println("Bingo");
				break;
			}

			if(i<4) {
				System.out.println("你还有"+(4-i)+"次机会");
				continue;
			} else {
				System.out.println("你的运气已经用光了!");
				System.out.println("是否再次充值5次运气？（1/0）\n充值你会变得更强！");	
			}
			int continueGuess = scanner.nextInt();
			i = (continueGuess== 1)?-1:4;
			
		}
	}
}
