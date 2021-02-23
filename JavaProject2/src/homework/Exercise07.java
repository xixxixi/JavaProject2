package homework;

public class Exercise07 {

	public static void main(String[] args) {
		int x = 10;
		int y = 5;
		boolean z = (x > 7) && (y <= 5);

		System.out.println((x > 7) && (y <= 5));
		System.out.println((x % 3 == 2) || (y % 2 != 1));

		z = (x++ % 2 == 0) || (y++ % 3 == 0); //둘 중 하나가 처리되면 나머지는 처리하지 않음
		if (z) {
			System.out.println("true: " + x + ", y:" + y);
		} else {
			System.out.println("flase: " + x + ", y:" + y);
		}
	}

}
