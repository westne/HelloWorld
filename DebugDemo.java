/* �ϵ�:�����˫���Ӷϵ�,˫��ȡ���ϵ�  ������ͣ������
 * 
 * F5:���뷽���ڲ�����   �𲽵���
 * 
 * F6:���뿴�����ڲ���ִ��ϸ��,����Ҳ��ִ�з��� 
 * 
 * 
 * variables:�����������Ѿ�����ı���,����ֵ�����仯,variables��ͼ�ͻ���
 * 
 * 
 * Expressions:���ĳ�������Զ���һЩ���ʽ,��������arr.length
 * 
 * 
 * F7:��������,����������һ�벻�뿴��,ֱ�ӷ��ص������ĵ��ô�,���Ƿ����е�return֮ǰ����䶼����ִ��
 * 
 * 
 * 
 * F8:���ϵ�,A�����Ҫִ�м�ǧ�д������ִ�е�B���,�Ҳ��뿴A,B֮���ִ�й���,ֱ��
 *    ��A����ϼӶϵ�,��B�����Ҳ�Ӷϵ�,Ȼ��F8����,A��B֮�������Ѿ���ִ�й���ֻ�������뿴����
 * 
 * 
 * DropToFrame:���˵������ĵ�һ��,main��������
 *
 * Breakpoints:���������еĶϵ�,����ͳһɾ��������ĳ���ϵ㲻���𵽶ϵ�Ч���൱��û�Ӷϵ�
 * 
 * display:��debug�Ĺ����в������,ѡ��ִ��
 */
public class DebugDemo {

	public static void main(String[] args) { 
		int[] arr = { 1, 2, 3, 4, 5 };
		/*
		 * �����д���
		 * */
		int total=change(arr);
        System.out.println(total);
	}

	public static int change(int[] arr) {
		int sum=0;
		sum+=2;
		System.out.println(sum);
		System.out.println("�۹������г���"); 
		for (int i = 0;i < arr.length;i++) {
			if (arr[i] % 2 == 0) {
				sum += arr[i];
			}

		}
		return sum;

	}
}
