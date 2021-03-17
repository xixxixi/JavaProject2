package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutExample {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("c:/Temp/Dir/cap.PNG");
		FileOutputStream fos = new FileOutputStream("c:/Temp/Dir/copyAry.PNG");
		int data = 0, cnt = 0;
		byte[] readBytes = new byte[100]; // 배열에 바이트를 다 저장하기 전까지는 읽기 행위를 하지 않음
		while ((data = fis.read(readBytes)) != -1) {
			fos.write(data);
			cnt++;
		}
		fos.flush();
		fos.close();
		fis.close();

		System.out.println("end...." + cnt);
	}

}
