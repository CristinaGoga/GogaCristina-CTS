package factory_method.problema1.clase;

public class SupaDeVitaFactory implements Factory{

	@Override
	public TipSupa createTipSupa(float gramaj, float pret) {
	return new SupaDeVita(gramaj, pret);
	}

}
