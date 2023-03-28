package prototype.clase;

import java.util.HashMap;
import java.util.Map;

public class Reteta implements IReteta {
	private String nume;
	private Map<String, Float> solutii = new HashMap<>();
	private float gramaj;
	
	public Reteta(String nume, Map<String, Float> solutii, float gramaj) {
		super();
		this.nume = nume;
		this.solutii = solutii;
		this.gramaj = gramaj;
		
		float sum=0;
		for(float gramajSolutie: solutii.values()) {
			sum +=gramajSolutie;
			
		}
		if(sum==gramaj)
		{
			this.gramaj= gramaj;
		}else {
			throw new IllegalArgumentException();
		}
	}
	

	public Reteta() {
		super();
		this.nume = "NotApplicable";
		this.solutii = null;
		this.gramaj = 0;
	}


	public void setNume(String nume) {
		this.nume = nume;
	}

	public void setSolutii(Map<String, Float> solutii) {
		this.solutii=new HashMap();
		for(String key : solutii.keySet()) {
			this.solutii.put(key, solutii.get(key));
		}
	}

	public void setGramaj(float gramaj) {
		this.gramaj = gramaj;
	}

	@Override
	public IReteta copiaza()  {
		Reteta retetaNoua= new Reteta();
		retetaNoua.setGramaj(gramaj);
		retetaNoua.setNume(nume);
		retetaNoua.setSolutii(solutii);
		
		return retetaNoua;
	}


	@Override
	public String toString() {
		return "Reteta [nume=" + nume + ", solutii=" + solutii + ", gramaj=" + gramaj + "]";
	}
	

}
