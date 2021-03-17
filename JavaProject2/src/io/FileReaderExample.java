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
//			String data = new String(cbuf, 0, readCharNo);
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
