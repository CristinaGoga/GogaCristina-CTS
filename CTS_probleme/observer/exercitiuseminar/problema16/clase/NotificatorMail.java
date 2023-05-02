package observer.exercitiuseminar.problema16.clase;

public  class NotificatorMail extends Notificator {

	@Override
	public void notificaClient(Client client, String mesaj) {
	if(client.getAndresaMail()!=null)
	{
		System.out.println();
	}
		
	}
	

}
