package strategy.semianar10.flyweight.main;

import flyweight.exercitiul5.clase.FabricaClienti;
import strategy.semianar10.flyweight.clase.Rezervare;

public class Main {
	public static void main(String[] args) {
		FabricaClienti fabricaClienti= new FabricaClienti();
		
		Rezervare rezervare1 = new Rezervare(1, 2, 5, "20:00");
	}

}
