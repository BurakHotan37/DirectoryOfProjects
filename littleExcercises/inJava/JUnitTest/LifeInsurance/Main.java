package inJava.JUnitTest.LifeInsurance;

public class Main {

	public static void main(String[] args) {
		Lebensversicherung l = new Lebensversicherung();			//Object l gets created
		l.setDynamik(false);										//Methods from Objectpattern are possible?
	
		try {
			l.setVersicherungssumme(5000);
			System.out.println(l.berechneProvision());
		} catch (Exception x) {
			System.out.println(x);
		}
		l.setVersicherungssumme(10000);
		System.out.println(l.berechneProvision());
		l.setVersicherungssumme(20000);
		System.out.println(l.berechneProvision());
		l.setVersicherungssumme(30000);
		System.out.println(l.berechneProvision());
		l.setVersicherungssumme(40000);
		System.out.println(l.berechneProvision());
		l.setVersicherungssumme(50000);
		System.out.println(l.berechneProvision());
		l.setVersicherungssumme(60000);
		System.out.println(l.berechneProvision());
		l.setVersicherungssumme(70000);
		System.out.println(l.berechneProvision());
		l.setVersicherungssumme(80000);
		System.out.println(l.berechneProvision());
		l.setVersicherungssumme(90000);
		System.out.println(l.berechneProvision());
		l.setVersicherungssumme(100000);
		System.out.println(l.berechneProvision());
		l.setVersicherungssumme(110000);
		System.out.println(l.berechneProvision());
		l.setIBANVerrechnungskonto("DE52600700700001234567");;
		try {
			l.setIBANVerrechnungskonto("DE52600700700001234568");;
		} catch (Exception x) {
			System.out.println(x);
		}}

}
