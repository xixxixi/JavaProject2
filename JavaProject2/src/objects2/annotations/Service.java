package objects2.annotations;

public class Service {
	@PrintAnnotation()
	String name;
	
	@PrintAnnotation()
	public void method1() {
		System.out.println("���� ����1");
	}
	
	@PrintAnnotation("*")
	public void method2() {
		System.out.println("���� ����2");
	}
	@PrintAnnotation(value = "#", number=30)
	public void method3() {
		System.out.println("���� ����3");
	}

}
