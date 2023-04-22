package factory_method.problema2.clase;

public class MedicamentBody implements Medicament{
private String denumireMedicament;
private int pret;


	public MedicamentBody(String denumireMedicament, int pret) {
	super();
	this.denumireMedicament = denumireMedicament;
	this.pret = pret;
}


	@Override
	public void descriere() {
		System.out.println("Medicamentu de corp " + denumireMedicament + " are pretul de "+ pret +" ron.");
		
	}

}

