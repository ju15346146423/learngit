package zuoye;

import java.util.Arrays;
import java.util.Random;

/**
 ����getNumList�������������100�����֣����ַ�Χ��1��10��
  * ����printCount������ͳ��ÿ�����ֳ��ֵĴ�������ӡ������̨��
 */
public class Test3 {

	public static void main(String[] args) {
		int i1[]= getNumList();
		int i2[]= printCount(i1);
		System.out.println(Arrays.toString(i1));
		System.out.println(Arrays.toString(i2));
	}

	private static int[] printCount(int[] i1) {
		int[] com = new int[10];
		int count=0;
		for (int i = 0; i < com.length; i++) {
			for (int j = 0; j <i1.length; j++) {
				if (i1[j]==i) {
					count++;
				}
			}
			//System.out.println(count);
			com[i]=count;
			count=0;
		}
		return com;
	}

	private static int[] getNumList() {
		Random random = new Random();
		int[] i1 = new int[100];
		for (int i = 0; i < 100; i++) {
			i1[i] =random.nextInt(10)+1;
		}
		return i1;
	}

}
