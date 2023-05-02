package strategy.exercitiul2.clase;

public class Card  implements ModPlata{

	@Override
	public void plata(String numeClient, Double sumaPlata) {
		System.out.println(numeClient +" a realizat plata Cash a sumei de : " + sumaPlata);
		
	}
	

}
