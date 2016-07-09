/* 断点:最左侧双击加断点,双击取消断点  哪里暂停点哪里
 * 
 * F5:进入方法内部调试   逐步调试
 * 
 * F6:不想看方法内部的执行细节,但是也会执行方法 
 * 
 * 
 * variables:程序中所有已经定义的变量,变量值发生变化,variables视图就会变黄
 * 
 * 
 * Expressions:针对某个变量自定义一些表达式,例如下面arr.length
 * 
 * 
 * F7:单步返回,看方法看了一半不想看了,直接返回到方法的调用处,但是方法中的return之前的语句都将被执行
 * 
 * 
 * 
 * F8:跳断点,A语句需要执行几千行代码才能执行到B语句,我不想看A,B之间的执行过程,直接
 *    在A语句上加断点,在B语句上也加断点,然后F8即可,A与B之间的语句已经被执行过了只不过不想看而已
 * 
 * 
 * DropToFrame:回退到方法的第一行,main方法除外
 *
 * Breakpoints:程序中所有的断点,可以统一删除或者让某个断点不再起到断点效果相当于没加断点
 * 
 * display:在debug的过程中插入代码,选中执行
 */
public class DebugDemo {

	public static void main(String[] args) { 
		int[] arr = { 1, 2, 3, 4, 5 };
		/*
		 * 上万行代码
		 * */
		int total=change(arr);
        System.out.println(total);
	}

	public static int change(int[] arr) {
		int sum=0;
		sum+=2;
		System.out.println(sum);
		System.out.println("哇哈哈动感超人"); 
		for (int i = 0;i < arr.length;i++) {
			if (arr[i] % 2 == 0) {
				sum += arr[i];
			}

		}
		return sum;

	}
}
