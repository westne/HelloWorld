/*
	��������ʵ��һ���򵥵ĳ��й���ϵͳ��ʵ�ֹ��ܰ���:
		������Ʒ���۵���ӡ��
		�û�������Ʒ¼�룻
		������ɺ�Ʊ�ݴ�ӡ��
 */
/*
 ���ӹ��ܣ�switchѡ�����ѡ������ˡ��˳����ֹ��ܣ�
 if���ʵ�ֲ�ͬ���۷���
 */
/*
 ���ӹ��ܣ�ʹ�÷�����װ���룬��߿ɿ���
 */
/*
 ���ӹ��ܣ���¼��ˮ����ÿ�ν��׽��
 */
import java.util.ArrayList;
import java.util.Scanner;

public class SupermartManagement {

	static ArrayList<SuperMartmanagement_GoodsName> goodsList = new ArrayList<SuperMartmanagement_GoodsName>();
	static ArrayList<Integer> flowData = new ArrayList<Integer>();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		goods();

		/*
		 * ����switchѡ������������������� 1����ʾ������1���빺����ʾ����������ֵ�˳� 2��������ʾ������������ѡ��������������-1�˳�
		 * 3��������ɣ�ѡ��1���������ѡ��2��ӡСƱ
		 */
		System.out.println("\n");
		
