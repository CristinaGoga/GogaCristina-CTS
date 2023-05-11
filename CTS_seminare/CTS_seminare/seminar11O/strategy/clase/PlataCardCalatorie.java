package seminar11O.strategy.clase;

public class PlataCardCalatorie implements ModPlata {

	@Override
	public void plateste(double pret) {
		System.out.println("Plata de " + pret +" a fost realizata cu Cardul de Calatorii!");
		
	}
}