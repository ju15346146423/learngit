package Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class Test1 {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("������", "Baby");
        map.put("�˳�", "��ٳ");
        map.put("�", "������");
        map.put("���ţ", "������");
//        map.remove("�");
//        map.put("���ţ", "wu");
       
        System.out.println(map);
        Collection<String> values = map.values();
        Iterator<String> iterator = values.iterator();
//        while (iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
       
        
	}

}
