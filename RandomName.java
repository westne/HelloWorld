/*
 * 本程序用于生成一个随机点名器
 * 1、录入全体学生的姓名
 * 2、遍历全部学生姓名
 * 3、随机产生任意一个学生的姓名
 */
import java.util.Random;
import java.util.Scanner;

public class RandomName {
	public static void main(String[] args) {
		String[] studentsName = new String[5];
		storeName(studentsName);
		showName(studentsName);
		System.out.println();
		randomName(studentsName);
	}
	
	//录入并将每个学生名称存储在数组中
	public static String[] storeName(String[] student) {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<student.length;i++) {
			System.out.println("请输入第"+(i+1)+"个同学的名称：");
			student[i] = sc.next();
		}
		return student;
	}
	
	//输出每一位学生名称
	public static void showName(String[] student) {
		System.out.println("学生姓名依次为：");
		for(int i=0;i<student.length;i++) System.out.print(student[i]+"  ");
	}
	
	//随机产生一名学生姓名
	public static void randomName(String[] student) {
		Random random = new Random();
		int i = random.nextInt(5);
		System.out.println("点到名的朋友是：");
		System.out.println(student[i]);
	}
}