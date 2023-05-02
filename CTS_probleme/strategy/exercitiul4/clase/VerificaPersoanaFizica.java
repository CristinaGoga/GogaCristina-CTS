package strategy.exercitiul4.clase;

public class VerificaPersoanaFizica implements ModVerificare {

	@Override
	public void verificareActe(String nume) {
	System.out.println("S-au verificat buletinul si adeverinta de munca ale clientului: " + nume );
		
	}
	

}
