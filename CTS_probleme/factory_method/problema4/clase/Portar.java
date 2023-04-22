package factory_method.problema4.clase;

public class Portar implements Jucator {
	public  String nume;
	public int numarTricou;
	
	public Portar(String nume, int numarTricou) {
		super();
		this.nume = nume;
		this.numarTricou = numarTricou;
	}

	@Override
	public void descriere() {
		System.out.println("Jucatorul " + nume + " cu numarul " + numarTricou + " este Portar!");
		
	}
}
