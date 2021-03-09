package boardPkg.control;

import java.util.Scanner;

import boardPkg.model.Board;
import boardPkg.model.Service; // ctrl+shift+o
import boardPkg.model.impl.ServiceImpl;

public class BoardMain {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int menu = 0;

		Service service = new ServiceImpl();

		while (true) {
			System.out.println("--------------------------------------");
			System.out.println("1.�Է� 2.���� 3.���� 4.��ȸ 5.����Ʈ 9.����");
			System.out.println("--------------------------------------");
			System.out.print("����> ");
			menu = scn.nextInt();
			if (menu == 1) { // �Է�ó��
				System.out.print("�Խñ۹�ȣ �Է�> ");
				int boardNo = scn.nextInt();
				scn.nextLine(); // int�� ���Ͱ��� ��ȯ���� ����
				System.out.print("�Խñ����� �Է�> ");
				String title = scn.nextLine();
				System.out.print("�Խñ۳��� �Է�> ");
				String content = scn.nextLine();
				System.out.print("�Խñ��ۼ��� �Է�> ");
				String writer = scn.nextLine();
				Board board = new Board(boardNo, title, content, writer, null);
				service.createBoard(board);

			} else if (menu == 2) { // ����ó��
				System.out.print("�Խñ� ��ȣ �Է�> ");
				int boardNo = scn.nextInt();
				scn.nextLine();
				System.out.print("�Խñ۳��� �Է�> ");
				String content = scn.nextLine();
				Board board = new Board(boardNo, null, content, null, null);
				service.modifyBoard(board);

			} else if (menu == 3) { // ����ó��
				System.out.print("�Խñ� ��ȣ �Է�> ");
				int boardNo = scn.nextInt();
				scn.nextLine();
				Board board = new Board(boardNo, null, null, null, null);
				service.removeBoard(board);

			} else if (menu == 4) { // ��ȸ
				System.out.print("�Խñ� ��ȣ �Է�> ");
				int boardNo = scn.nextInt();
				scn.nextLine();
				Board board = service.getBoard(boardNo);
				System.out.println(board.toString());

			} else if (menu == 5) { // ����Ʈ
				Board[] list = service.getBoardList(); // �� ��ü ��� ��ȸ
				for (Board bo : list) {
					if (bo != null)
						System.out.println(bo.toString());
				}

			} else if (menu == 9) { // ����
				break;
			}
		} // end of while
		System.out.println("���α׷� ����.");

//		service.getBoard(15); // �۹�ȣ 15 ��ȸ
//		Board[] list = service.getBoardList(); // �� ��ü ��� ��ȸ
//		for (Board bo : list) {
//			if (bo != null)
//				System.out.println(bo.toString());
//		}
//		System.out.println("========================");
//		Board select = service.getBoard(2);
//		System.out.println(select.toString());

	} // end of main

} // end of class
