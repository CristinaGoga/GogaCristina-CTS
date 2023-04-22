package factory_method.problema2.clase;

public class FactoryMedicamentDurere  implements Factory {
	
	public Medicament creareMedicament(String denumire, int pret)
	{
		return new MedicamentDurere(denumire, pret);
	}

}
