package strategy.exercitul5.clase;

public class Client {
	private String nume;
	private ModPalta modPalta;
	
	
	public Client(String nume, ModPalta modPalta) {
		super();
		this.nume = nume;
		this.modPalta = modPalta;
	}


	public void realizeazaPlata(float suma)
	{
		 modPalta.plata(this.nume, suma);
	}
	
	

}
