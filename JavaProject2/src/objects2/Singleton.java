package objects2;

public class Singleton {
	private static Singleton singleton = new Singleton();
	private Singleton() {}
	public static Singleton getInstance() {
		return singleton;	//getInstance 메소드로 singleton을 리턴 - 하나의 인스턴스만을 호출하게 됨
	}

}
