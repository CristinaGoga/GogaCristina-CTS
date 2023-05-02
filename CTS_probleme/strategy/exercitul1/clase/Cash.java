package strategy.exercitul1.clase;

public class Cash implements ModPlata{

	@Override
	public void plateste(String numeClient, double sumaPlata) {
		System.out.println(numeClient  + " plateste Cash suma de :" +sumaPlata);
		
	}
	

}
