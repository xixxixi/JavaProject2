package homework;

public class Morining0224 {

	public static void main(String[] args) {
		String grade = " ";
		int s = 1;
		int s2 = 1;
		s = (int) (Math.random() * 100+1);
		s2 = (int) (Math.random() * 100+1);

		if ((s + s2) / 2 >= 90) {
			grade = "��";
		} else if ((s + s2) / 2 >= 80) {
			grade = "��";
		} else if ((s + s2) / 2 >= 70) {
			grade = "��";
		} else {
			grade = "��";
		}
		String result = getAverage(s, s2);
		System.out.println("����:" + s + ", ����:" + s2 + "�� ����� " + grade);

	} // main end

	public static String getAverage(int n1, int n2) {
		String grade = " ";
		double avg = (n1 + n2) / 2.0;

		if (avg >= 90) {
			grade = "��";
		} else if (avg >= 80) {
			grade = "��";
		} else if (avg >= 70) {
			grade = "��";
		} else {
			grade = "��";
		}
		return grade;
		
	}
	

}
