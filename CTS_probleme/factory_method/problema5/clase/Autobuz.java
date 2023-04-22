package factory_method.problema5.clase;

public class Autobuz implements MijlocTransport{
	private String numarInmatriculare;
	private int numarTraseu;

	public Autobuz(String numarInmatriculare, int numarTraseu) {
		super();
		this.numarInmatriculare = numarInmatriculare;
		this.numarTraseu = numarTraseu;
	}


	@Override
	public void descriere() {
		System.out.println("Mijlocul de transport cu numarul de inmatriculare " + numarInmatriculare+ " ce merge pe traseul "+ numarTraseu + " este un AUTOBUZ!");
	}

}
