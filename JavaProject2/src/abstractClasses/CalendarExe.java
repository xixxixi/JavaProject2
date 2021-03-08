package abstractClasses;

import java.util.Calendar;

public class CalendarExe {
	public static void main(String[] args) {
		showCal(2021, 3); // 5월 달력을 보여주는 메소드
		// 달력 만들기
//		System.out.println(cal.get(Calendar.YEAR));
//		System.out.println(cal.get(Calendar.MONTH));
//		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
//		System.out.println(cal.getActualMaximum(Calendar.DATE));
//	
//		System.out.println("--------------------------");
//		System.out.println(cal.get(Calendar.YEAR));
//		System.out.println(cal.get(Calendar.DAY_OF_WEEK));

//		System.out.printf("%3d", 9);
//		System.out.printf("%3d", 10);
//		System.out.printf("%5s", "Sun"); // s = string
//		System.out.printf("%5s", "Mond");

//		System.out.println("============================");

//		Calendar cal = Calendar.getInstance();
//		cal.set(2021, 0, 1);
//		int lastDate = cal.getActualMaximum(Calendar.DATE);
//		int firstDay = cal.get(Calendar.DAY_OF_WEEK);
//
//		for (int i = 1; i < firstDay; i++) {
//			System.out.printf("%3s", " ");
//		}
//		for (int i = 1; i <= lastDate; i++) {
//			System.out.printf("%3d", i);
//			if ((i + firstDay - 1) % 7 == 0) {
//				System.out.println();
//
//			}
//		}
		// 해당년월의 달력을 생성해서 보여주는 메소드
	}

	public static void showCal(int year, int month) {
		Calendar cal = Calendar.getInstance();
		
		if (month<1 || 12>month) {
		}
		int lastDate = cal.getActualMaximum(Calendar.DATE);
		int firstDay = cal.get(Calendar.DAY_OF_WEEK);

		for (int i = 1; i < firstDay; i++) {
			System.out.printf("%3s", " ");
		}
		for (int i = 1; i <= lastDate; i++) {
			System.out.printf("%3d", i);
			if ((i + firstDay - 1) % 7 == 0) {
				System.out.println();

			}

		}
	}
}