		while (true) {
			System.out.println("��ӭ����\n");
			System.out.println("��ѡ��Ҫ���еĲ�����\n1 ��ʼ����\t2 ���������ӡСƱ\t3 �˳�����\t4�鿴��ˮ\t5�鿴����嵥\t6�������Ʒ");
			int x = sc.nextInt();
			switch (x) {

			case 1: // ������Ʒl
				martInstruction();
				putInQuantity();
				break;

			case 2: // ��ӡСƱ
				martReceipt();
				break;

			case 3: // �˳�����
				System.out.println("лл���Ļݹˣ�");
				
				for (int i = 0; i < goodsList.size(); i++) {
					goodsList.get(i).Quantity = 0;
					goodsList.get(i).Money = 0;
				}
				break;

			case 4:// չʾ��ˮ
				martFlowData();
				break;
				
			case 5://�鿴����嵥
				showGoodsItem();
				break;
				
			case 6://�����Ʒ��Ϣ
				addGoodsItem();
				break;
			}
		}
	}

	// ������goodsList��ֵ
	public static void goods() {
		SuperMartmanagement_GoodsName dz = new SuperMartmanagement_GoodsName();
		SuperMartmanagement_GoodsName az = new SuperMartmanagement_GoodsName();
		SuperMartmanagement_GoodsName mg = new SuperMartmanagement_GoodsName();

		dz.Name = "�������Ѵ�����";// ��������
		dz.Id = "009527";
		dz.Price = 12.5;
		dz.Unit = "��";
		dz.Quantity = 0;
		dz.Money = 0;

		az.Name = "���޽��ں츻ʿƻ��";// �츻ʿƻ��
		az.Id = "010234";
		az.Price = 3.4;
		az.Unit = "��";
		az.Quantity = 0;
		az.Money = 0;
		
		mg.Name = "��������";// �츻ʿƻ��
		mg.Id = "010288";
		mg.Price = 9.11;
		mg.Unit = "��";
		mg.Quantity = 0;
		mg.Money = 0;
		
		goodsList.add(dz);
		goodsList.add(az);
		goodsList.add(mg);
	}

	// ��Ʒ���۵�
	public static void martInstruction() {
		/*
		 * PART1 ������Ʒ���۵���ӡ ��ӡ��Ʒ��Ϣ������ Ʒ���� ��ţ� ���ۣ� ��λ�� �ڴ˶��� �������ܼ� ���ã�
		 */
		System.out.println("            ������Ʒ��Ŀ��        ");
		System.out.println("   ��Ʒ����        ��Ʒ���    ��Ʒ����  ��λ");
		for (int i = 0; i < goodsList.size(); i++) {
			System.out.println(goodsList.get(i).Name+" "+goodsList.get(i).Id+" "+goodsList.get(i).Price+" "+goodsList.get(i).Unit);
		}
	}

	// ������������ɹ���
	public static void putInQuantity() {
		/*
		 * PART2 �ɹ�����Ա����¼���û�ÿ����Ʒ�������� ʹ��Scanner�ࣨnextInt����������
		 */
		Scanner sc = new Scanner(System.in);// Scanner��������ʹ��Scanner�ڲ�����ʱ��Ҫ���裩
		for (int i = 0; i < goodsList.size(); i++) {
			System.out.println("\n��¼�빺��"+goodsList.get(i).Name+"������");
			goodsList.get(i).Quantity = sc.nextInt();
		}
	}

	// ��ӡСƱ
	public static void martReceipt() {
		/*
		 * PART3 ������ɺ󿪾�Ʊ�� ��ΪƱͷ��Ʊ�塢Ʊ��������
		 */
		/*
		 * Ʊͷ���ַ���������ӡ
		 */
		System.out.println("��ӡ����СƱ�У����Ժ�...");
		System.out.println("\n\n\n\n");
		System.out.println("����СƱϸ��");
		System.out.println("   ��Ʒ�� ���        ����       ��������      �ܼ�");
		System.out.println("===============================================");

		/*
		 * Ʊ�壺��ӡ������Ϣ��������ʽ���� �˴�����ǰ�洴������Ʒ��Ϣ���󣬴�ӡ���ݰ��� ��Ʒ���� ��� ���� �������� ���
		 * ע������Ʒ���Ƴ���7���ַ�ʱ����ʾ7���ַ�+...
		 * ʵ�ִ˹�������String�ࣨlength()������ȡ�ַ������ȣ�substring(beginIndex
		 * ,endindex)������ȡ����Ӵ���
		 */
		for (int i = 0; i < goodsList.size(); i++) {
			goodsList.get(i).Name = (goodsList.get(i).Name.length() > 7) ? (goodsList.get(i).Name.substring(0, 7) + "...") : goodsList.get(i).Name;
			goodsList.get(i).Money = goodsList.get(i).Price* goodsList.get(i).Quantity;
		}

		for (int i = 0; i < goodsList.size(); i++) {
			System.out.println(goodsList.get(i).Name+"("+goodsList.get(i).Id+")"+goodsList.get(i).Price+" "+goodsList.get(i).Quantity+" "+goodsList.get(i).Money);
		} 
		System.out.println("==============================================");

		/*
		 * Ʊ�ţ���ӡͳ����Ϣ������ ��Ʒ���� ��Ʒ���� �ܼƽ�� ע��1���ܼƽ��ܼƽ��>=500���ҹ���������������>=30ʱ��9��
		 * 2���ܼƽ��ͨ������������ʾΪ���� ͨ��Math�ࣨround()����ʵ�֣�
		 */
		int spItemsNumber = 2;
		int spQuantity = 0;
		double spMoney = 0;
		for (int i = 0; i < goodsList.size(); i++) {
			spQuantity += goodsList.get(i).Quantity;
			spMoney += goodsList.get(i).Money;
		} 
		System.out.println("������Ʒ" + spItemsNumber + "��    ����" + spQuantity
				+ "����Ʒ");
		System.out.println("�ܼƽ��" + spMoney + "Ԫ");

		if (spMoney >= 300 && spMoney < 600) {
			spMoney *= 0.95;
		} else if (spMoney >= 600 && spMoney < 1000) {
			spMoney *= 0.9;
		} else if (spMoney >= 1000 && goodsList.get(0).Quantity < 30) {
			spMoney *= 0.8;
		} else if (spMoney >= 1000 && goodsList.get(0).Quantity >= 30) {
			spMoney = spMoney * 0.8 - 20;
		}
		spMoney = Math.round(spMoney);
		int dzhMoney = (int) spMoney;
		System.out.println("���ۺ���" + dzhMoney + "Ԫ");

		Scanner sc = new Scanner(System.in);
		System.out.println("ʵ����");
		double sfMoney = sc.nextDouble();
		System.out.println(sfMoney + "Ԫ");
		double zlMoney = sfMoney - dzhMoney;
		System.out.println("����" + zlMoney + "Ԫ");
		System.out.println("��ƾ��СƱ��ȡ��Ʊ");
		System.out.println("лл���Ļݹˣ�\n\n");

		for (int i = 0; i < goodsList.size(); i++) {
			goodsList.get(i).Quantity = 0;
			goodsList.get(i).Money = 0;
		}

		flowData.add(dzhMoney); 
	}
	
	//չʾ��ˮ

	// չʾ������ˮ
	public static void martFlowData() {
		int sum = 0;
		System.out.print("������ǰ��������Ϊ��");
		for (int i = 0; i < flowData.size(); i++) {
			System.out.print(flowData.get(i) + "  ");
			sum += flowData.get(i);
		}
		System.out.println();
		System.out.println("����ˮΪ��" + sum);
	}
	
	//չʾ����嵥
	public static void showGoodsItem() {
		System.out.println("�����ǽ������Ʒ�嵥��");
		for (int i = 0; i < goodsList.size(); i++) {
			System.out.println(goodsList.get(i).Name);
		}
	}
	
	//���ӿ����Ŀ
	public static void addGoodsItem() {
		
		while(true) {
			SuperMartmanagement_GoodsName ww = new SuperMartmanagement_GoodsName();
			System.out.println("��������Ʒ����");
			ww.Name = sc.next();
			System.out.println("��������Ʒ��ţ�");
			ww.Id = sc.next();
			System.out.println("��������Ʒ���ۣ�");
			ww.Price = sc.nextDouble();
			System.out.println("��������Ʒ��λ��");
			ww.Unit = sc.next();
			ww.Quantity = 0;
			ww.Money = 0;
			goodsList.add(ww);
			System.out.println("�Ƿ������ӣ�1/0");
			if(sc.nextInt() ==0) break;
		}
	}
}
