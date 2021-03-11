package generics;

public class BoundedTypeParameterExample {
	public static void main(String[] args) {
		//String str = Util.compare("a", "b"); (X) String은 Number 타입이 아님
		
		int result1 = Utils.compare(10, 20);	// 20은 int → Integer (자동 Boxing)
		System.out.println(result1);
		
		int result2 = Utils.compare(4.5, 3);	// 4.5는 double → Double (자동 Boxing)
		System.out.println(result2);
	}

}
