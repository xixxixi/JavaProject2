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
		int maleOrFemale = 1; // 1 ����, 2 ����
		int yesOrNo = 1; // 1 yes, 2 no
		Week today = null;
		today = Week.SUNDAY;
		Calendar cal = Calendar.getInstance();
		System.out.println("�⵵ " + cal.get(Calendar.YEAR));
		System.out.println("�� " + cal.get(Calendar.MONTH));
		System.out.println("�� " + cal.get(Calendar.DAY_OF_MONTH));
		System.out.println("���� " + cal.get(Calendar.DAY_OF_WEEK));
		
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
//		if ( week == 1 || week == 2 ) - ��Ȯ���� �����Ƿ� ������ �ڵ尪 �̿��� ����
			System.out.println("�ָ����� ������ ���ϴ�.");
		} else {
			System.out.println("���߿��� ���θ� �մϴ�.");
		}
		kind manOfWoman = kind.FEMALE;
		if (manOfWoman == kind.MALE) {
			System.out.println("�����Դϴ�.");
		} else if (manOfWoman == kind.FEMALE) {
			System.out.println("�����Դϴ�.");
		}

//		today = "Hello";
// 		���� ������ 0���� ����
//		������ �Ͽ��Ϻ��� 1
	}

}
