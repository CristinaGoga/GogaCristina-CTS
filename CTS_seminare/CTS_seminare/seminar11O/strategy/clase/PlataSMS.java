package seminar11O.strategy.clase;

public class PlataSMS implements ModPlata {

	@Override
	public void plateste(double pret) {
		System.out.println("Plata de " + pret +" a fost realizata prin SMS!");
		
	}
}
