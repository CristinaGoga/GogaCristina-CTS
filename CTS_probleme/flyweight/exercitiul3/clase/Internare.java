package flyweight.exercitiul3.clase;

public class Internare {
	
	private int numarSalon;
	private int numarPat;
	private int numarZile;
	
	public Internare(int numarSalon, int numarPat, int numarZile) {
		super();
		this.numarSalon = numarSalon;
		this.numarPat = numarPat;
		this.numarZile = numarZile;
	}
	
	@Override
	public String toString() {
		return "Internare [numarSalon=" + numarSalon + ", numarPat=" + numarPat + ", numarZile=" + numarZile + "]";
	}
	
	

}
