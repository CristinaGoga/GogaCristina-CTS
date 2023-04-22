package simple_factory.problema4.clase;

public class Autobuz implements MijlocTransport {
	private String numarInmatriculare;
	private int numarTramvai;
	
	public Autobuz(String numarInmatriculare, int numarTramvai) {
		super();
		this.numarInmatriculare = numarInmatriculare;
		this.numarTramvai = numarTramvai;
	}
	
	@Override
	public void descriere() {
		System.out.println("Mijlocul de transport cu numarul de inmatriculare "+
	numarInmatriculare +" si numarul " + numarTramvai+ " este un autobuz! ");
	}

}
