package controls;

public class SwitchExample {

	public static void main(String[] args) {
//		for (int i = 0; i < 5; i++) {
//			int z = (int) (Math.random() * 5) + 1;
//			System.out.println(z); // 0�� 1 ���� ������ ��
//
//		}
		String msg = "¦��/Ȧ��";
		int z = (int) (Math.random() * 6) + 1;
		switch(z) {
		case 1:
		case 3:
		case 5: msg ="Ȧ��"; break;
		case 4:
		case 2: 
		case 6: msg ="¦��"; break;
		}
			System.out.println(z + "�� " + msg + "�Դϴ�.");
		}

	}