package inJava.JUnitTest.LifeInsurance;

public class Lebensversicherung {

	private boolean dynamik = false;
	private float versicherungssumme = 0.0f;
	private String ibanVerrechnungskonto;
	
	public boolean isDynamik() {
		return dynamik;
	}
	
	public void setDynamik(boolean dynamik) {
		this.dynamik = dynamik;
	}
	
	public float getVersicherungssumme() {
		return versicherungssumme;
	}
	
	public void setVersicherungssumme(float versicherungssumme) {
		this.versicherungssumme = versicherungssumme;
	}
	
	public String getIBANVerrechnungskonto() {
		return ibanVerrechnungskonto;
	}
	
	public void setIBANVerrechnungskonto(String ibanKonto) {
		IBANValidator.validateIban(ibanKonto);
		this.ibanVerrechnungskonto = ibanKonto;
	}
	
	public int berechneProvision() {
		float provision = 0.0f;
		if(versicherungssumme < 10000f) {
			throw new UngueltigeVersicherungssummeException("Versicherungen unter 10.000 Euro Versicherungssumme sind nicht zulässig.");
		}

		if(versicherungssumme <= 50000) {
			provision = 200 + versicherungssumme * 0.01f; 
		} else if (versicherungssumme <= 100000) {
			provision = 450 + versicherungssumme * 0.005f;
		} else {
			provision = 650 + versicherungssumme * 0.003f;
		}
		if(dynamik) {
			provision += 50f;
		}	
		return (int)provision;
	}
	
}
