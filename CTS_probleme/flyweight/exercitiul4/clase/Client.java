package flyweight.exercitiul4.clase;

public class Client implements IClient{
	private String numeClient;
	private int numarTelefon;
	private String mail;
	
	public Client(String numeClient, int numarTelefon, String mail) {
		super();
		this.numeClient = numeClient;
		this.numarTelefon = numarTelefon;
		this.mail = mail;
	}
	
	
	@Override
	public String toString() {
		return "Client [numeClient=" + numeClient + ", numarTelefon=" + numarTelefon + ", mail=" + mail + "]";
	}


	@Override
	public void printeazaClient(Rezervare rezervare) {
		System.out.println(this.toString() + " " +rezervare.toString());
		
	}
	
	

}
