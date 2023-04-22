package factory_method.problema1.clase;

public class SupaCiuperciFactory implements Factory {

	@Override
	public TipSupa createTipSupa(float gramaj, float pret) {
		return new SupaCiuperci(gramaj, pret);
	}
	

}
