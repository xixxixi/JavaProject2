package homework;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Scanner;

public class Morning0318 {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("c:/Temp/namelist.txt");
		Writer writer = new OutputStreamWriter(fos);
		
		String name = null;
		String phone = null;
		
		Scanner scn = new Scanner(System.in);
		
		while(true) {
			System.out.print("�̸� �Է�> ");
			name = scn.next();
			System.out.print("��ȣ �Է�> ");
			phone = scn.next();
			if(name.equals("end")) {
				break;
			}
		}
		
		writer.write(name);
		writer.write(phone);
		
		writer.flush();
		writer.close();
		System.out.println("���� ������ �������ϴ�.");
		
	}
}
