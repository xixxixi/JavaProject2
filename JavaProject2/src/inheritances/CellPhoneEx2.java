package inheritances;

public class CellPhoneEx2 {
	public static void main(String[] args) {
		CellPhone cp = new CellPhone();
//		cp = (CellPhone) new DmbPhone();	// int = byte;
//		cp = (CellPhone) new SmartPhone();	// 부모 클래스는 자식 클래스의 인스턴스를 받을 수 있음
		cp.color = ""; // 인스턴스를 담을 수는 있지만 호출은 불가능

		if (cp instanceof DmbPhone) {
			DmbPhone dp = (DmbPhone) cp; // 자식은 부모를 담을 수 없음 강제 변환 필요.
			dp.model = "";
			dp.color = "";
			dp.channel = 15;
			dp.powerOn();
		}else {
			System.out.println("Casting 할 수 없습니다.");
		}
		
		// 다형성. = 호출값은 같지만 담겨있는 인스턴스에 따라 실행되는 결과를 달리함
		// 부모 = 자식들이 담길 수 있음
		// 부모.메소드 = 자식.메소드 호출 가능
		cp = new DmbPhone();
		cp.powerOn();
		
		cp = new SmartPhone();
		cp.powerOn();
	}

}
