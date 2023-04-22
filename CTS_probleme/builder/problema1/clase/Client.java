package builder.problema1.clase;

public class Client {
private String nume;
private Boolean locLaGeam;
private Boolean scaunErgonomic;
private Boolean masaDecorata;
private Boolean muzicaAmbientalaPersonalozata;

public Client(){
	this.nume= "Anonim";
	this.locLaGeam=false;
	this.scaunErgonomic=false;
	this.masaDecorata=false;
	this.muzicaAmbientalaPersonalozata=false;
	}

public void setNume(String nume) {
	this.nume = nume;
}

public void setLocLaGeam(Boolean locLaGeam) {
	this.locLaGeam = locLaGeam;
}

public void setScaunErgonomic(Boolean scaunErgonomic) {
	this.scaunErgonomic = scaunErgonomic;
}

public void setMasaDecorata(Boolean masaDecorata) {
	this.masaDecorata = masaDecorata;
}

public void setMuzicaAmbientalaPersonalozata(Boolean muzicaAmbientalaPersonalozata) {
	this.muzicaAmbientalaPersonalozata = muzicaAmbientalaPersonalozata;
}

@Override
public String toString() {
	return "Client [nume=" + nume + ", locLaGeam=" + locLaGeam + ", scaunErgonomic=" + scaunErgonomic
			+ ", masaDecorata=" + masaDecorata + ", muzicaAmbientalaPersonalozata=" + muzicaAmbientalaPersonalozata
			+ "]";
}


}
