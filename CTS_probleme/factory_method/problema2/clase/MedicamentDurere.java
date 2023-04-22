package factory_method.problema2.clase;

public class MedicamentDurere implements Medicament{
	private String denumireMedicament;
	private int pret;


		public MedicamentDurere(String denumireMedicament, int pret) {
		super();
		this.denumireMedicament = denumireMedicament;
		this.pret = pret;
	}


		@Override
		public void descriere() {
			System.out.println("Medicamentu de durere " + denumireMedicament + " are pretul de "+ pret +" ron.");
			
		}

	}
