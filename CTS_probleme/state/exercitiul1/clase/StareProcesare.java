package state.exercitiul1.clase;

public class StareProcesare implements Stare{

	@Override
	public void doAction(Rezervare rezervare) {
		System.out.println("Rezervarea cu id-ul : "+ rezervare.getId()+
				"a fost trecuta in starea de POCESATA" );
		rezervare.setStare(this);
		
	}
	

}
