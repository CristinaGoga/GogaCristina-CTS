package factory_method.problema4.clase;

public class FactoryAtacant  implements Factory{

	@Override
	public Jucator creazaJucator(String nume, int numarTricou) {
		return new Atacant(nume, numarTricou);
	}

}
