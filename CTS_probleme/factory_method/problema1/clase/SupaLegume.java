package factory_method.problema1.clase;

public class SupaLegume implements TipSupa {
	float gramaj;
	float pret;
	public SupaLegume(float gramaj, float pret) {
		super();
		this.gramaj = gramaj;
		this.pret = pret;
	}
	@Override
	public void descriere() {
		System.out.println("Supa de legume are:"+gramaj +"grame si pretul de "+ pret);
	}
	

}
