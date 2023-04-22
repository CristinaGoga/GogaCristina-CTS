package factory_method.problema2.clase;

public class FactoryMedicamentBody  implements Factory{
	
	@Override
	public Medicament creareMedicament(String denumire, int pret)
	{
		return new MedicamentBody(denumire, pret);
	}

}
