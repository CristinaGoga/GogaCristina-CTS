package flyweight.exercitiul2.clase;

public class Rezervare {
	private int numarCamera;
	private String numeClient;
	
	public Rezervare(int numarCamera, String numeClient) {
		super();
		this.numarCamera = numarCamera;
		this.numeClient = numeClient;
	}

	@Override
	public String toString() {
		return "Rezervare [numarCamera=" + numarCamera + ", numeClient=" + numeClient + "]";
	}
	
	
	
}
