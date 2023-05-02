package strategy.exercitiul2.clase;

public class Cash implements ModPlata {

	@Override
	public void plata(String numeClient, Double sumaPlata) {
		System.out.println(numeClient + " a realizat plata Card a sumei de : "+ sumaPlata) ;
		
	}
	

}
