package nestedClasses;

class CallListener implements Button.OnClickListener {

	@Override
	public void onClick() {
		System.out.println("전화를 겁니다");
	}

}
class MessageListener implements Button.OnClickListener{

	@Override
	public void onClick() {
		System.out.println("메세지를 보냅니다.");
	}
	
}

public class ButtonExample {
	public static void main(String[] args) {
		Button btn = new Button();

		btn.setOnClickListener(new CallListener());
		btn.touch();	// Button.onClick()

		btn.setOnClickListener(new MessageListener());
		btn.touch();	// Button.onClick()
		
		btn.setOnClickListener(() -> System.out.println("영상을 보냅니다."));	// 람다 표현식
		btn.touch();
		
		btn.setOnClickListener(new Button.OnClickListener() {	// 익명 구현 개체
			
			@Override
			public void onClick() {
				System.out.println("영상을 보냅니다.");
			}
		});
	}

}
