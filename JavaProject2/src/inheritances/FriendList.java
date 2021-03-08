package inheritances;

import java.util.Scanner;

import objects2.Book;

public class FriendList { // static 선언하지 않으면 인스턴스를 생성해야 함
	static Friend[] friends = new Friend[10];

	public static void main(String[] args) {
		// 추가... Scanner 클래스...
		// 1.친구 2.학교친구 3.회사친구 4.전체목록 5.친구이름 검색 6.종료

		Scanner scn = new Scanner(System.in);
		

		while (true) {
			System.out.println("------------------------------------------------");
			System.out.println("1.학생 2.학교친구 3.회사친구 4.전체목록 5.친구이름 6.종료");
			System.out.println("------------------------------------------------");
			System.out.print("선택> ");
			int menu = scn.nextInt();

			if (menu == 1) {
				System.out.print("친구 이름> ");
				String name = scn.next();
				System.out.print("전화번호> ");
				String phone = scn.next();

				Friend friend = new Friend(name, phone);
				saveFriend(friend);

			} else if (menu == 2) {
				System.out.print("친구 이름> ");
				String name = scn.next();
				System.out.print("전화 번호> ");
				String phone = scn.next();
				System.out.print("학과 명> ");
				String major = scn.next();

				saveFriend(new UnivFriend(name, phone, major));

			} else if (menu == 3) {
				System.out.print("친구 이름> ");
				String name = scn.next();
				System.out.print("전화 번호> ");
				String phone = scn.next();
				System.out.print("부서 명> ");
				String department = scn.next();

				saveFriend(new ComFriend(name, phone, department));
				
			} else if (menu == 4) {
				for (Friend friend : friends) {
					if (friend != null) {
						System.out.println(friend.toString());
					}
				}
			} else if (menu == 5) {
				System.out.print("이름 검색> ");
				String findName = scn.next();
				for (Friend friend : friends) {
					if (friend != null && friend.getName().equals(findName)) {
						System.out.println("친구정보: " + friend.toString());
					}
				}

			} else if (menu == 6) {
				break;
			}

		} // end of while
		System.out.println("종료");
	} // end of main

	public static void saveFriend(Friend friend) {
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] == null) {
				friends[i] = friend;
				;
			}

		}
	}
} // end of class