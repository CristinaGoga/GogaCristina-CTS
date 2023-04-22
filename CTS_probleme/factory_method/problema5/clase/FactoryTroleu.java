package factory_method.problema5.clase;

public class FactoryTroleu implements Factory {

	@Override
	public MijlocTransport creareMijlocTransport(String numarInmatriculare, int numarTraseu) {
		return new Troleu(numarInmatriculare, numarTraseu);
	}}
