/*
	�����������ʵ�ֳ���СƱ��ӡ
*/
public class MartReceipt {
	public static void main(String[] args) 
	{
		
		//Ʊͷ���֣��ַ���������ӡ
		System.out.println("              ��ӭ����          ");
		System.out.println("     Ʒ��       �ۼ�   ����  ���");
		System.out.println("--------------------------------");
		
		/*
			Ʊ�岿�֣�������ӡ��ʹ�ó˷���ȡ�ܼ�
			Ʒ����String��
			��Ʒ��ţ�String��
			�ۼۣ�double��
			������int��
			��double��
		*/
		//System.out.println("�������ֱ�����  15.5 *  22  341");
		String slsName = "�������ֱ�����";
		double slsPrice = 15.5;
		int slsNumber = 31;
		double slsTotal = slsPrice*slsNumber;
		System.out.println(slsName+"  "+slsPrice+" *  "+slsNumber+"  "+slsTotal);
		
		String skName = "�п�����ĵ����";
		double skPrice = 14.5;
		int skNumber = 50;
		double skTotal = skPrice*skNumber;
		System.out.println(skName+"  "+skPrice+" *  "+skNumber+"  "+skTotal);

		/*
			Ʊ�Ų��֣�������ӡ
			��Ʒ�����ܼƣ�int��
			��Ʒ������int��
			����ܼƣ�double��
		*/
		System.out.println("\n\n");
		int totalItemsNumber = 2;
		int totalNumber = slsNumber + skNumber;
		double totalMoney = slsTotal + skTotal;
		//totalMoney = (totalMoney >= 1000) && (slsNumber >= 30) ? (totalMoney * 0.9) : totalMoney;//�ñ��ʽ����ʵ�ֵ��ܽ���1000Ԫ�����������ֱ����ҹ�����������30ʱ���ܽ������
		System.out.println(totalItemsNumber+"����Ʒ  ���ƣ�"+totalNumber+"��");
		System.out.println("�ܼƣ�  "+totalMoney+"Ԫ");
		System.out.println("ƾ��СƱ��ȡ��Ʊ");
	}
}
