package singleton.problema1.clase.program;

public class AgentieLazyI {
	private String nume;
	private float capital;
	private int numarAngajati;
	
	private static AgentieLazyI instanta = null;

	private AgentieLazyI(String nume, float capital, int numarAngajati) {
		this.nume = nume;
		this.capital = capital;
		this.numarAngajati = numarAngajati;
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
	
	public static AgentieLazyI getInstance(String nume, float capital, int numarAngajati) {
		if(instanta == null){
			instanta = new AgentieLazyI(nume, capital, numarAngajati);
		}
		return instanta;
	}
	
	
	
}
