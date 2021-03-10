package nestedClasses;

public class Button {
	OnClickListener listener;	// �������̽� Ÿ�� �ʵ�
	
	void setOnClickListener(OnClickListener listener){	// �Ű� ������ ������
		this.listener = listener;
	}
	
	void touch() {		// ���� ��ü�� onClick() �޼ҵ� ȣ��
		listener.onClick();
	}
	
	interface OnClickListener{		// ��ø �������̽�
		void onClick();
	}

	// @Override
	public String toString(String str) {
		return "Button [listener=" + listener + "]";
	}

}
