package generics;

public class BoundedTypeParameterExample {
	public static void main(String[] args) {
		//String str = Util.compare("a", "b"); (X) String�� Number Ÿ���� �ƴ�
		
		int result1 = Utils.compare(10, 20);	// 20�� int �� Integer (�ڵ� Boxing)
		System.out.println(result1);
		
		int result2 = Utils.compare(4.5, 3);	// 4.5�� double �� Double (�ڵ� Boxing)
		System.out.println(result2);
	}

}
