package flyweight.exercitiul6.clase;

public class PozitieTribuna {
	private String culoareaTricoului;

	public PozitieTribuna(String culoareaTricoului) {
		super();
		this.culoareaTricoului = culoareaTricoului;
	}

	@Override
	public String toString() {
		return "PozitieTribuna [culoareaTricoului=" + culoareaTricoului + "]";
	}

	public void setCuloareaTricoului(String culoareaTricoului) {
		this.culoareaTricoului = culoareaTricoului;
	}
	
	

}
