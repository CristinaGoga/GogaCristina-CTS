package factory_method.problema1.clase;

public class SupaLegumeFactory implements Factory {

	@Override
	public TipSupa createTipSupa(float gramaj, float pret) {
		return new SupaLegume(gramaj, pret);
	}

}
