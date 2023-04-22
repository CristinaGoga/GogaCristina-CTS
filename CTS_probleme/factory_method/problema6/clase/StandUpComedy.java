package factory_method.problema6.clase;

import java.util.List;

public class StandUpComedy implements IShow{
	
	private String name;
	private String location;
	private String dateTime;
	private Boolean limbajLicentios;
	private List<String> comedianti;
	
	public void setLimbajLicentios(Boolean limbajLicentios) {
		this.limbajLicentios = limbajLicentios;
	}

	public void setComedianti(List<String> comedianti) {
		this.comedianti = comedianti;
	}

	
	public StandUpComedy(String name, String location, String dateTime) {
		super();
		this.name = name;
		this.location = location;
		this.dateTime = dateTime;
	}

	@Override
	public void printDetails() {
		System.out.println("Spectacolul de Stand-Up Comedy"+ name +  " are loc la" + " pe "+ dateTime);
		System.out.println("Spectacolul prezinta un limbaj licentios :" +limbajLicentios);
		System.out.println("Lista de comedianti este formata din:"+comedianti);
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
