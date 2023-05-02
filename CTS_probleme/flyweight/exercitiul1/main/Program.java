package flyweight.exercitiul1.main;

import flyweight.exercitiul1.clase.FabricaDePachete;
import flyweight.exercitiul1.clase.Optionale;
import flyweight.exercitiul1.clase.PachetTuristic;

public class Program {
	public static void main(String[] args) {
		//Pas 1 construim fabrica
		
		FabricaDePachete fabricaPachete = new FabricaDePachete();
		
		//Pas 2 construim optionale
		
		Optionale optional1= new Optionale(true, 3);
		Optionale optional2= new Optionale(false, 5);
		Optionale optional3= new Optionale(true, 1);
		Optionale optional4= new Optionale(false, 4);
		
		//Pas 3 construi pachet turistic
		
		PachetTuristic pachet=(PachetTuristic) fabricaPachete.getPachetTuristic(1);
		fabricaPachete.getPachetTuristic(2).descrierePachet(optional2);
		optional2.setNumarExcursii(40);
		fabricaPachete.getPachetTuristic(2).descrierePachet(optional2);
		fabricaPachete.getPachetTuristic(3).descrierePachet(optional1);
		fabricaPachete.getPachetTuristic(3).descrierePachet(optional3);
		fabricaPachete.getPachetTuristic(3).descrierePachet(optional4);
		
		System.out.println(fabricaPachete.getNumarPachete());
		
		
	}
}
