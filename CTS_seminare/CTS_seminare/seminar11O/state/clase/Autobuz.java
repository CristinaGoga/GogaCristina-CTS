package seminar11O.state.clase;

public class Autobuz {
	
	private int numarAutobuz;
	private Stare stare;
	
	public int getNumarAutobuz() {
		return numarAutobuz;
	}
	public void setNumarAutobuz(int numarAutobuz) {
		this.numarAutobuz = numarAutobuz;
	}
	public Stare getStare() {
		return stare;
	}
	
	protected void setStare(Stare stare) {
		this.stare = stare;
	}
	
	
	public Autobuz(int numarAutobuz) {
		super();
		this.numarAutobuz = numarAutobuz;
		this.stare= new StareLaCapatulLiniei();
	}
	
	public void pleacaInRuta()
	{
		Stare route = new StareInCursa();
		route.changeState(this);
	}
	
	public void inService()
	{
		Stare route = new StareLaReparat();
		route.changeState(this);
	}
}
