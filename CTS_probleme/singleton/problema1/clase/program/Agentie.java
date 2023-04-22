package singleton.problema1.clase.program;

public class Agentie {
	private String nume;
	private float capital;
	private int numarAngajati;
	
	//DECLARAM INSTANTA CARE ESTE STATICAAAAA
	private static final Agentie instanta= new Agentie();

	//GENERAM CONSTRUCTORUL CARE ESTE PRIVAT!!
	private Agentie() {
		super();
		this.nume = "Nume";
		this.capital = 2000;
		this.numarAngajati = 10;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public float getCapital() {
		return capital;
	}

	public void setCapital(float capital) {
		this.capital = capital;
	}

	public int getNumarAngajati() {
		return numarAngajati;
	}

	public void setNumarAngajati(int numarAngajati) {
		this.numarAngajati = numarAngajati;
	}
	
	//METODA DE INITIALIZARE A INSTANTEI CARE ESTE STATICA
	 public static Agentie getInstance(String nume, float calital, int numarAngajati) {
		 return instanta;
	 }
	
}
