package builder.problema1.clase;

public class ClientBuilder implements Builder{
	private Client client;
	
	
	 public ClientBuilder(String nume) {
		this.client = new Client();
		client.setNume(nume);
	 }
	 

	@Override
	public Client build() {
		return this.client;
	}
	public ClientBuilder setNume(String nume) {
		this.client.setNume(nume);
		return this;
		
	}
	public ClientBuilder setLocLaGeam(Boolean locLaGBoolean) {
		this.client.setLocLaGeam(locLaGBoolean);
		return this;
		
	}
	
	public ClientBuilder setScaunErgonomic(Boolean scaunErgonomic) {
		this.client.setScaunErgonomic(scaunErgonomic);
		return this;
		
	}
	public ClientBuilder setMasaDecorata(Boolean masaDecorata) {
		this.client.setMasaDecorata(masaDecorata);
		return this;
		
	}
	public ClientBuilder setMuzicaAmbientalaPersonalozata(Boolean muzicaAmbientalaPersonalozata) {
		this.client.setMuzicaAmbientalaPersonalozata(muzicaAmbientalaPersonalozata);
		return this;
		
	}

}
