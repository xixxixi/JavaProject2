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
				for (int i = 0; i < bookList.length; i++) {
					System.out.print("å �̸�> ");
					String name = scn.nextLine();
					System.out.print("���� > ");
					String writer = scn.nextLine();
					System.out.print("���ǻ� >");
					String pub = scn.nextLine();
					System.out.print("���� >");
					int price = scn.nextInt();
					if (bookList[i] == null) {
						break;
					}
				}
			} else if (menu == 2) {
				System.out.print("ȸ�� �̸�> ");
				String memName = scn.nextLine();
				System.out.print("ȸ�� ���̵�> ");
				String memId = scn.nextLine();

			} else if (menu == 3) {

			} else if (menu == 4) {

			} else if (menu == 5) {

			} else if (menu == 9) {
				System.out.println("���α׷� ����");
			}
		}
	}
}