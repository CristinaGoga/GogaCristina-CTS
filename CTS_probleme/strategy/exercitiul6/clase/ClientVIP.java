package strategy.exercitiul6.clase;

public class ClientVIP implements TipSpectator {

	@Override
	public void verificare(String nume) {
		System.out.println(" Clientului : " + nume + " i- a fost verificat doar biletul! ");
		
	}
	

}
