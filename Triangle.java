/*
	ּ�ڴ�ӡ������ͼ��������
	*
	**
	***
	****
*/
public class Triangle {
	public static void main(String[] args) {
		
		String asterisk = "*";
		String asterisk2 = asterisk + asterisk;
		System.out.println("��ӡһ��ʾ����"+asterisk);//��ӡһ��*
		System.out.println("��ӡ����ʾ����"+asterisk2);//��ӡ����*
		
		for(int line=0;line<4;line++) {
			System.out.println(asterisk);
			asterisk +="*";
		}
		
	}
}