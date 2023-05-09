package Seminar11.state.clase;

public class Masa {
	private int numarRezervare;
	private State stare;
	
	public Masa(int numarRezervare) {
		super();
		this.numarRezervare = numarRezervare;
	}

	public int getNumarRezervare() {
		return numarRezervare;
	}

	public void setNumarRezervare(int numarRezervare) {
		this.numarRezervare = numarRezervare;
	}

	public State getStare() {
		return stare;
	}

	protected void setStare(State stare) {
		this.stare = stare;
	}
	
	public void rezervaMasa()
	{
		State rezervata = new StareRezervata();
		rezervata.doAction(this);
	}
	
	public void ocupaMasa()
	{
		State ocupata = new StareOcupata();
		ocupata.doAction(this);
	}
	
	public void elibereazaMasa()
	{
		State libera = new StareLibera();
		libera.doAction(this);
	}
	
	public void ridicaRezerervare()
	{
		State ocupata = new StareOcupata();
		ocupata.doAction(this);
	}
	

}
