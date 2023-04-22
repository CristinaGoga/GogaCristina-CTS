package factory_method.problema6.program;

import java.util.ArrayList;
import java.util.List;

import factory_method.problema6.clase.Factory;
import factory_method.problema6.clase.FactoryConcert;
import factory_method.problema6.clase.FactoryStandUpComedy;
import factory_method.problema6.clase.FactoryTeatru;
import factory_method.problema6.clase.IShow;

public class Program {
	public static void main(String[] args) {
		Factory factoryConcert = new FactoryConcert();
		Factory factoryTeatru= new FactoryTeatru();
		Factory factoryStandUpComedy = new FactoryStandUpComedy();
		List<IShow> spectacole = new ArrayList<>();
		spectacole.add(factoryConcert.createShow("Nume Concert", "Sala Palatului", "3 decembrie ora 18:00"));
		spectacole.add(factoryStandUpComedy.createShow("Nume Concert", "Loc 1", "3 decembrie ora 18:00"));
		spectacole.add(factoryTeatru.createShow("Nume Teatru", "Loc 1", "3 decembrie ora 18:00"));
		for(IShow spectacol: spectacole) {
			spectacol.printDetails();
		}
	}

}
