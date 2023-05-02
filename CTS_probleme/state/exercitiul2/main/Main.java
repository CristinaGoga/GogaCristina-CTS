package state.exercitiul2.main;

import state.exercitiul2.clase.Pacient;
import state.exercitiul2.clase.StareExternat;

public class Main {
	public static void main(String[] args) {
		Pacient pacient = new Pacient("Andrei");
		StareExternat stareExternat= new StareExternat();
		stareExternat.doAction(pacient);
	}

}
