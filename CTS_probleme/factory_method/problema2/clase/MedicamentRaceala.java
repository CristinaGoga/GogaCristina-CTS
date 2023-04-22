package factory_method.problema2.clase;

public class MedicamentRaceala implements Medicament{
private String denumireMedicament;
private int pret;


	public MedicamentRaceala(String denumireMedicament, int pret) {
	super();
	this.denumireMedicament = denumireMedicament;
	this.pret = pret;
}


	@Override
	public void descriere() {
		System.out.println("Medicamentu de raceala " + denumireMedicament + " are pretul de "+ pret +" ron.");
		
	}

}
