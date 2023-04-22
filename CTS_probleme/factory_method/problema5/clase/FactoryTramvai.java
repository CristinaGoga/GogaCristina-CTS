package factory_method.problema5.clase;

public class FactoryTramvai implements Factory {

	@Override
	public MijlocTransport creareMijlocTransport(String numarInmatriculare, int numarTraseu) {
		return new Tramvai(numarInmatriculare, numarTraseu);
	}
}
