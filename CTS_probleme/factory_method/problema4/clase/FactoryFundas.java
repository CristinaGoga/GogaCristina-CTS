package factory_method.problema4.clase;

public class FactoryFundas implements Factory{

	@Override
	public Jucator creazaJucator(String nume, int numarTricou) {
		return new Fundas(nume, numarTricou);
	}

}
