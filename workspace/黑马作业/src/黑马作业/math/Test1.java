package ������ҵ.math;

import java.util.Scanner;

/**
* ��ת����¼����ַ�����
 */
public class Test1 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string = scanner.next();
		String rs = reverse(string);
		System.out.println("��ת���ַ���Ϊ"+rs);
	}

	private static String reverse(String string) {
		char[] charArray = string.toCharArray();
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = charArray.length-1; i >=0; i--) {
			stringBuilder.append(charArray[i]);
			
		}
		String string2 = stringBuilder.toString();
		return string2;
	}
}
