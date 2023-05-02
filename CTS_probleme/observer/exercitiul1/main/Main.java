package observer.exercitiul1.main;

import observer.exercitiul1.clase.Agentie;
import observer.exercitiul1.clase.ClientFidel;

public class Main {
	public static void main(String[] args) {
		ClientFidel client1= new ClientFidel("Goga Cristina");
		
		Agentie agentie= new Agentie("AgeTur");
		
		agentie.adaugareObserver(client1);
		agentie.notificareOfertaNoua();
	}

}
