package prototype.problema3.program;

import java.util.HashMap;
import java.util.Map;

import prototype.problema3.clase.Client;
import prototype.problema3.clase.IClient;

public class Program {
	public static void main(String[] args) {
		Map<String , Float> meciuri = new HashMap<String, Float>();
		meciuri.put("Rapid-Steaua", (float) 20);
		meciuri.put("Steaua-Otelu", (float) 20);
		meciuri.put("Dinamo-Steaua", (float) 20);
		
		IClient prototype = new Client("Ionel",meciuri);
		Client meciNou = prototype.copiaza();
		meciNou.setNume("Real Madrid- Juventus ");
		System.out.println(meciNou.toString());
		
	}

}
