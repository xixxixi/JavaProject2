package objects2;

import java.util.Scanner;

public class LibraryApplication {
	public static void main(String[] args) {
		Book[] bookList = new Book[10];

		Member user = new Member();
		Scanner scn = new Scanner(System.in);

		while (true) {
			System.out.println("--------------------------------------------------------");
			System.out.println("1)����������� 2)ȸ��������� 3)�����뿩 4)�����ݳ� 5)������� 9)����");
			System.out.println("--------------------------------------------------------");
			System.out.print("����> ");

			int menu = scn.nextInt();

			if (menu == 1) {
				for (int i = 0; i < 10; i++) {
					
					System.out.print("å �̸�> ");
					String name = scn.next();
					System.out.print("���� > ");
					String writer = scn.next();
					System.out.print("���ǻ� > ");
					String pub = scn.next();
					System.out.print("���� > ");
					int price = scn.nextInt();
					if (bookList[i] == null) {
						break;
					}
				}
			} else if (menu == 2) {
				System.out.print("ȸ�� �̸�> ");
				String memName = scn.next();
				System.out.print("ȸ�� ���̵�> ");
				String memId = scn.next();

			} else if (menu == 3) {
				user.rent(bookList[1]);
				System.out.println("������ �����Ͽ����ϴ�.");

			} else if (menu == 4) {
				user.overdue(bookList[1]);
				System.out.println("������ �ݳ��Ͽ����ϴ�.");

			} else if (menu == 5) {
				for (int i = 0; i < bookList.length; i++) {
					System.out.println(bookList[i]);
				}

			} else if (menu == 9) {
				break;

			}

		}
		System.out.println("���α׷� ����");
	}
}