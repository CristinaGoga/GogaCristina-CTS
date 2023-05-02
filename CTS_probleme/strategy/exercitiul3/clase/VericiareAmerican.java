package strategy.exercitiul3.clase;

public class VericiareAmerican implements ModVerificare {

	@Override
	public void verificareActe(String nume) {
		System.out.println("Am vericat viza Clientului:" +nume);
		
	}

}
