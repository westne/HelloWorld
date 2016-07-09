/*
	这个程序用于实现超市小票打印
*/
public class MartReceipt {
	public static void main(String[] args) 
	{
		
		//票头部分，字符串常量打印
		System.out.println("              欢迎光临          ");
		System.out.println("     品名       售价   数量  金额");
		System.out.println("--------------------------------");
		
		/*
			票体部分，变量打印，使用乘法获取总计
			品名：String型
			商品编号：String型
			售价：double型
			数量：int型
			金额：double型
		*/
		//System.out.println("少林寺酥饼核桃  15.5 *  22  341");
		String slsName = "少林寺酥饼核桃";
		double slsPrice = 15.5;
		int slsNumber = 31;
		double slsTotal = slsPrice*slsNumber;
		System.out.println(slsName+"  "+slsPrice+" *  "+slsNumber+"  "+slsTotal);
		
		String skName = "尚康杂粮牡丹饼";
		double skPrice = 14.5;
		int skNumber = 50;
		double skTotal = skPrice*skNumber;
		System.out.println(skName+"  "+skPrice+" *  "+skNumber+"  "+skTotal);

		/*
			票脚部分，变量打印
			商品种类总计：int型
			商品件数：int型
			金额总计：double型
		*/
		System.out.println("\n\n");
		int totalItemsNumber = 2;
		int totalNumber = slsNumber + skNumber;
		double totalMoney = slsTotal + skTotal;
		//totalMoney = (totalMoney >= 1000) && (slsNumber >= 30) ? (totalMoney * 0.9) : totalMoney;//该表达式用于实现当总金额超过1000元并且少林寺酥饼核桃购买数量大于30时，总金额打九折
		System.out.println(totalItemsNumber+"项商品  共计："+totalNumber+"件");
		System.out.println("总计：  "+totalMoney+"元");
		System.out.println("凭此小票换取发票");
	}
}
