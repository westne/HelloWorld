/*
	���ڼ򵥵ļ���¼�����ֺ����䣬ʹ��Scanner�ࣨnextInt()��next()������
*/
import java.util.*;

public class MessagePutIn {

	public static void main(String[] args) {
		
		Scanner name = new Scanner(System.in);
		System.out.println("������������֣�");
		String i = name.next();
		System.out.println(i);

		Scanner age = new Scanner(System.in);
		System.out.println("������������䣺");
		int j = age.nextInt();
		System.out.println(j);
	}
}
