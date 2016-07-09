/*
	用于简单的键盘录入名字和年龄，使用Scanner类（nextInt()和next()方法）
*/
import java.util.*;

public class MessagePutIn {

	public static void main(String[] args) {
		
		Scanner name = new Scanner(System.in);
		System.out.println("请输入你的名字：");
		String i = name.next();
		System.out.println(i);

		Scanner age = new Scanner(System.in);
		System.out.println("请输入你的年龄：");
		int j = age.nextInt();
		System.out.println(j);
	}
}
