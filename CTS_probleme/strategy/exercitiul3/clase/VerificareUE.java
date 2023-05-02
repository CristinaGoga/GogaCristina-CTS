package strategy.exercitiul3.clase;

public class VerificareUE  implements ModVerificare{

	@Override
	public void verificareActe(String nume) {
		System.out.println("Am verficiat si scanat buletinul clientului: "+ nume);
		
	}
	

}
