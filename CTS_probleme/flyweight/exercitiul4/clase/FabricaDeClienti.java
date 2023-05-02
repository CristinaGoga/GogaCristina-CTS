package flyweight.exercitiul4.clase;

import java.util.HashMap;

public class FabricaDeClienti {
	
	private HashMap<String, IClient> listaClienti;
	
	
	public FabricaDeClienti() {
		listaClienti= new HashMap<String,IClient>();
	}
	
	public  IClient getClient(String numeClient)
	{
		IClient client = listaClienti.get(numeClient);
		if(client == null)
		{
			client= new Client(numeClient, 1, "adresa");
			listaClienti.put(numeClient, client);
		}
		return client;
	}

	@Override
	public String toString() {
		return "FabricaDeClienti [listaClienti=" + listaClienti + "]";
	}
	
}
