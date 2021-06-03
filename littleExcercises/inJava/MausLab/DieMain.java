package inJava.MausLab;

public class DieMain {

	public static void main(String[] args) {
		MausLoesung m = new MausLoesung();
		System.out.println("The Lab:");
		System.out.println(m);
		System.out.println("");
		System.out.println("");
		System.out.println("Lösung");
		m.solve(1, 1); //1,1 ist die Startposition
		System.out.println(m);  //Sterne sind der gekennzeichnete Weg der Maus zum Käse
       
	}

}
