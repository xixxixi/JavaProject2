package references;

public class ArrayExample2 {

	public static void main(String[] args) {
		int[] Arys = new int[10];
		int sum = 0;
		double avg = 0;
		// int cat =

		for (int i = 0; i < Arys.length; i++) {
			Arys[i] = (int) (Math.random() * 100) + 1;
			if (i % 2 == 0)
				sum = sum + i;
			System.out.println("짝수의 합: " + sum);
			{
//		for (int i = 0; i <= Arys.length; i++) {
//			if ( i )
			}
		}
	}
}

// if 안에 count