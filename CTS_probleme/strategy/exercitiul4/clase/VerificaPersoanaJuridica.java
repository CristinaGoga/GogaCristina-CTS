package strategy.exercitiul4.clase;

public class VerificaPersoanaJuridica implements ModVerificare{

	@Override
	public void verificareActe(String nume) {
		System.out.println("S-au verificat actele de infiintare ale firmei precum si dovada inregistrarii la Registrul Comertului ale clientului :" +nume);
		
	}
	

}
