package exceptions;

public class BalanceInsufficientException extends Exception{	//RuntimeException 실행시 catch 문으로 잡거나 throws로 선언하지 않아도 된다.
	public BalanceInsufficientException() {}
	public BalanceInsufficientException(String message) {
		super(message);
	}
	

}
