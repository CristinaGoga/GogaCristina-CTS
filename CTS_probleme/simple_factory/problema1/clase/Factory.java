package simple_factory.problema1.clase;

public class Factory {
	
	public Factory() {
		
	}
	
	public Medicamente createInstance(TipMedicament tipMedicament, String denumire, float pret) {
		switch (tipMedicament) {
		case MEDICAMENTBODY: 
			return new MedicamentBody(denumire, pret);
		
		case MEDICAMENTDURERE: 
			
			return new MedicamentDurere(denumire, pret);
		
		case MEDICAMENTRACEALA: 
			return new MedicamentRaceala(denumire, pret);
		default: 
			return null;
		}
	}
}
	
	
	
