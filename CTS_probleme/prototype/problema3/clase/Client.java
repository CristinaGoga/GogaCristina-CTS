package prototype.problema3.clase;

import java.util.HashMap;
import java.util.Map;

public class Client implements IClient{
	private String nume;
	private Map<String, Float> meciuri =new  HashMap<>();
	
	public Client(String nume, Map<String, Float> meciuri) {
		super();
		this.nume = nume;
		this.meciuri = meciuri;
	}
	
	public Client() {
		super();
		this.nume = "Anonim";
		this.meciuri = null;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public void setMeciuri(Map<String, Float> meciuri) {
		this.meciuri=new HashMap();
		for(String key : meciuri.keySet()) {
			this.meciuri.put(key, meciuri.get(key));
		}
	}
	@Override
	public Client copiaza() {
		Client clientNou = new Client();
		clientNou.setMeciuri(meciuri);
		clientNou.setNume(nume);
		return clientNou;
	}

	@Override
	public String toString() {
		return "Client [nume=" + nume + ", meciuri=" + meciuri + "]";
	}


	
	

}
