package state.exercitiul1.clase;

public class StareNeplatita implements Stare {

	@Override
	public void doAction(Rezervare rezervare) {
		System.out.println("Rezervarea cu id-ul "+ rezervare.getId()+ " este trecuta in starea EFECTUATA");
		rezervare.setStare(this);
		
	}
	

}
