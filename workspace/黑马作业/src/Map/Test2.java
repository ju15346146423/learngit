package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

/**
 �塢��ʹ��Map���ϴ洢�Զ�����������Car��������Ӧ�ļ۸���ֵ
 ����ʹ��keySet��entrySet���ַ�ʽ����Map���ϡ�
 */
public class Test2 {
	public static void main(String[] args) {
		HashMap<Car, Integer> hash = new HashMap<>();
		Car c1 = new Car("��������", "��ɫ");
        Car c3 = new Car("����QQ", "��ɫ");
        Car c2 = new Car("��ľ����", "��ɫ");
        hash.put(c1,1000);
        hash.put(c2,100056);
        hash.put(c3,100078);
        Set<Car> keySet = hash.keySet();
        Iterator<Car> iterator = keySet.iterator();
        while (iterator.hasNext()) {
        System.out.println(hash.get(iterator.next()));
		}
        Set<Entry<Car, Integer>> entrySet = hash.entrySet();
        Iterator<Entry<Car, Integer>> iterator2 = entrySet.iterator();
        while (iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
	}

}
