package strategy.exercitiul6.clase;

public class ClientTribuna implements TipSpectator {
	@Override
	public void verificare(String nume) {
		System.out.println(" Clientului : " + nume + " i- au fost verificate atat biletul cat si bagajul! ");
	}
}
