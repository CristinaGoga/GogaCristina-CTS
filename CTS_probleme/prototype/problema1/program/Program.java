package prototype.problema1.program;

import java.util.HashMap;
import java.util.Map;

import prototype.problema1.clase.Client;
import prototype.problema1.clase.IClient;

public class Program {
	public static void main(String[] args) {
		Map<String, Integer>rezervari = new HashMap<String,Integer>();
		rezervari.put("Client1 ", 10);
		rezervari.put("Client2 ", 5);
		rezervari.put("Client3 ", 2);
		rezervari.put("Client4 ", 7);
		rezervari.put("Client5 ", 8);
		
		IClient prototype = new Client("Client", rezervari);
		Client restaurant = prototype.copiaza();
		restaurant.setNume("Nuba");
		System.out.println(restaurant.toString());
		}

}
