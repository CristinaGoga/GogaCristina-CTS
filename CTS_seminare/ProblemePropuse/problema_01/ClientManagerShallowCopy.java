package cts.prototype.problema_01;

import java.util.HashMap;
import java.util.Map;

public class ClientManagerShallowCopy {
	private Map<String, Client> existingClients= new HashMap<>();

	public ClientManagerShallowCopy() {
		super();
	}

	public Client getClient(String nume, String email, String phone) {
		String key=nume+email+phone;
		if(existingClients.containsKey(key)) {
			return existingClients.get(key); //ret obiectul existent
		}
		//daca nu exista un client cu info date
		Client newClient= new Client (nume, email, phone);
		existingClients.put(key,newClient);
	return newClient;
	}

}
