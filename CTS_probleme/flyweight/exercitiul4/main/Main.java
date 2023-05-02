package flyweight.exercitiul4.main;

import flyweight.exercitiul4.clase.Rezervare;
import flyweight.exercitiul4.clase.Client;
import flyweight.exercitiul4.clase.FabricaDeClienti;

public class Main {
	public static void main(String[] args) {
		FabricaDeClienti fabricaClienti= new FabricaDeClienti();
		
		Rezervare rezervar1 = new Rezervare(1, 5, 20);
		Rezervare rezervar2= new Rezervare(2, 5, 5);
		
		Client client= new Client("Cristina", 0742256307, "goga_cristina08@yahoo.com");
		
		client.printeazaClient(rezervar2);
		client.printeazaClient(rezervar1);
		fabricaClienti.getClient("Goga Cristina").printeazaClient(rezervar2);;
		System.out.println(fabricaClienti.toString());
		
	}

}
