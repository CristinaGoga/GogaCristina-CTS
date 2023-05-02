package strategy.exercitiul4.main;

import strategy.exercitiul4.clase.Client;
import strategy.exercitiul4.clase.ModVerificare;
import strategy.exercitiul4.clase.VerificaPersoanaFizica;
import strategy.exercitiul4.clase.VerificaPersoanaJuridica;

public class Main {
	public static void main(String[] args) {
		
		
		Client clientPersoanaFizica= new Client("Popescu Dorel", new VerificaPersoanaFizica());
		Client clientPersoanaJuridica= new Client("Andrei Popa", new VerificaPersoanaJuridica());
		
		
		clientPersoanaFizica.verificare();
		clientPersoanaJuridica.verificare();
	}

}
