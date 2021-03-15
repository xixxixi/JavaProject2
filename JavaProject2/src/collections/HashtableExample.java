package collections;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashtableExample {
	public static void main(String[] args) {
		Map<String, String> map = new Hashtable<String, String>();

		map.put("spring", "12");	// ���̵�� ��й�ȣ�� �̸� ����
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");

		Scanner scanner = new Scanner(System.in);	// Ű����κ��� �Էµ� ������ �ޱ� ���� ����

		while (true) {
			System.out.println("���̵�� ��й�ȣ�� �Է����ּ���");
			System.out.print("���̵�: ");
			String id = scanner.nextLine();	// Ű����� �Է��� ���̵� �д´�

			System.out.print("��й�ȣ: ");
			String password = scanner.nextLine();
			System.out.println();

			if (map.containsKey(id)) {		// ���̵� Ű�� �����ϴ��� Ȯ���Ѵ�
				if (map.get(id).equals(password)) {	// ��й�ȣ�� ���Ѵ�
					System.out.println("�α��� �Ǿ����ϴ�.");
					break;
				} else {
					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
				}
			} else {
				System.out.println("�Է��Ͻ� ���̵� �������� �ʽ��ϴ�.");
			}
		}
	}

}
