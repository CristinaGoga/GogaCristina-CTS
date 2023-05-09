package Seminar11.template.clase;

public class MasaLocala extends MasaRestaurant{

	public MasaLocala(int numarMasa) {
		super(numarMasa);
	}

	@Override
	protected void curatareMasa() {
		System.out.println("Chelnerul curata masa "+getNumarMasa()+" pentru persoanele care asteapta la usa.");
		
	}

	@Override
	protected void aseazaServetele() {
		System.out.println("Aseaza servetelele la masa  "+getNumarMasa()+ " pentru persoanele ce astapta la usa.");
		
	}

	@Override
	protected void aseazaTacamuri() {
		System.out.println("Aseaza tacamuri la masa "+getNumarMasa()+ " pentru persoanele ce astapta la usa.");
		
	}

	@Override
	protected void invitaPersoane() {
		System.out.println("Invita persoanele ce asteapta la usa la masa "+getNumarMasa()+ ".");
		
	}

}
