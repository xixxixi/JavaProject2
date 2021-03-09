package api;

public class ByteToStringExample {
	public static void main(String[] args) {
		byte[] bytes = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97};
		
		String str1= new String(bytes);
		System.out.println(str1);
		
		String str2 = new String (bytes, 6, 4);	// 74번 위치(7개의 바이트를 읽었기 때문), 4개
		System.out.println(str2);
	}

}
