/* ������Ʈ, �����(Activist), �����(Recipient)�� �� ������ ��� �߻� */
package ucm.exception;

@SuppressWarnings("serial")
public class NotExistException extends Exception {
	public NotExistException() {
	}

	public NotExistException(String message) {
		super(message);
	}
}
