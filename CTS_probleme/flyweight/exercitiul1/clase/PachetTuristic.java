package flyweight.exercitiul1.clase;

//! ConcreteFlyweight
public class PachetTuristic implements IPachetTuristic{
private int codPachet;
private String hotel;
private String destinatie;
private boolean micDejun;

	public PachetTuristic(int codPachet, String hotel, String destinatie, boolean micDejun) {
	super();
	this.codPachet = codPachet;
	this.hotel = hotel;
	this.destinatie = destinatie;
	this.micDejun = micDejun;
}

	public int getCodPachet() {
		return codPachet;
	}

	public void setCodPachet(int codPachet) {
		this.codPachet = codPachet;
	}

	public String getHotel() {
		return hotel;
	}
	
	public void setHotel(String hotel) {
		this.hotel = hotel;
	}

	public String getDestinatie() {
		return destinatie;
	}

	public void setDestinatie(String destinatie) {
		this.destinatie = destinatie;
	}


	public boolean isMicDejun() {
		return micDejun;
	}


	public void setMicDejun(boolean micDejun) {
		this.micDejun = micDejun;
	}



	@Override
	public String toString() {
		return "PachetTuristic [codPachet=" + codPachet + ", hotel=" + hotel + ", destinatie=" + destinatie
				+ ", micDejun=" + micDejun + "]";
	}

	@Override
	public void descrierePachet(Optionale optionale) {
		System.out.println("Pachetul Turistic cu codul: "+ codPachet
				+ " , are cazare la hotelul " + hotel + " , din orasul " 
				+ destinatie + (micDejun ? "are" : "nu are") + "micDejun, " +
				(optionale.isCina() ? "are " : " nu are")+
				"inclusa cina si are nu numar de " +optionale.getNumarExcursii()+" excursii optionale");
		
	}
	

}
