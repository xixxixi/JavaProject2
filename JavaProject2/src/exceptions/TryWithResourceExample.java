package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryWithResourceExample {
	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("src/controls/DoWhileExample.java")){
			int readByte = -1;
			while((readByte = fis.read()) != -1){	// 1바이트씩 읽어서 readByte에 담는다. 값이 -1이 아닐 동안 담는다.
				System.out.write(readByte);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		System.out.println("end of prog");
	}
}
