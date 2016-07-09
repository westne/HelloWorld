/*
	旨在打印形如下图的三角形
	*
	**
	***
	****
*/
public class Triangle {
	public static void main(String[] args) {
		
		String asterisk = "*";
		String asterisk2 = asterisk + asterisk;
		System.out.println("打印一个示例："+asterisk);//打印一个*
		System.out.println("打印二个示例："+asterisk2);//打印二个*
		
		for(int line=0;line<4;line++) {
			System.out.println(asterisk);
			asterisk +="*";
		}
		
	}
}