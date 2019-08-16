package zuoye;
/*## �����⣺����ʵ��

* �������n���˿��ơ�
* ����ʵ�֣�Ч����ͼ��ʾ��
  ![](img\6.jpg)
* ������ʾ��
  - ʹ�ü��ϱ������е��˿��ƶ���
  - ���������У�����Ƴ�n���ƣ����浽�¼��ϡ�
  - �ж�n��ֵ�����ܳ�Խһ���˿��Ƶķ�Χ��


* �ο��𰸣�


```java*/

import java.util.ArrayList;
import java.util.Random;

public class Test6 {
	    public static void main(String[] args) {
	        int n = 5;
	        ArrayList<Card> cards = randomCard(n);
	
	        if (cards != null) {
	            System.out.println("���"+ n +"����:" );
	            for (int i = 0; i < cards.size(); i++) {
	                Card card = cards.get(i);
	                card.showCard();
	            }
	        }else {
	            System.out.println(n+"��Խ��Χ,�޷���ȡ��" );
	        }
	
	        System.out.println();
	        System.out.println();
	        int n2 = 55;
	        ArrayList<Card> cards2 = randomCard(n2);
	
	        if (cards2 != null) {
	            System.out.println("���"+ n2 +"����:" );
	            for (int i = 0; i < cards.size(); i++) {
	                Card card = cards.get(i);
	                card.showCard();
	            }
	        }else {
	            System.out.println("���"+ n2 +"����:\r\n��Խ��Χ,�޷���ȡ" );
	        }
	    }
	    public static ArrayList<Card> randomCard(int n) {
	        if (n > 54 || n < 0)
	            return null;
	
	        ArrayList<Card> rList = new ArrayList<>();
	        ArrayList<Card> cards = allCard();
	
	        Random r = new Random();
	        for (int i = 0; i < n; i++) {
	            int index = r.nextInt(cards.size());
	            Card rCard = cards.remove(index);
	            rList.add(rCard);
	        }
	        return rList;
	    }
	
	    public static ArrayList<Card> allCard() {
	        ArrayList<Card> allList = new ArrayList<>();
	        // ��ɫ����
	        String[] hs = {"����", "����", "÷��", "��Ƭ"};
	        // ��������
	        String[] ds = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
	
	        for (int H = 0; H < hs.length; H++) {
	            for (int d = 0; d < ds.length; d++) {
	                Card card = new Card(hs[H], ds[d]);
	                // ��ӵ�����
	                allList.add(card);
	            }
	        }
	        return allList;
	    }
	}
	
	class Card {
	    private String ds; // ����
	    private String hs; // ��ɫ
	    public Card(String ds, String hs) {
	        this.ds = ds;
	        this.hs = hs;
	    }
	    public void showCard() {
	        System.out.print(ds + hs+" ");
	    }
	}