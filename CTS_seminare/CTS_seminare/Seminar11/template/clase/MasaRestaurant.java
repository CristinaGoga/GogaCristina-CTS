package Seminar11.template.clase;

public abstract class MasaRestaurant {
	private int numarMasa;

	public MasaRestaurant(int numarMasa) {
		super();
		this.numarMasa = numarMasa;
	}
	
	protected abstract void curatareMasa();
	protected abstract void aseazaServetele();
	protected abstract void aseazaTacamuri();
	protected abstract void invitaPersoane();
	
	public final void ocupaMasa() {
		curatareMasa();
		aseazaServetele();
		aseazaTacamuri();
		invitaPersoane();
		
		
	}

	public int getNumarMasa() {
		return numarMasa;
	}

	public void setNumarMasa(int numarMasa) {
		this.numarMasa = numarMasa;
	}
	
	
}
