package simple_factory.problema4.clase;

public class Factory {
	public Factory(){
	}
	
public MijlocTransport getInstance(TipMijlocTransport tipMijlocTransport, String numarInmatriculare, int numar) {
	switch (tipMijlocTransport) {
	case TRAMVAI:
		return new Tramvai(numarInmatriculare, numar);
	case TROLEIBUZ:
		return new Troleibuz(numarInmatriculare, numar);
	case AUTOBUZ:
		return new Autobuz(numarInmatriculare, numar);
		
	default:
	 return null;
	}
}
}
