package factory_method.problema3.clase;

public class PersoanaJuridica  implements TipClient{

	private String nume;
	private int varsta;
	
	public PersoanaJuridica(String nume, int varsta) {
		super();
		this.nume = nume;
		this.varsta = varsta;
	}

	@Override
	public void descriere() {
		System.out.println("Clientul " + nume + " cu varsta de " + varsta + " este un client de tipul PERSOANA JURIDICA");
		
	}
}
