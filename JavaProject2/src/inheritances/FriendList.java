package inheritances;

import java.util.Scanner;

import objects2.Book;

public class FriendList { // static �������� ������ �ν��Ͻ��� �����ؾ� ��
	static Friend[] friends = new Friend[10];

	public static void main(String[] args) {
		// �߰�... Scanner Ŭ����...
		// 1.ģ�� 2.�б�ģ�� 3.ȸ��ģ�� 4.��ü��� 5.ģ���̸� �˻� 6.����

		Scanner scn = new Scanner(System.in);
		

		while (true) {
			System.out.println("------------------------------------------------");
			System.out.println("1.�л� 2.�б�ģ�� 3.ȸ��ģ�� 4.��ü��� 5.ģ���̸� 6.����");
			System.out.println("------------------------------------------------");
			System.out.print("����> ");
			int menu = scn.nextInt();

			if (menu == 1) {
				System.out.print("ģ�� �̸�> ");
				String name = scn.next();
				System.out.print("��ȭ��ȣ> ");
				String phone = scn.next();

				Friend friend = new Friend(name, phone);
				saveFriend(friend);

			} else if (menu == 2) {
				System.out.print("ģ�� �̸�> ");
				String name = scn.next();
				System.out.print("��ȭ ��ȣ> ");
				String phone = scn.next();
				System.out.print("�а� ��> ");
				String major = scn.next();

				saveFriend(new UnivFriend(name, phone, major));

			} else if (menu == 3) {
				System.out.print("ģ�� �̸�> ");
				String name = scn.next();
				System.out.print("��ȭ ��ȣ> ");
				String phone = scn.next();
				System.out.print("�μ� ��> ");
				String department = scn.next();

				saveFriend(new ComFriend(name, phone, department));
				
			} else if (menu == 4) {
				for (Friend friend : friends) {
					if (friend != null) {
						System.out.println(friend.toString());
					}
				}
			} else if (menu == 5) {
				System.out.print("�̸� �˻�> ");
				String findName = scn.next();
				for (Friend friend : friends) {
					if (friend != null && friend.getName().equals(findName)) {
						System.out.println("ģ������: " + friend.toString());
					}
				}

			} else if (menu == 6) {
				break;
			}

		} // end of while
		System.out.println("����");
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