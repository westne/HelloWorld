/*
 * ��������������һ�����������
 * 1��¼��ȫ��ѧ��������
 * 2������ȫ��ѧ������
 * 3�������������һ��ѧ��������
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
	
	//¼�벢��ÿ��ѧ�����ƴ洢��������
	public static String[] storeName(String[] student) {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<student.length;i++) {
			System.out.println("�������"+(i+1)+"��ͬѧ�����ƣ�");
			student[i] = sc.next();
		}
		return student;
	}
	
	//���ÿһλѧ������
	public static void showName(String[] student) {
		System.out.println("ѧ����������Ϊ��");
		for(int i=0;i<student.length;i++) System.out.print(student[i]+"  ");
	}
	
	//�������һ��ѧ������
	public static void randomName(String[] student) {
		Random random = new Random();
		int i = random.nextInt(5);
		System.out.println("�㵽���������ǣ�");
		System.out.println(student[i]);
	}
}