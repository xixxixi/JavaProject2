package nestedClasses;

class CallListener implements Button.OnClickListener {

	@Override
	public void onClick() {
		System.out.println("��ȭ�� �̴ϴ�");
	}

}
class MessageListener implements Button.OnClickListener{

	@Override
	public void onClick() {
		System.out.println("�޼����� �����ϴ�.");
	}
	
}

public class ButtonExample {
	public static void main(String[] args) {
		Button btn = new Button();

		btn.setOnClickListener(new CallListener());
		btn.touch();	// Button.onClick()

		btn.setOnClickListener(new MessageListener());
		btn.touch();	// Button.onClick()
		
		btn.setOnClickListener(() -> System.out.println("������ �����ϴ�."));	// ���� ǥ����
		btn.touch();
		
		btn.setOnClickListener(new Button.OnClickListener() {	// �͸� ���� ��ü
			
			@Override
			public void onClick() {
				System.out.println("������ �����ϴ�.");
			}
		});
	}

}
