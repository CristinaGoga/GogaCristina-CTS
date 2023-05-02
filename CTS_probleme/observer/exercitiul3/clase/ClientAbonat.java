package observer.exercitiul3.clase;

public class ClientAbonat implements Observer {
	private String numeClientAbonat;
	

	public ClientAbonat(String numeClientAbonat) {
		super();
		this.numeClientAbonat = numeClientAbonat;
	}


	@Override
	public void receptionareMesaj(String mesaj) {
		System.out.println("Clientul :" + this.numeClientAbonat + " a primit mesajul:"+ mesaj);
		
	}
	

}
