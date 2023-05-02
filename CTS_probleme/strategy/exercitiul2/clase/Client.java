package strategy.exercitiul2.clase;

public class Client {
	private String numeClient;
	private ModPlata modPlata;

	
	public Client(String numeClient) {
		super();
		this.numeClient = numeClient;
	}


	public void setModPlata(ModPlata modPlata) {
		this.modPlata = modPlata;
	}
	
	
	public void plateste(Double sumaPlata)
	{
		modPlata.plata(this.numeClient, sumaPlata);
	}

}
