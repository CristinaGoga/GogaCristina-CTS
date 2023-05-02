package observer.exercitiul4.main;

import observer.exercitiul3.clase.ClientAbonat;
import observer.exercitiul4.clase.Banca;
import observer.exercitiul4.clase.ClientiAbonati;

public class Main {
	public static void main(String[] args) {
		ClientiAbonati clientAbonat = new ClientiAbonati("Andrei");
		Banca banca=new Banca("BCR");
		banca.adaugaMesaj(clientAbonat);
		banca.notificareAplicatie();
	}

}
