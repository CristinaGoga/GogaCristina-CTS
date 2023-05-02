package flyweight.exercitiul3.main;

import flyweight.exercitiul2.clase.FabricaDeCamere;
import flyweight.exercitiul3.clase.FabricaDePacienti;
import flyweight.exercitiul3.clase.Internare;
import flyweight.exercitiul3.clase.Pacient;

public class Program {
	public static void main(String[] args) {
		FabricaDePacienti fabricaPacienti = new FabricaDePacienti();


		Internare internare1 = new Internare(1, 4, 5);
		Internare internare2 = new Internare(2, 2, 2);
		Internare internare3 = new Internare(3, 1, 7);


		Pacient pacient1 = (Pacient) fabricaPacienti.getPacient("Goga Cristina");
		Pacient pacient2 = (Pacient) fabricaPacienti.getPacient("Virgolici Cosmin");
		Pacient pacient3 = (Pacient) fabricaPacienti.getPacient("Dorel Ionescu");
		
		fabricaPacienti.getPacient("GogaCristina").descriereInternare(internare1);
		fabricaPacienti.getPacient("Virgolici Cosmin").descriereInternare(internare2);
		fabricaPacienti.getPacient("Dorel Ionescu").descriereInternare(internare3);
		
		
		
		System.out.println(fabricaPacienti.toString());
	}
}