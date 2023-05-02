package flyweight.exercitiul4.clase;

public class Rezervare {
	private int numarMasa;
	private int numarPersoane;
	private int oraRezervare;
	
	public Rezervare(int numarMasa, int numarPersoane, int oraRezervare) {
		super();
		this.numarMasa = numarMasa;
		this.numarPersoane = numarPersoane;
		this.oraRezervare = oraRezervare;
	}

	@Override
	public String toString() {
		return "Rezervare [numarMasa=" + numarMasa + ", numarPersoane=" + numarPersoane + ", oraRezervare="
				+ oraRezervare + "]";
	}

	
}
