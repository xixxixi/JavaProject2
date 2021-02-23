package controls;

public class SwitchExample {

	public static void main(String[] args) {
//		for (int i = 0; i < 5; i++) {
//			int z = (int) (Math.random() * 5) + 1;
//			System.out.println(z); // 0°ú 1 »çÀÌ ÀÓÀÇÀÇ ¼ö
//
//		}
		String msg = "Â¦¼ö/È¦¼ö";
		int z = (int) (Math.random() * 6) + 1;
		switch(z) {
		case 1:
		case 3:
		case 5: msg ="È¦¼ö"; break;
		case 4:
		case 2: 
		case 6: msg ="Â¦¼ö"; break;
		}
			System.out.println(z + "´Â " + msg + "ÀÔ´Ï´Ù.");
		}

	}