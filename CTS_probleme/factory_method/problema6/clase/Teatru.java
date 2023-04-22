package factory_method.problema6.clase;

import java.util.List;

public class Teatru implements IShow {
	
	private String name;
	private String location;
	private String dateTime;
	private String numeRegizor;
	private List<String> actori;
	
	public void setNumeRegizor(String numeRegizor) {
		this.numeRegizor = numeRegizor;
	}
	
	public void setActori(List<String> actori) {
	    this.actori = actori;
	}
	
	
	public Teatru(String name, String location, String dateTime) {
		super();
		this.name = name;
		this.location = location;
		this.dateTime = dateTime;
		
	}

	@Override
	public void printDetails() {
		System.out.println("Spectacolul de teatru"+ name +  " are loc la" + " pe "+ dateTime);
		System.out.println("Spectacolul este regizat de :" +numeRegizor);
		System.out.println("Lista de actori este formata din:"+actori);
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public String getLocation() {
		return this.location;
	}

	@Override
	public String getDateTime() {
		return this.dateTime;
	}

}
