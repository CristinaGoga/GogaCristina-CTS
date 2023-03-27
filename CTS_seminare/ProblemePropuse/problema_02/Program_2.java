package cts.prototype.problema_02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Program_2 {
	public static void main(String[] args) {
		//Creem reteta
		List<String> ingrediente = new ArrayList<>();
		ingrediente.add("Ing1");
		ingrediente.add("Ing2");
		ingrediente.add("Ing3");
		
		Map<String, Double> solutii = new HashMap<>();
		solutii.put("Solutie1", 200.5);
		solutii.put("Solutie2", (double) 345);
		RetetaMedicament reteta1 = new RetetaMedicament("Reteta1", ingrediente, solutii);
		RetetaMedicament reteta2=reteta1.clone();
		System.out.println(reteta1==reteta2); //false
		System.out.println(reteta1.getDenumire().equals(reteta2.getDenumire()));
		System.out.println(reteta1.getIngrediente().equals(reteta2.getIngrediente()));
		System.out.println(reteta1.getSolutii().equals(reteta2.getSolutii()));
		
		
		
		
	}

}
