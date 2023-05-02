package observer.exercitiuseminar.problema16.clase;

public class NotificareTelefon extends Notificator {

	@Override
	public void notificaClient(Client client, String mesaj) {
		if(client.getNumarTelefon()!=null)
		{
			System.out.println("Clientul" + client.getNume()+"primeste SMS cu mesajul:"+mesaj);
		}else {
			if(super.getSuccesor()!=null)
			{
				super.getSuccesor().notificaClient(client,mesaj);
			}
			else {
			
			}
		}
		
	}
	

}
