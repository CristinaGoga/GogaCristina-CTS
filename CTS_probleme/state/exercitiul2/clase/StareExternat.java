package state.exercitiul2.clase;

public class StareExternat implements StarePacient{

	@Override
	public void doAction(Pacient pacient) {
		System.out.println("Pacientul " + pacient.getNumePacient()
		+ " este EXTERNAT");
		pacient.setStare(this);
		
	}
	

}
