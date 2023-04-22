package simple_factory.problema1.clase;

public class MedicamentDurere implements Medicamente{
	private String denumire;
	private float pret;
	
	
	public MedicamentDurere(String denumire, float pret) {
		this.denumire = denumire;
		this.pret = pret;
	}

	@Override
	public void descriere() {
		System.out.println("Medicamentu de raceala: "+ denumire+" costa "+pret+" lei."); 		
	}

}
