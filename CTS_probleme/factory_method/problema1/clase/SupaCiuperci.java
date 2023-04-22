package factory_method.problema1.clase;

public class SupaCiuperci implements TipSupa{
	float gramaj;
	float pret;
	public SupaCiuperci(float gramaj, float pret) {
		super();
		this.gramaj = gramaj;
		this.pret = pret;
	}
	@Override
	public void descriere() {
		System.out.println("Supa de ciuperci are:"+gramaj +"grame si pretul de "+ pret);
	}
	
}
