package generics;

public class ProductExample {

	public static void main(String[] args) {

		class Tv {}
		class Car {}

		Product<Tv, String> product1 = new Product<Tv, String>();
		product1.setKind(new Tv());
		product1.setMoedl("½º¸¶Æ®Tv");
		Tv tv = product1.getKind();
		String tvModel = product1.getMoedl();

		Product<Car, String> product2 = new Product<Car, String>();
		product2.setKind(new Car());
		product2.setMoedl("µðÁ©");
		Car car = product2.getKind();
		String carModel = product2.getMoedl();
	}

}
