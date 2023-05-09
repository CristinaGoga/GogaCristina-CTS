package Seminar11.template.clase;

public class MasaRezervata extends MasaRestaurant {
	private String oraRezervare;

	public MasaRezervata(int numarMasa, String oraRezervare) {
		super(numarMasa);
		this.oraRezervare= oraRezervare;
	}

	@Override
	protected void curatareMasa() {
		System.out.println("Chelnerul curata masa "+ getNumarMasa() + " care este rezervata la ora "+this.oraRezervare+" !");
		
	}

	@Override
	protected void aseazaServetele() {
		System.out.println("Aseaza servetelele pentru masa " +getNumarMasa()+  " care este rezervata la ora "+this.oraRezervare+" !");
		
	}

	@Override
	protected void aseazaTacamuri() {
		System.out.println("Aseaza tacamuri pentru masa "+getNumarMasa()+  " care este rezervata la ora "+this.oraRezervare+" !");
		
	}

	@Override
	protected void invitaPersoane() {
		System.out.println("Va asteptam la masa  "+getNumarMasa()+ " la ora "+ this.oraRezervare + "!");
		
	}


}
