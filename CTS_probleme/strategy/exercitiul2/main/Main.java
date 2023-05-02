package strategy.exercitiul2.main;

import strategy.exercitiul2.clase.Cash;
import strategy.exercitiul2.clase.Client;

public class Main {
	public static void main(String[] args) {
	Client client = new Client("Cristina Goga");

	client.setModPlata(new Cash());
	client.plateste((double) 3000);
	
	
	}

}
