package cts.prototype.problema_01;

import java.util.HashMap;
import java.util.Map;

public class ClientManagerDeepCopy {
	private Map<String, Client> existingClients= new HashMap<>();

	public ClientManagerDeepCopy() {
		super();
	}
	
	 public Client getClient(String name, String email, String phone) throws CloneNotSupportedException {
	      String key = name + email + phone;
	      if (existingClients.containsKey(key)) {
	         return existingClients.get(key).clone(); 
	      }
	      Client newClient = new Client(name, email, phone);
	      existingClients.put(key, newClient.clone());
	      return newClient;
	 }
	 public Client deepCopy(Client original) {
		 Client copy = null;
		 try {
			 copy= (Client) original.clone();
			 copy.setNume(original.getNume());
			 copy.setEmail(original.getEmail());
			 copy.setPhone(original.getPhone()); 
		 }catch (CloneNotSupportedException e) {
			 e.printStackTrace();
		 }
		 return copy;
	 }
}
