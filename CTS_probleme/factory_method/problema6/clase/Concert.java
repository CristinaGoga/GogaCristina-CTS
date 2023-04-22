package factory_method.problema6.clase;

import java.util.List;

public class Concert implements IShow {
	private String name;
	private String location;
	private String dateTime;
	private String genMuzica;
	private List<String> artisiti;	
	
	public void setGenMuzica(String genMuzica) {
		this.genMuzica = genMuzica;
	}

	public void setArtisiti(List<String> artisiti) {
		this.artisiti = artisiti;
	}

	public Concert(String name, String location, String dateTime) {
		super();
		this.name = name;
		this.location = location;
		this.dateTime = dateTime;
		this.genMuzica = "Anonim";
		this.artisiti = null;
	}

	@Override
	public void printDetails() {
		System.out.println("Concertul"+ name +  " are loc la" + " pe "+ dateTime);
		System.out.println("Genul muzical este :" +genMuzica);
		System.out.println("Lista de artisti este formata din:"+artisiti);
		
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
