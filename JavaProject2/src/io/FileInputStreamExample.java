package io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStreamExample {
	public static void main(String[] args) throws IOException {
//		String file = FileInputStream class.getClass().getResource
		InputStream is = new FileInputStream("c:/Dev/git/JavaProject2/JavaProject2/src/io/FileExample.java");
		int data = 0;
		int cnt = 0;
		byte[] readBytes = new byte[100]; // 100���� ���� ä�� �� ���� 1����Ʈ�� �迭�� ��Ҵٰ� 100���� ���� ���� �ݺ��ؼ� �д� Ƚ���� ����
		while ((data = is.read(readBytes)) != -1) {
			System.out.write(data);
			cnt++;
		}
		is.close();
		System.out.println();
		System.out.println(cnt + "�ݺ�");
		System.out.println("==========end==========");
	}

}
