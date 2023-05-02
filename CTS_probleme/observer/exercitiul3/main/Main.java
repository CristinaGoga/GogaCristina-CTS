package observer.exercitiul3.main;

import java.util.ArrayList;
import java.util.List;

import observer.exercitiul3.clase.ClientAbonat;
import observer.exercitiul3.clase.Observer;
import observer.exercitiul3.clase.SalaSport;

public class Main {
	public static void main(String[] args) {
		ClientAbonat clientAbonat = new ClientAbonat("Andrei");
		SalaSport salaSport= new SalaSport("Sala Sport");
		
		salaSport.adaugaMesaj(clientAbonat);
		salaSport.notificaMeciHandbal();
	}

}
