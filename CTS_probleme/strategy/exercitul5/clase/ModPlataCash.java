package strategy.exercitul5.clase;

public class ModPlataCash implements ModPalta{

	@Override
	public void plata(String nume, double sumaDePlata) {
		System.out.println("Clientul : "+ nume + " a realizat plata Cash a sumei de : " + sumaDePlata);
		
	}

}
