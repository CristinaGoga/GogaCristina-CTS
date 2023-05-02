package strategy.exercitiul4.clase;

public class Client {
	
	private String nume;
	private ModVerificare modVerificare;
	
	public Client(String nume, ModVerificare modVerificare) {
		super();
		this.nume = nume;
		this.modVerificare = modVerificare;
	}
	
	public void verificare() {
		modVerificare.verificareActe(nume);
	}
	

}
