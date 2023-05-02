package observer.exercitiul4.clase;

public class ClientiAbonati implements Observer {
	private String numeClient;

	public ClientiAbonati(String numeClient) {
		super();
		this.numeClient = numeClient;
	}

	@Override
	public void receptionareMesaj(String mesaj) {
		System.out.println("Clientul " + this.numeClient +" a primit mesajul :" + mesaj);
		
	}
	

}
