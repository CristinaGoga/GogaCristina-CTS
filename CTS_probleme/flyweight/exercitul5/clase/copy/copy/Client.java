package flyweight.exercitul5.clase.copy.copy;

public class Client implements IClient{

	private String numeClient;
	private int numarAsigurare;
	private int varsta;
	
	
	public Client(String numeClient, int numarAsigurare, int varsta) {
		super();
		this.numeClient = numeClient;
		this.numarAsigurare = numarAsigurare;
		this.varsta = varsta;
	}

	@Override
	public String toString() {
		return "Client [numeClient=" + numeClient + ", numarAsigurare=" + numarAsigurare + ", varsta=" + varsta + "]";
	}

	@Override
	public void descriere(Reteta reteta) {
		System.out.println(this.toString()+ " " + reteta.toString());
		
	}
	

}
