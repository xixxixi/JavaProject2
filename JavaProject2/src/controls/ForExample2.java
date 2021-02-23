package controls;

public class ForExample2 {

	public static void main(String[] args) {
		for (int i =2; i <=9; i++) {
			showResult(i);
		}
	
// int num = 8;
//		for (int i = 1; i <= 9; i++) {

//		System.out.println(num + " * " + i + " = " + (num * i));
	}

//		System.out.println(num + " * " + 2 + " = " + (num * 2));
//		System.out.println(num + " * " + 3 + " = " + (num * 3));
//		System.out.println(num + " * " + 4 + " = " + (num * 4));
//		System.out.println(num + " * " + 5 + " = " + (num * 5));
//		System.out.println(num + " * " + 6 + " = " + (num * 6));
//		System.out.println(num + " * " + 7 + " = " + (num * 7));
//		System.out.println(num + " * " + 8 + " = " + (num * 8));
//		System.out.println(num + " * " + 9 + " = " + (num * 9));

	public static void showResult(int num) {
		for (int i = 1; i <= 9; i++) {
			System.out.println(num + " * " + i + " = " + (num * i));
		}

	}
}