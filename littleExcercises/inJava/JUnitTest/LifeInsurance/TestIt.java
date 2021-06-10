package inJava.JUnitTest.LifeInsurance;


import org.junit.Test;
import org.junit.Before;

public class TestIt 
{
	
	@Before
	public void setup()
	{
		Lebensversicherung l = new Lebensversicherung();
		float Versicherungsbetrag = (float) 3000.0;
		l.setVersicherungssumme(Versicherungsbetrag);
		//l.setDynamik(false);
		float Summe = l.getVersicherungssumme();
	}
	

	@Test
	public void test()
	{
	
		
		
	}

}
