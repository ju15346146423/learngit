package ������ҵ.math;
/**
* ����һ�����100��С����ת��Ϊ������λС�����ַ�����������������������⡣
 */
public class Test3 {
	private static int indexOf;

	public static void main(String[] args) {
		double d1 = Math.random()*100;
		String s = d1+"";
		int i = s.indexOf(".");
		String substring = s.substring(0, i+3);
		System.out.println(substring);
	}
}
