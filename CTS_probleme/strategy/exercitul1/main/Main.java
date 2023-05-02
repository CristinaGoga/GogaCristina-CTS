package strategy.exercitul1.main;

import strategy.exercitul1.clase.Card;
import strategy.exercitul1.clase.Cash;
import strategy.exercitul1.clase.Client;

public class Main {
	public static void main(String[] args) {
		Client client = new Client("Cristina");
		
		client.setModPlata(new Card());
		client.plata(3000);
		
		client.setModPlata(new Cash());
		client.plata(100);
	}
}
