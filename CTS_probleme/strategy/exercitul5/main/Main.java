package strategy.exercitul5.main;

import strategy.exercitul5.clase.Client;
import strategy.exercitul5.clase.ModPalta;
import strategy.exercitul5.clase.ModPlataCard;
import strategy.exercitul5.clase.ModPlataCash;

public class Main {
	public static void main(String[] args) {
		
		
		Client client1 = new Client("Gigel", new ModPlataCard());
		client1.realizeazaPlata(200);
		Client client2 = new Client("Dorel", new ModPlataCash());
		client2.realizeazaPlata(700);
		
	
		
	}

}
