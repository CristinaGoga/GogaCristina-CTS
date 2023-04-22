package factory_method.problema6.clase;

public class FactoryTeatru implements Factory{

	@Override
	public IShow createShow(String name, String location, String dateTime) {
		Teatru teatru = new Teatru(name,location,dateTime);
		teatru.setActori(null);
		teatru.setNumeRegizor("Goga Cristina");
		return teatru;
		
	}
}
