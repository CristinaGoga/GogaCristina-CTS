package simple_factory.problema1.program;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

import simple_factory.problema1.clase.Factory;
import simple_factory.problema1.clase.MedicamentBody;
import simple_factory.problema1.clase.MedicamentDurere;
import simple_factory.problema1.clase.MedicamentRaceala;
import simple_factory.problema1.clase.Medicamente;
import simple_factory.problema1.clase.TipMedicament;

public class Program {
	public static void main(String[] args) {
		Medicamente medicamentCorp = new MedicamentBody("Fastum Gel", 20);
		Medicamente medicamentDurere = new MedicamentDurere("Nurofen", 22);
		Medicamente medicamentRaceala= new MedicamentRaceala("Theraflue", 5);
		Factory factory = new Factory();
		
		medicamentCorp.descriere();
		medicamentDurere.descriere();
		medicamentRaceala.descriere();
		System.out.println("\n");
		
		List<Medicamente> medicamente = new ArrayList<>();
		medicamente.add(medicamentRaceala);
		medicamente.add(medicamentCorp);
		medicamente.add(medicamentDurere);
		medicamente.add(factory.createInstance(TipMedicament.MEDICAMENTBODY, "MultiVitamine", 30));
		medicamente.add(factory.createInstance(TipMedicament.MEDICAMENTDURERE, "Nospa", 15));
		medicamente.add(factory.createInstance(TipMedicament.MEDICAMENTRACEALA, "Nurofen Raceala si Gripa", 50));
	
	for(Medicamente medicamet : medicamente)
	{
		medicamet.descriere();
	}
	}

}
