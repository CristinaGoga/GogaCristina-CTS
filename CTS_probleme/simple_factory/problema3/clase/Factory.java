package simple_factory.problema3.clase;

public class Factory {
	
	public Factory() {
		
	}
	
	
public Jucator getInstance(CategorieJucator categorieJucator, String nume, int numarTricou) {
	switch (categorieJucator) {
	case FUNDAS:
		return new Fundas(nume, numarTricou);
	case ATACANT:
		return new Atacant(nume, numarTricou);
	case PORTAR:
		return new Portar(nume, numarTricou);
	default:
		return null;
		}	
	}
}
