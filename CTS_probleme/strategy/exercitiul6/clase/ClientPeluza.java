package strategy.exercitiul6.clase;

public class ClientPeluza  implements TipSpectator{

	@Override
	public void verificare(String nume) {
		System.out.println(" Clientului : " + nume + " i- au fost verificate biletul, bagajul, cat si hainele purtate! ");
		
	}
	

}
