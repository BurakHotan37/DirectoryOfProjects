package inJava.JUnitTest.LifeInsurance;

/**
 * Enum with customized error messages
 */
public enum IBANValidationErrorType {

	INCORRECT_CHECKSUM{
		public String toString(){
			return "Checksum calculation failed for IBAN";
		}
	},

	INCORRECT_LENGTH{
		public String toString(){
			return "The length of the IBAN is not correct";
		}
	},

	INCORRECT_STRUCTURE{
		public String toString(){
			return "The given structure does not math the IBAN";
		}
	}

}
