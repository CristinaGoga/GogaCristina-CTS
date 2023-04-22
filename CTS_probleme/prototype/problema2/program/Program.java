package prototype.problema2.program;

import java.util.HashMap;
import java.util.Map;

import prototype.problema2.clase.ClientBanca;
import prototype.problema2.clase.IClientBanca;

public class Program {
	
	public static void main(String[] args) {
		Map<String, Float> banci= new HashMap<String,Float>();
		banci.put("Client1", (float) 20000);
		banci.put("Client2", (float) 30000);
		banci.put("Client3", (float) 40000);
		
		IClientBanca prototype = new ClientBanca("Client",banci,20);
		ClientBanca banca= prototype.copiaza();
		banca.setNume("BRD");
		System.out.println(banca.toString());
		
		
	}

}
