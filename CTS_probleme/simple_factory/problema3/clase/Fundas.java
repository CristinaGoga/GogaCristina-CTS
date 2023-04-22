package simple_factory.problema3.clase;

public class Fundas  implements Jucator{
	private String nume;
	private int numarTricou;
	
	public Fundas(String nume, int numarTricou) {
		super();
		this.nume = nume;
		this.numarTricou = numarTricou;
	}
	@Override
	public void descriere() {
		System.out.println("Jucatorul " + nume + " cu numarul " +numarTricou +" este fundas!");
	}

}
