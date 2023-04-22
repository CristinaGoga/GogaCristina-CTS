package factory_method.problema4.clase;

public class FactoryPortar implements Factory{

	@Override
	public Jucator creazaJucator(String nume, int numarTricou) {
		return new Portar(nume, numarTricou);
	}

}
