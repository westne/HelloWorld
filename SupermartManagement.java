/*
	程序用于实现一个简单的超市管理系统，实现功能包括:
		超市物品报价单打印；
		用户购买商品录入；
		购买完成后票据打印。
 */
/*
 增加功能：switch选择语句选择购物、结账、退出三种功能；
 if语句实现不同打折方案
 */
/*
 增加功能：使用方法封装代码，提高可看性
 */
/*
 增加功能：记录流水，即每次交易金额
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
		 * 加入switch选择语句完成整个购物过程 1、提示：输入1进入购物提示，输入其他值退出 2、购物提示界面输入数字选择购买数量，输入-1退出
		 * 3、购物完成，选择1继续购物，或选择2打印小票
		 */
		System.out.println("\n");
		
		while (true) {
			System.out.println("欢迎光临\n");
			System.out.println("请选择要进行的操作：\n1 开始购物\t2 结束购物，打印小票\t3 退出购买\t4查看流水\t5查看库存清单\t6添加新商品");
			int x = sc.nextInt();
			switch (x) {

			case 1: // 购买商品l
				martInstruction();
				putInQuantity();
				break;

			case 2: // 打印小票
				martReceipt();
				break;

			case 3: // 退出购买
				System.out.println("谢谢您的惠顾！");
				
				for (int i = 0; i < goodsList.size(); i++) {
					goodsList.get(i).Quantity = 0;
					goodsList.get(i).Money = 0;
				}
				break;

			case 4:// 展示流水
				martFlowData();
				break;
				
			case 5://查看库存清单
				showGoodsItem();
				break;
				
			case 6://添加商品信息
				addGoodsItem();
				break;
			}
		}
	}

	// 给集合goodsList赋值
	public static void goods() {
		SuperMartmanagement_GoodsName dz = new SuperMartmanagement_GoodsName();
		SuperMartmanagement_GoodsName az = new SuperMartmanagement_GoodsName();
		SuperMartmanagement_GoodsName mg = new SuperMartmanagement_GoodsName();

		dz.Name = "德州无籽大西瓜";// 无籽西瓜
		dz.Id = "009527";
		dz.Price = 12.5;
		dz.Unit = "个";
		dz.Quantity = 0;
		dz.Money = 0;

		az.Name = "澳洲进口红富士苹果";// 红富士苹果
		az.Id = "010234";
		az.Price = 3.4;
		az.Unit = "个";
		az.Quantity = 0;
		az.Money = 0;
		
		mg.Name = "美国香梨";// 红富士苹果
		mg.Id = "010288";
		mg.Price = 9.11;
		mg.Unit = "斤";
		mg.Quantity = 0;
		mg.Money = 0;
		
		goodsList.add(dz);
		goodsList.add(az);
		goodsList.add(mg);
	}

	// 商品报价单
	public static void martInstruction() {
		/*
		 * PART1 超市商品报价单打印 打印商品信息包括： 品名； 编号； 单价； 单位； 在此定义 数量和总价 备用；
		 */
		System.out.println("            超市商品价目表        ");
		System.out.println("   商品名称        商品编号    商品单价  单位");
		for (int i = 0; i < goodsList.size(); i++) {
			System.out.println(goodsList.get(i).Name+" "+goodsList.get(i).Id+" "+goodsList.get(i).Price+" "+goodsList.get(i).Unit);
		}
	}

	// 输入数量，完成购买
	public static void putInQuantity() {
		/*
		 * PART2 由工作人员负责录入用户每种商品购买数量 使用Scanner类（nextInt（）方法）
		 */
		Scanner sc = new Scanner(System.in);// Scanner创建对象（使用Scanner内部方法时必要步骤）
		for (int i = 0; i < goodsList.size(); i++) {
			System.out.println("\n请录入购买"+goodsList.get(i).Name+"数量：");
			goodsList.get(i).Quantity = sc.nextInt();
		}
	}

	// 打印小票
	public static void martReceipt() {
		/*
		 * PART3 购买完成后开具票据 分为票头、票体、票脚三部分
		 */
		/*
		 * 票头：字符串常量打印
		 */
		System.out.println("打印购物小票中，请稍侯...");
		System.out.println("\n\n\n\n");
		System.out.println("购物小票细则");
		System.out.println("   商品名 编号        单价       购买数量      总计");
		System.out.println("===============================================");

		/*
		 * 票体：打印购物信息，变量形式储存 此处调用前面创建的商品信息对象，打印内容包括 商品名称 编号 单价 购买数量 金额
		 * 注：当商品名称超过7个字符时，显示7个字符+...
		 * 实现此功能利用String类（length()方法获取字符串长度；substring(beginIndex
		 * ,endindex)方法截取获得子串）
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
		 * 票脚：打印统计信息，包括 商品项数 商品总数 总计金额 注：1、总计金额当总计金额>=500并且购买无籽西瓜数量>=30时打9折
		 * 2、总计金额通过四舍五入显示为整数 通过Math类（round()方法实现）
		 */
		int spItemsNumber = 2;
		int spQuantity = 0;
		double spMoney = 0;
		for (int i = 0; i < goodsList.size(); i++) {
			spQuantity += goodsList.get(i).Quantity;
			spMoney += goodsList.get(i).Money;
		} 
		System.out.println("购买商品" + spItemsNumber + "项    共计" + spQuantity
				+ "件商品");
		System.out.println("总计金额" + spMoney + "元");

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
		System.out.println("打折后金额" + dzhMoney + "元");

		Scanner sc = new Scanner(System.in);
		System.out.println("实付金额：");
		double sfMoney = sc.nextDouble();
		System.out.println(sfMoney + "元");
		double zlMoney = sfMoney - dzhMoney;
		System.out.println("找零" + zlMoney + "元");
		System.out.println("可凭此小票领取发票");
		System.out.println("谢谢您的惠顾！\n\n");

		for (int i = 0; i < goodsList.size(); i++) {
			goodsList.get(i).Quantity = 0;
			goodsList.get(i).Money = 0;
		}

		flowData.add(dzhMoney); 
	}
	
	//展示流水

	// 展示当日流水
	public static void martFlowData() {
		int sum = 0;
		System.out.print("截至当前本日收入为：");
		for (int i = 0; i < flowData.size(); i++) {
			System.out.print(flowData.get(i) + "  ");
			sum += flowData.get(i);
		}
		System.out.println();
		System.out.println("总流水为：" + sum);
	}
	
	//展示库存清单
	public static void showGoodsItem() {
		System.out.println("以下是今天的商品清单：");
		for (int i = 0; i < goodsList.size(); i++) {
			System.out.println(goodsList.get(i).Name);
		}
	}
	
	//增加库存项目
	public static void addGoodsItem() {
		
		while(true) {
			SuperMartmanagement_GoodsName ww = new SuperMartmanagement_GoodsName();
			System.out.println("请输入商品名：");
			ww.Name = sc.next();
			System.out.println("请输入商品编号：");
			ww.Id = sc.next();
			System.out.println("请输入商品单价：");
			ww.Price = sc.nextDouble();
			System.out.println("请输入商品单位：");
			ww.Unit = sc.next();
			ww.Quantity = 0;
			ww.Money = 0;
			goodsList.add(ww);
			System.out.println("是否继续添加？1/0");
			if(sc.nextInt() ==0) break;
		}
	}
}
