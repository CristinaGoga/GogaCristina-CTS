package observer.exercitiuseminar.problema16.clase;

public abstract class Notificator {
	private Notificator succesor=null;
	
	
	public void setSuccesor(Notificator succesor) {
		this.succesor = succesor;
	}
	

	public Notificator getSuccesor() {
		return succesor;
	}


	public abstract void notificaClient(Client client, String mesaj);
	
}
