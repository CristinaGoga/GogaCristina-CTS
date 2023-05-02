package flyweight.exercitiul6.clase;

public class Microbist implements IMicrobist {
	private String nume;
	private float inaltime;
	private float latime;
	
	public Microbist(String nume, float inaltime, float latime) {
		super();
		this.nume = nume;
		this.inaltime = inaltime;
		this.latime = latime;
	}
	
	

	@Override
	public String toString() {
		return "Microbist [nume=" + nume + ", inaltime=" + inaltime + ", latime=" + latime + "]";
	}
	


	@Override
	public void descriere(PozitieTribuna pozitieTribuna) {
		System.out.println(this.toString() + " " + pozitieTribuna.toString());
		
	}
	


}
