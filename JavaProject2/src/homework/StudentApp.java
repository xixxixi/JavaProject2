package homework;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentApp {
	private static Student[] accountArray = new Student[10];
	private static Scanner scn = new Scanner(System.in);
	

	public static void main(String[] args) {
		while (true) {
			System.out.println("-----------------------------------");
			System.out.println("1.�л� ��� 2.���� 3.���� 4.����Ʈ 5.����");
			System.out.println("-----------------------------------");
			System.out.print("����> ");

			int menu = scn.nextInt();

			if (menu == 1) {
				enterSutednt();
			}
			if (menu == 2) {
				updateStudent();
			}
			if (menu == 3) {
				deleteStudent();
			}
			if (menu == 4) {
				studentList();
			}
			if(menu ==5) {
				break;
			}
		}
		System.out.println("����");
	}

	public static void enterSutednt() {
		System.out.print("�̸�: ");
		String name = scn.next();
		System.out.print("�й�: ");
		int sid = scn.nextInt();
		System.out.print("����ó: ");
		String phone = scn.next();
		System.out.print("����: ");
		int score = scn.nextInt();

		Student stu = new Student(name, sid, phone, score);
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = stu;
				System.out.println("�л������ �Ϸ�Ǿ����ϴ�.");
				break;
			}
		}

	}

	private static void updateStudent() {
		System.out.print("�й�: ");
		int sid = scn.nextInt();
		System.out.print("����: ");
		int score = scn.nextInt();

		Student stu = findAccount(sid);

		if (stu == null) {
			System.out.println("�л������� �������� �ʽ��ϴ�.");
			return;
		}
		stu.setScore(score);
		System.out.println("������ �����Ǿ����ϴ�.");
	}
	
	private static void deleteStudent() {
		System.out.print("�й�: ");
		int sid = scn.nextInt();
		
		Student stu = findAccount(sid);

		ArrayList<Student> studentList = new ArrayList();
		
		sid = scn.nextInt();
		studentList.remove(sid - 1);
		System.out.println("���� �Ǿ����ϴ�.");
	}
	
	private static void studentList() {

		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null)
				break;
			System.out.println(accountArray[i].toString());
		}
	}

	private static Student findAccount(int sid) {
		Student stu = null;
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null) {
				if (accountArray[i].getSid() == sid) {
					stu = accountArray[i];
					break;
				}
			}

		}
		return stu;
	}
}