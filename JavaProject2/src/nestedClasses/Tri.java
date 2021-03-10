package nestedClasses;

import java.util.Arrays;

public class Tri {
	public static void main(String[] args) {
		int[][] ary = new int[5][5];
		int num = 1;
		for (int i = 0; i < ary.length; i++) {
			for (int j = 0; j < ary[i].length; j++) {
				ary[i][j] = num++;
			}
		}

		for (int i = 0; i < ary.length; i++) {
			for (int j = 0; j < ary[i].length; j++) {
				System.out.printf("%3d", ary[j][i]);
			}
			System.out.println();
		}
		System.out.println("===================");

		for (int j = 0; j < ary.length; j++) {
			for (int i = 0; i < ary[j].length; i++) {
				System.out.printf("%3d", ary[i][j]);
			}
			System.out.println();
		}
		System.out.println("===================");
		int minus = 25;
		for (int i = 0; i < ary.length; i++) {
			for (int j = 0; j < ary[i].length; j++) {
				ary[i][j] = minus;
				minus = minus - 1;
				System.out.printf("%3d", ary[i][j]);
			}
			System.out.println();
		}
		System.out.println("===================");
		for (int i = 0; i < 5; i++) {
			for (int j = 4; j >=0; j--) {
				
				System.out.printf("%3d", ary[i][j]);
			}
			System.out.println();

		}
	}
}
