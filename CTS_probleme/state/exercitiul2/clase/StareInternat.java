package state.exercitiul2.clase;

public class StareInternat implements StarePacient{

	@Override
	public void doAction(Pacient pacient) {
		System.out.println("Pacientul:"+ pacient.getNumePacient()+
				" este INTERNAT");
		pacient.setStare(this);
		
	}
	

}
