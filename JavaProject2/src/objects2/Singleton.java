package objects2;

public class Singleton {
	private static Singleton singleton = new Singleton();
	private Singleton() {}
	public static Singleton getInstance() {
		return singleton;	//getInstance �޼ҵ�� singleton�� ���� - �ϳ��� �ν��Ͻ����� ȣ���ϰ� ��
	}

}
