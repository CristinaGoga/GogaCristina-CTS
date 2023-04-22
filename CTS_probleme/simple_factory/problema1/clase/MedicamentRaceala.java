package simple_factory.problema1.clase;

public class MedicamentRaceala implements Medicamente {
	private String denumire;
	private float pret;
	
	
	public MedicamentRaceala(String denumire, float pret) {
		super();
		this.denumire = denumire;
		this.pret = pret;
	}


	@Override
	public void descriere() {
		System.out.println("Medicamentul de durere :"+denumire+" are pretul de "+pret+" ron");
		
	}
	

}
