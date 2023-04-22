package prototype.problema1.clase;

import java.util.HashMap;
import java.util.Map;

public class Client implements IClient{
private String nume;
private Map<String , Integer > rezervari =new HashMap<>();


public Client(String nume, Map<String, Integer> rezervari) {
	super();
	this.nume = nume;
	this.rezervari = rezervari;
}
public Client() {
	super();
	this.nume="Anonim";
	this.rezervari= null;
}

	public void setNume(String nume) {
	this.nume = nume;
}

public void setRezervari(Map<String, Integer> rezervari) {
	this.rezervari = new HashMap<>();
	for(String key :rezervari.keySet()) {
		this.rezervari.put(key, rezervari.get(key));
	}
	
}

	@Override
	public Client copiaza() {
	Client clientNou = new Client();
	clientNou.setNume(nume);
	clientNou.setRezervari(rezervari);
	return clientNou;
	}
	@Override
	public String toString() {
		return "Client [nume=" + nume + ", rezervari=" + rezervari + "]";
	}
	
	
	
	

}
