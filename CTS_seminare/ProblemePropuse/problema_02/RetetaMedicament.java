package cts.prototype.problema_02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RetetaMedicament extends Reteta {
	private Map<String, Double> solutii;

	public RetetaMedicament(String denumire, List<String> ingrediente, Map<String, Double> solutii) {
		super(denumire, ingrediente);
		this.solutii = solutii;
	}
	public Map<String,Double> getSolutii(){
		return solutii;
	}
	@Override
	public RetetaMedicament clone() {
		List<String> ingrediente = new ArrayList<>(getIngrediente());
		Map<String, Double> solutii = new HashMap<>(getSolutii());
		return new RetetaMedicament(getDenumire(), ingrediente, solutii);
		
		
	}

}
