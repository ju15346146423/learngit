package ������ҵ;

import java.util.ArrayList;
import java.util.List;

/**
 * Collection���ϼ���ת����
 */
public class Test2 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(100);
		list.add(200);
		list.add(300);
		Object[] array = list.toArray();
		for (Object object : array) {
			System.out.println(object);
		}
	}

}
