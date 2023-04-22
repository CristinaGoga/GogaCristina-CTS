package factory_method.problema3.clase;

public class FactoryPersoanaFizica implements Factory{

	@Override
	public TipClient creareClient(String nume, int varsta) {
		return new  PersoanaFizica(nume, varsta);
	}

}
