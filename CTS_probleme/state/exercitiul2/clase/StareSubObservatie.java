package state.exercitiul2.clase;

public class StareSubObservatie implements StarePacient{

	@Override
	public void doAction(Pacient pacient) {
		System.out.println("Pacientul " + pacient.getNumePacient()+
				"este SUB OBSERVATIE");
		pacient.setStare(this);
	}

}
