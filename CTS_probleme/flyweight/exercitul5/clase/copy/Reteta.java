package flyweight.exercitul5.clase.copy;

public class Reteta {
	
	private int numarReteta;
	private float sumaDePlata;
	private int numarMedicamente;
	
	public Reteta(int numarReteta, float sumaDePlata, int numarMedicamente) {
		super();
		this.numarReteta = numarReteta;
		this.sumaDePlata = sumaDePlata;
		this.numarMedicamente = numarMedicamente;
	}

	@Override
	public String toString() {
		return "Reteta [numarReteta=" + numarReteta + ", sumaDePlata=" + sumaDePlata + ", numarMedicamente="
				+ numarMedicamente + "]";
	}

}
