package ������ҵ;

import java.io.File;
import java.io.IOException;

/**
 * ��ȡD��aaa�ļ�����b.txt�ļ���
 * �ļ������ļ���С���ļ��ľ���·���͸�·������Ϣ��������Ϣ����ڿ���̨��
 */
public class Test3 {
	public static void main(String[] args) throws IOException {
		File file = new File("a.txt");
		if(file.exists()) {
		System.out.println(file.getName());
		System.out.println(file.length());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getPath());
		System.out.println(file.getParent());
	}
	
}
}