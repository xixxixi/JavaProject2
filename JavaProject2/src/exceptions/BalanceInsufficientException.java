package exceptions;

public class BalanceInsufficientException extends Exception{	//RuntimeException ����� catch ������ ��ų� throws�� �������� �ʾƵ� �ȴ�.
	public BalanceInsufficientException() {}
	public BalanceInsufficientException(String message) {
		super(message);
	}
	

}
