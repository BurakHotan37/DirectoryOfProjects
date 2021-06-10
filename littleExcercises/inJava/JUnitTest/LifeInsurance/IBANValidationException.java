package inJava.JUnitTest.LifeInsurance;

/**
 * Customized Exception to hold an error message
 */
public class IBANValidationException extends RuntimeException {

	private static final long serialVersionUID = -2009552301472910267L;

	// Custom Error Message
	private IBANValidationErrorType _validationError;

	public IBANValidationException() {
		super();
	}

	public IBANValidationException(String message) {
		super(message);
	}

	public IBANValidationException(IBANValidationErrorType errorType) {
		super(errorType.toString());
		_validationError = errorType;
	}

	public IBANValidationException(Throwable message) {
		super(message);
	}

	public IBANValidationException(String message, Throwable cause) {
		super(message, cause);
	}

	public IBANValidationErrorType getIBANValidationError(){
		return _validationError;
	}

}

