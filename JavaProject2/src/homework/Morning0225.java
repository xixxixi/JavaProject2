package homework;

public class Morning0225 {

	public static void main(String[] args) {
		int x = 11;
		int y = 30;
		int sum = 0;
		for (int i = x; i <= y; i++) {
			sum = sum + i;
		}
		System.out.println("11부터 30의 합 : " + sum); // 11, 30 변수로 지정
		
		sum = 0;
		sum = getSum(x, y);
		System.out.println("11부터 30의 합 : " + sum);

	} // main end

	public static int getSum(int fromValue, int toValue) {
		int sum = 0;
		for (int i = fromValue; i <= toValue; i++) {
			sum += i; // sum = sum + i;
		}
		return sum;
	}	//11과 30을 매개 변수로 지정

}
