package seminar11O.strategy.clase;

public class Calator {
	private ModPlata modPlata;
	private String nume;
	
	public Calator( String nume) {
		super();
		this.modPlata = new PlataCardCalatorie();
		this.nume = nume;
	}

	public ModPlata getModPlata() {
		return modPlata;
	}

	public void setModPlata(ModPlata modPlata) {
		this.modPlata = modPlata;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}
	
	public void platesteBilet(double tarif)
	{
		this.modPlata.plateste(tarif);
	}

}
