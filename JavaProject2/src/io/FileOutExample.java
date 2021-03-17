package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutExample {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("c:/Temp/Dir/cap.PNG");
		FileOutputStream fos = new FileOutputStream("c:/Temp/Dir/copyAry.PNG");
		int data = 0, cnt = 0;
		byte[] readBytes = new byte[100]; // �迭�� ����Ʈ�� �� �����ϱ� �������� �б� ������ ���� ����
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
