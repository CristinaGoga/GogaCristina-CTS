package prototype.main;

import java.util.HashMap;
import java.util.Map;

import prototype.clase.IReteta;
import prototype.clase.Reteta;

public class Program1 {
	public static void main(String[] args) {
		Map<String, Float> solutii = new HashMap<String, Float>();
		solutii.put("Solutia1", (float) 20);
		solutii.put("Solutie2", (float) 30);
		solutii.put("Solutia3", (float) 10);
		
		IReteta prototype = new Reteta("Reteta",solutii, 60 );
		Reteta farmacie= (Reteta) prototype.copiaza();
		farmacie.setNume("Reteta Farmaciei");
		System.out.println(farmacie.toString());
		
		Reteta laborator= (Reteta) prototype.copiaza();
		laborator.setNume("Reteta laboratorului");
		System.out.println(laborator.toString());
		
		
	}

}
