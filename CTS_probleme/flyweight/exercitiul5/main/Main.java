package flyweight.exercitiul5.main;

import flyweight.exercitiul5.clase.Client;
import flyweight.exercitiul5.clase.FabricaClienti;
import flyweight.exercitiul5.clase.Reteta;

public class Main {
	
	public static void main(String[] args) {
		FabricaClienti fabricaDeClienti = new FabricaClienti();
		
		Reteta reteta1= new Reteta(1, (float) 15.99, 3);
		Reteta reteta2= new Reteta(2, (float) 20.49, 1);
		Reteta reteta3= new Reteta(3, (float) 100.9, 2);
		Reteta reteta4= new Reteta(4, (float) 345.97, 5);
		
		
		Client client1 = new Client("Goga Cristina", 1, 20);
		fabricaDeClienti.getClient(1).descriere(reteta4);
		fabricaDeClienti.getClient(1).descriere(reteta3);
		fabricaDeClienti.getClient(1).descriere(reteta1);
		client1.descriere(reteta4);
		System.out.println(fabricaDeClienti.getNumarClienti());
		
	
		
		
	}

}
