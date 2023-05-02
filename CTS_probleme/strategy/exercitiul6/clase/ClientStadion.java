package strategy.exercitiul6.clase;

public class ClientStadion {
	
	private String nume;
	private TipSpectator tipSpectator;
	
	public ClientStadion(String nume, TipSpectator tipSpectator) {
		super();
		this.nume = nume;
		this.tipSpectator = tipSpectator;
	}
	
	public void modDeVerificare() {
		tipSpectator.verificare(nume);
	}

}
