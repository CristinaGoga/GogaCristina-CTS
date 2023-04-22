package prototype.problema2.clase;

import java.util.HashMap;
import java.util.Map;

public class ClientBanca implements IClientBanca {
	
	private String nume;
	private Map<String,Float> banca= new HashMap<>();
	private int varsta;
	
	public ClientBanca(String nume, Map<String, Float> banca, int varsta) {
		super();
		this.nume = nume;
		this.banca = banca;
		this.varsta = varsta;
	}
	
	public ClientBanca() {
		super();
		this.nume = "Necunoscut";
		this.banca = null;
		this.varsta = 0;
	}
	
	public void setNume(String nume) {
		this.nume = nume;
	}
	
	public void setBanca(Map<String, Float> banca) {
		this.banca=new HashMap();
		for(String key : banca.keySet()) {
			this.banca.put(key, banca.get(key));
		}
	}
	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}
	
	@Override
	public ClientBanca copiaza() {
		ClientBanca clientNou = new ClientBanca(nume, banca, varsta);
		clientNou.setNume(nume);
		clientNou.setVarsta(varsta);
		clientNou.setBanca(banca);
		return clientNou;
	}

	@Override
	public String toString() {
		return "ClientBanca [nume=" + nume + ", banca=" + banca + ", varsta=" + varsta + "]";
	}
	
}
