package homework;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentApp {
	private static Student[] accountArray = new Student[10];
	private static Scanner scn = new Scanner(System.in);
	

	public static void main(String[] args) {
		while (true) {
			System.out.println("-----------------------------------");
			System.out.println("1.학생 등록 2.수정 3.삭제 4.리스트 5.종료");
			System.out.println("-----------------------------------");
			System.out.print("선택> ");

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
		System.out.println("종료");
	}

	public static void enterSutednt() {
		System.out.print("이름: ");
		String name = scn.next();
		System.out.print("학번: ");
		int sid = scn.nextInt();
		System.out.print("연락처: ");
		String phone = scn.next();
		System.out.print("점수: ");
		int score = scn.nextInt();

		Student stu = new Student(name, sid, phone, score);
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = stu;
				System.out.println("학생등록이 완료되었습니다.");
				break;
			}
		}

	}

	private static void updateStudent() {
		System.out.print("학번: ");
		int sid = scn.nextInt();
		System.out.print("성적: ");
		int score = scn.nextInt();

		Student stu = findAccount(sid);

		if (stu == null) {
			System.out.println("학생정보가 존재하지 않습니다.");
			return;
		}
		stu.setScore(score);
		System.out.println("성적이 수정되었습니다.");
	}
	
	private static void deleteStudent() {
		System.out.print("학번: ");
		int sid = scn.nextInt();
		
		Student stu = findAccount(sid);

		ArrayList<Student> studentList = new ArrayList();
		
		sid = scn.nextInt();
		studentList.remove(sid - 1);
		System.out.println("삭제 되었습니다.");
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