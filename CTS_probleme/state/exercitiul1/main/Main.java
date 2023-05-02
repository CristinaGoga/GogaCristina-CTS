package state.exercitiul1.main;

import state.exercitiul1.clase.Rezervare;
import state.exercitiul1.clase.StareNeplatita;

public class Main {
	public static void main(String[] args) {
		Rezervare rezervare = new Rezervare(123);
		StareNeplatita stareNeplatita= new StareNeplatita();
		stareNeplatita.doAction(rezervare);
	}

}
