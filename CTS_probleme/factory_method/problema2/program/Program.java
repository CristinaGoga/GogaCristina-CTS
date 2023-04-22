package factory_method.problema2.program;

import java.util.ArrayList;
import java.util.List;

import factory_method.problema2.clase.Factory;
import factory_method.problema2.clase.FactoryMedicamentBody;
import factory_method.problema2.clase.FactoryMedicamentDurere;
import factory_method.problema2.clase.FactoryMedicamentRaceala;
import factory_method.problema2.clase.Medicament;

public class Program {
	public static void main(String[] args) {
		
		Factory factoryMedicamenteCorp = new FactoryMedicamentBody();
		Factory factoryMedicamenteDurere = new FactoryMedicamentDurere();
		Factory factoryMedicamenteRaceala = new FactoryMedicamentRaceala();
		
		List<Medicament>medicamente = new ArrayList<>();
		medicamente.add(factoryMedicamenteCorp.creareMedicament("Fastum Gel", 25));
		medicamente.add(factoryMedicamenteDurere.creareMedicament("Nurofen Express", 34));
		medicamente.add(factoryMedicamenteRaceala.creareMedicament("Theraflue", 37));
		medicamente.add(factoryMedicamenteCorp.creareMedicament("Puterea Ursului", 70));
		medicamente.add(factoryMedicamenteDurere.creareMedicament("Nospa", 20));
		
		for(Medicament medicament : medicamente) {
			medicament.descriere();
		}
	}

}
