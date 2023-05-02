package flyweight.exercitiul3.clase;

public class Pacient implements Ipacient{
	
	private String numePacient;
	private int numarTelefon;
	private String adresa;

	public Pacient(String numePacient, int numarTelefon, String adresa) {
		super();
		this.numePacient = numePacient;
		this.numarTelefon = numarTelefon;
		this.adresa = adresa;
	}
	
	

	@Override
	public String toString() {
		return "Pacient [numePacient=" + numePacient + ", numarTelefon=" + numarTelefon + ", adresa=" + adresa + "]";
	}

	@Override
	public void descriereInternare(Internare internare) {
		System.out.println(this.toString() + " " + internare.toString());
		
	}

}
