package factory_method.problema5.program;

import java.util.ArrayList;
import java.util.List;

import factory_method.problema5.clase.Factory;
import factory_method.problema5.clase.FactoryAutobuz;
import factory_method.problema5.clase.FactoryTramvai;
import factory_method.problema5.clase.FactoryTroleu;
import factory_method.problema5.clase.MijlocTransport;

public class Program {
	public static void main(String[] args) {
		Factory factoryAutobuz = new FactoryAutobuz();
		Factory factoryTramvai = new FactoryTramvai();
		Factory factoryTroleu = new FactoryTroleu();
		
		List<MijlocTransport> mijloaceTransport = new ArrayList<>();
		mijloaceTransport.add(factoryAutobuz.creareMijlocTransport("B-123-STB", 102));
		mijloaceTransport.add(factoryTramvai.creareMijlocTransport("B-134-STB", 308));
		mijloaceTransport.add(factoryTroleu.creareMijlocTransport("B-130-STB", 19));
		
		for(MijlocTransport mijlocTransport : mijloaceTransport) {
			mijlocTransport.descriere();
		}
	}

}
