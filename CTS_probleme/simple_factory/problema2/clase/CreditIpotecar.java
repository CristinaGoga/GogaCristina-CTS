package simple_factory.problema2.clase;

public class CreditIpotecar implements Credit{
	private String numeDetinator;
	private Double suma;
	public CreditIpotecar(String numeDetinator, Double suma) {
		super();
		this.numeDetinator = numeDetinator;
		this.suma = suma;
	}
	@Override
	public void descriere() {
		System.out.println(numeDetinator + "a optat pentru un credit ipotecar in valoare de  "+ suma+ "euro");
		
	}
	
	

}
