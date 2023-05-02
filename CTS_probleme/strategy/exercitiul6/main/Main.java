package strategy.exercitiul6.main;

import strategy.exercitiul6.clase.ClientPeluza;
import strategy.exercitiul6.clase.ClientStadion;
import strategy.exercitiul6.clase.ClientTribuna;
import strategy.exercitiul6.clase.ClientVIP;

public class Main {
	public static void main(String[] args) {
		ClientStadion client1 = new ClientStadion("Gigel", new ClientVIP());
		client1.modDeVerificare();
		ClientStadion clientPeluza= new ClientStadion("Dorel", new ClientPeluza());
		clientPeluza.modDeVerificare();
		
		ClientStadion clientTribuna = new ClientStadion("Ionel", new ClientTribuna());
		clientTribuna.modDeVerificare();
	}

}
