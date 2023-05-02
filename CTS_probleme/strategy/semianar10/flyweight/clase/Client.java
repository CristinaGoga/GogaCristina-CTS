package strategy.semianar10.flyweight.clase;

public class Client implements IClient{
private String nume;
private String numarTelefon;
private String adresa;


	public Client(String nume, String numarTelefon, String adresa) {
	super();
	this.nume = nume;
	this.numarTelefon = numarTelefon;
	this.adresa = adresa;
}
	


	@Override
	public String toString() {
		return "Client [nume=" + nume + ", numarTelefon=" + numarTelefon + ", adresa=" + adresa + "]";
	}



	@Override
	public void descriereRezervare(Rezervare rezervare) {
		System.out.println(this.toString() + " " + rezervare.toString());
		
	}
	
	
	

}
