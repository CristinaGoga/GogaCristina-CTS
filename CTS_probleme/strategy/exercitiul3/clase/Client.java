package strategy.exercitiul3.clase;

public class Client {
	private String numeClient;
	private ModVerificare modVerificare;

	public Client(String numeClient, ModVerificare modVerificare) {
		super();
		this.numeClient = numeClient;
		this.modVerificare = modVerificare;
	}
	
	

	public void setModVerificare(ModVerificare modVerificare) {
		this.modVerificare = modVerificare;
	}



	public void verifica() {
		modVerificare.verificareActe(numeClient);
	}
	
	
	

}
