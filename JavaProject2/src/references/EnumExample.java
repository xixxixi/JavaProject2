package references;

import java.util.Calendar;
enum kind {
	MALE, FEMALE;
}
enum Choice {
	YES, NO;
}
public class EnumExample {

	public static void main(String[] args) {
		int maleOrFemale = 1; // 1 남자, 2 여자
		int yesOrNo = 1; // 1 yes, 2 no
		Week today = null;
		today = Week.SUNDAY;
		Calendar cal = Calendar.getInstance();
		System.out.println("년도 " + cal.get(Calendar.YEAR));
		System.out.println("월 " + cal.get(Calendar.MONTH));
		System.out.println("일 " + cal.get(Calendar.DAY_OF_MONTH));
		System.out.println("요일 " + cal.get(Calendar.DAY_OF_WEEK));
		
		int week = cal.get(Calendar.DAY_OF_WEEK);
		switch(week) {
		case 1:
			today = Week.SUNDAY; break;
		case 2:
			today = Week.MONDAY; break;
		case 3:
			today = Week.TUESDAY; break;
		case 4:
			today = Week.WEDNESDAY; break;
		case 5:
			today = Week.THURSDAY; break;
		case 6:
			today = Week.FRIDAY; break;
		case 7:
			today = Week.SATURDAY; break;
		}
		if (today == Week.SUNDAY || today == Week.SATURDAY) {
//		if ( week == 1 || week == 2 ) - 명확하지 않으므로 정해진 코드값 이용을 권장
			System.out.println("주말에는 여행을 갑니다.");
		} else {
			System.out.println("주중에는 공부를 합니다.");
		}
		kind manOfWoman = kind.FEMALE;
		if (manOfWoman == kind.MALE) {
			System.out.println("남성입니다.");
		} else if (manOfWoman == kind.FEMALE) {
			System.out.println("여성입니다.");
		}

//		today = "Hello";
// 		월의 정보는 0부터 시작
//		요일은 일요일부터 1
	}

}
