package homework;

public class Morining0224 {

	public static void main(String[] args) {
		String grade = " ";
		int s = 1;
		int s2 = 1;
		s = (int) (Math.random() * 100+1);
		s2 = (int) (Math.random() * 100+1);

		if ((s + s2) / 2 >= 90) {
			grade = "수";
		} else if ((s + s2) / 2 >= 80) {
			grade = "우";
		} else if ((s + s2) / 2 >= 70) {
			grade = "미";
		} else {
			grade = "가";
		}
		String result = getAverage(s, s2);
		System.out.println("영어:" + s + ", 수학:" + s2 + "의 평균은 " + grade);

	} // main end

	public static String getAverage(int n1, int n2) {
		String grade = " ";
		double avg = (n1 + n2) / 2.0;

		if (avg >= 90) {
			grade = "수";
		} else if (avg >= 80) {
			grade = "우";
		} else if (avg >= 70) {
			grade = "미";
		} else {
			grade = "가";
		}
		return grade;
		
	}
	

}
