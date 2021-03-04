package objects2;

public class SingletonExample {
	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();	// 생성자가 프라이빗이기 때문에 메소드를 통해 가져옴
		Singleton s2 = Singleton.getInstance();
		
		Book b1 = new Book("자바", "저자", "출판사", 1000);
		Book b2 = new Book("자바", "저자", "출판사", 1000);
		
		System.out.println(s1==s2);	// true = 참조하고 있는 인스턴스가 1개
		System.out.println(b1==b2);
	}

}
