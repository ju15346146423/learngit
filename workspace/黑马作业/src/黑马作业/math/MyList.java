package ������ҵ.math;

import java.util.ArrayList;
import java.util.Arrays;

/*�Զ���MyList�࣬ʵ�ִ�ȡԪ�صĹ��ܡ�

* ����add���������Ա���Ԫ�أ����MyListβ����
* ����remove���������Ի�ȡ�������ӵ�Ԫ�أ�����MyList���Ƴ���Ԫ�ء�
* ����show����������չʾMyList�е�Ԫ�ء�*/
public class MyList {
	 ArrayList<Object> list = new ArrayList<>();
	 
	 public void add(Object e){
		 this.list.add(e);
	 }
 
	 public Object remove(){
		 this.list.remove(list.size()-1);
		return list;
		 
	 }
 
	 public void show(){
		 System.out.println(list);
 }
	 
}    
