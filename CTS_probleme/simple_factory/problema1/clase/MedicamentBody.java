package simple_factory.problema1.clase;

public class MedicamentBody implements Medicamente {
	private String denumire;
	private float pret;
	public MedicamentBody(String denumire, float pret) {
		super();
		this.denumire = denumire;
		this.pret = pret;
	}
	@Override
	public void descriere() {
		System.out.println("Medicamentul de corp:"+ denumire+ "costa "+pret + "ron.");
		
	}
	
	

}
