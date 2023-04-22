package factory_method.problema2.clase;

public class FactoryMedicamentRaceala  implements Factory{
	
	public Medicament creareMedicament(String denumire, int pret)
	{
		return new MedicamentRaceala(denumire, pret);
	}

}
