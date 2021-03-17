package io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderExample {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("c:/Dev/git/JavaProject2/JavaProject2/src/io/FileExample.java");
		FileWriter fw = new FileWriter("c:/Temp/Dir/file1.txt");
//		int readCharNo;
//		char[] cbuf = new char[100];
		char[] readChars = new char[100];
		int data = 0;
		while ((data = fr.read(readChars)) != -1) {
//			String data = new String(cbuf, 0, readCharNo); // 0번째 위치부터 읽어온 데이터까지만 불러오기. 버퍼에 남아 있는 것들은 대상에서 제외
//			System.out.println((char) data);
//			System.out.print(new String(readChars));
			String readLines = new String(readChars);
			fw.write(readLines);
//			fw.write(data);
		}
//		fw.flush();
		fw.close();
		fr.close();
		System.out.println("end...");
	}

}
