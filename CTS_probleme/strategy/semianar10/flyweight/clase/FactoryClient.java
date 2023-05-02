package strategy.semianar10.flyweight.clase;

import java.util.HashMap;

import observer.exercitiul4.clase.ClientiAbonati;

public class FactoryClient {
	private HashMap<String, IClient> clienti;
	
	public FactoryClient() {
		clienti= new HashMap<String, IClient>();
	}
	
	public IClient getClient(String numeClient) {
		if(clienti.get(numeClient)!=null) {
			return clienti.get(numeClient);
		}
		else {
			IClient client= new Client(numeClient,"Nespecificat","Nespecificat");
			clienti.put(numeClient, client);
			return client;
		}
	}

}
