package references;

public class Morning0226 {

	public static void main(String[] args) {
		String[] names = { "임성원", "정준영", "도왕락" };
		int[] scores = { 88, 89, 90 };

		for (int i = 0; i < 3; i++) {
			System.out.println(names[i] + " 점수=> " + scores[i]);
		}

		// 향상된 for문.
		for (String name : names) {
			System.out.println(name);
		}
		int sum = 0;
		for (int score : scores) {
			sum = sum + score;
		}
		System.out.println("합계점수: " + sum);
	}

	public static void morning0226(String[] args) {
		int sum = 0;
		double avg = 0.0;
		int[] engScores = new int[3];
		int[] mathScores = new int[3];

//		int [][] scores = new int[2][3]; //2는 열의 의미, 3은 행의 의미
//		scores[0] = new int [] {90, 88, 87};
//		scores[1] = new int [] {88, 90, 92};

		int[][] scores = { { 90, 88, 87 }, { 88, 90, 92 } };
		for (int i = 0; i < scores.length; i++) {
			sum = 0;
			for (int j = 0; j < scores[i].length; j++) {
				sum += scores[i][j];
			}

			if (i == 0) {
				avg = (double) sum / scores[i].length;
				System.out.println("영어의 평균: " + (sum * 10 / scores[i].length) / 10.0);
			} else if (i == 1) {
				avg = (double) sum / scores[i].length;
				System.out.println("수학의 평균: " + avg);
			}
		}

		System.out.println(scores.length);
		System.out.println(scores[0].length);
		System.out.println(scores[1].length);

		sum = 0;
		avg = 0.0;
		for (int i = 0; i < engScores.length; i++) {
			engScores[i] = (int) (Math.random() * 100) + 1;
			sum = sum + engScores[i];
			avg = sum / (double) engScores.length;
		}
		System.out.println("영어 평균: " + Math.round(avg * 10) / 10.0);

		sum = 0;
		avg = 0.0;
		for (int i = 0; i < mathScores.length; i++) {
			mathScores[i] = (int) (Math.random() * 100) + 1;
			sum = sum + mathScores[i];
			avg = sum / (double) mathScores.length;
		}
		System.out.println("수학 평균: " + Math.round(avg * 10) / 10.0);

	}

	public static void arrayCopy() {
		int[] oldAry = { 45, 55, 67 };
		int[] newAry = new int[3];
		for (int i = 0; i < oldAry.length; i++) {
			newAry[i] = oldAry[i];
		}
		System.out.println(newAry[0]);
		System.out.println(newAry[1]);
		System.out.println(newAry[2]);

		int[] newAry2 = new int[5];
		System.arraycopy(newAry, 1, newAry2, 0, 2); // 원본 배열의 위치부터 복사 배열의 위치까지 지정
		System.out.println(newAry2[0]);
		System.out.println(newAry2[1]);
		System.out.println(newAry2[2]);
		System.out.println(newAry2[3]);
		System.out.println(newAry2[4]);
	}

}
