package homework;

public class Exercise225 {

	public static void main(String[] args) {
		int a = 35;
		int b = 60;
		int sum = 0;
		for (int i = a; i <= b; i++) {
			sum = sum + i;
		}
		System.out.println("두 수 사이의 합: " + sum);

		int sNum = 67;
		int eNum = 44;
		sum = getSumValue(sNum, eNum);
		System.out.println("44에서 67사이의 합: " + sum);
	} // main end

	public static int getSumValue(int v1, int v2) {
//		int sNum = (v1 > v2) ? v2 : v1;
//		int eNum = (v1 > v2) ? v1 : v2;
//		int sum = 0;
//		for (int i = v1; i <= v2; i++) {
//			sum += i;

		int sum = 0;
		if (v1 > v2) {
			for (int i = v1; i <= v2; i--) {
				sum = sum + i;
			}
		} else {
			for (int i = v1; i <= v2; i++)
				sum = sum + i;
		}
		return sum;
	}

}
