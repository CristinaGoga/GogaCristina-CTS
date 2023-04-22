package simple_factory.problema2.clase;

public class CreditNevoiPersonale implements Credit{
	private String numeDetinator;
	private Double suma;
	public CreditNevoiPersonale(String numeDetinator, Double suma) {
		super();
		this.numeDetinator = numeDetinator;
		this.suma = suma;
	}
	@Override
	public void descriere() {
		System.out.println(numeDetinator + " a optat pentru un credit de nevoi pesonale in valoare de  "+ suma+ "euro");
		
	}
}
