package strategy.exercitul1.clase;

public class Client {
	
	private String nume;
	private ModPlata modPlata;
	public Client(String nume) {
		super();
		this.nume = nume;
	}
	
	public void setModPlata(ModPlata modPlata) {
		this.modPlata = modPlata;
	}
	
	public void plata(double sumaPlata) {
		modPlata.plateste(this.nume, sumaPlata);
	}
	

}
