package ������ҵ.math;
/*
 * �����������󣬲��ô���ʵ��
    1.����¼��һ�����ַ���,��¼��һ��С�ַ���
    2.ͳ��С�ַ����ڴ��ַ����г��ֵĴ���
    3.�������д�ӡ��ʽ:
        ��������ַ���:woaiheima,heimabutongyubaima,wulunheimahaishibaima,zhaodaogongzuojiushihaoma
        ������С�ַ���:heima
        ����̨���:С�ַ���heima,�ڴ��ַ���woaiheima,heimabutongyubaima,wulunheimahaishibaima,zhaodaogongzuojiushihaoma�й�����3��
 */
public class Test2 {

	public static void main(String[] args) {
		String s1 ="woaiheima,heimabutongyubaima,wulunheimahaishibaima,zhaodaogongzuojiushihaoma";
		String s2 ="heima";
		int count = getcount(s1,s2);
		System.out.println( count);
	}

	private static int getcount(String s1, String s2) {
		int count=0;
		int index=0;
		while (!((index=s1.indexOf(s2, index))==-1)) {
			count++;
			index++;
		}
		return count;
	}

}
