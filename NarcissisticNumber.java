/*
 * ��ӡ�����е�ˮ�ɻ�����ˮ�ɻ���ָ��λ�������λ����������Ϊ������ֵ��
 * ���������abc��a^3+b^3+c^3 == a*100+b*10+c
 */
public class NarcissisticNumber {
	public static void main(String[] args) {
		int a,b,c;
		for(c=0;c<=9;c++) {
			for(b=0;b<=9;b++) {
				for(a=1;a<=9;a++) {
					if(a*a*a+b*b*b+c*c*c == a*100+b*10+c) System.out.print((a*100+b*10+c)+"\t");
				}
			}
		}
	}
}