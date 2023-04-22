package simple_factory.problema3.clase;

public class Portar implements Jucator {
	private String nume;
	private int numarTricou;
	
	public Portar(String nume, int numarTricou) {
		super();
		this.nume = nume;
		this.numarTricou = numarTricou;
	}
	@Override
	public void descriere() {
		System.out.println("Jucatorul " + nume + " cu numarul " +numarTricou +" este portar!");
	}
}
