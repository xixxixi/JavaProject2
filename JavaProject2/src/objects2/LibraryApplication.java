package objects2;

import java.util.Scanner;

public class LibraryApplication {
	public static void main(String[] args) {
		Book[] bookList = new Book[10];

		Member user = new Member();
		Scanner scn = new Scanner(System.in);

		while (true) {
			System.out.println("--------------------------------------------------------");
			System.out.println("1)도서정보등록 2)회원정보등록 3)도서대여 4)도서반납 5)도서목록 9)종료");
			System.out.println("--------------------------------------------------------");
			System.out.print("선택> ");

			int menu = scn.nextInt();

			if (menu == 1) {
				for (int i = 0; i < 10; i++) {
					
					System.out.print("책 이름> ");
					String name = scn.next();
					System.out.print("저자 > ");
					String writer = scn.next();
					System.out.print("출판사 > ");
					String pub = scn.next();
					System.out.print("가격 > ");
					int price = scn.nextInt();
					if (bookList[i] == null) {
						break;
					}
				}
			} else if (menu == 2) {
				System.out.print("회원 이름> ");
				String memName = scn.next();
				System.out.print("회원 아이디> ");
				String memId = scn.next();

			} else if (menu == 3) {
				user.rent(bookList[1]);
				System.out.println("도서를 대출하였습니다.");

			} else if (menu == 4) {
				user.overdue(bookList[1]);
				System.out.println("도서를 반납하였습니다.");

			} else if (menu == 5) {
				for (int i = 0; i < bookList.length; i++) {
					System.out.println(bookList[i]);
				}

			} else if (menu == 9) {
				break;

			}

		}
		System.out.println("프로그램 종료");
	}
}