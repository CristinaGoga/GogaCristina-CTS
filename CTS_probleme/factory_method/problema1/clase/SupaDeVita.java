package factory_method.problema1.clase;

public class SupaDeVita implements TipSupa {
	float gramaj;
	float pret;
	public SupaDeVita(float gramaj, float pret) {
		super();
		this.gramaj = gramaj;
		this.pret = pret;
	}
	@Override
	public void descriere() {
		System.out.println("Supa de vita are:"+gramaj +"grame si pretul de "+ pret);
	}
	

}
