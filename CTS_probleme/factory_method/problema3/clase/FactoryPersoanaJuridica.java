package factory_method.problema3.clase;

public class FactoryPersoanaJuridica  implements Factory{

	@Override
	public TipClient creareClient(String nume, int varsta) {
		return new  PersoanaJuridica(nume, varsta);
	}
}
