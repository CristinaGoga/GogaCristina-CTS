package strategy.exercitul5.clase;

public class ModPlataCard implements ModPalta {

	@Override
	public void plata(String nume, double sumaDePlata) {
		System.out.println("Clientul : "+ nume + " a realizat plata Card a sumei de : " + sumaDePlata);
		
	}

}
