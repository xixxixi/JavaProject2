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
		byte[] readBytes = new byte[100]; // 100개의 값을 채울 때 까지 1바이트씩 배열에 담았다가 100개를 읽은 다음 반복해서 읽는 횟수를 줄임
		while ((data = is.read(readBytes)) != -1) {
			System.out.write(data);
			cnt++;
		}
		is.close();
		System.out.println();
		System.out.println(cnt + "반복");
		System.out.println("==========end==========");
	}

}
