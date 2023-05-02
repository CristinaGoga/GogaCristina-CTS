package strategy.exercitiul3.clase;

public class VerificareNonUE implements ModVerificare
{

	@Override
	public void verificareActe(String nume) {
		System.out.println("Am verificat si scanat pasaportul clientului : " +nume);
		
	}

}
