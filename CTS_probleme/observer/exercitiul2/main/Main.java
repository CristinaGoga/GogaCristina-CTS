package observer.exercitiul2.main;

import observer.exercitiul2.clase.Pacient;
import observer.exercitiul2.clase.Spital;

public class Main {
	public static void main(String[] args) {
		 Pacient pacient = new Pacient("Goga Cristina");
		 
		 Spital spital =new Spital("Spitalul militari");
		 
		 spital.adaugaMesaj(pacient);
		 spital.notificaOferta();
		
	}

}
