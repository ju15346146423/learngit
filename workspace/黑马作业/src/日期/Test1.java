package ����;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * �塢���ô���ʵ��:��ȡ��ǰ������,�����������ת
 * ��Ϊָ����ʽ���ַ���,��2088-08-08 08:08:08��
 */
public class Test1 {

	public static void main(String[] args) throws ParseException {
		Date date = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-dd hh-mm-ss");
		String format = simpleDateFormat.format(date);
		System.out.println(format);
		SimpleDateFormat format2 = new SimpleDateFormat("YYYY��MM��dd��");
		String s ="2017��07��03��";
		Date parse = format2.parse(s);
		System.out.println(parse);
		System.out.println(simpleDateFormat.format(parse));
	}

}
