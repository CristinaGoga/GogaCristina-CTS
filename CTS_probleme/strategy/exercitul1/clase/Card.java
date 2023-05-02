package strategy.exercitul1.clase;

public class Card implements ModPlata {

	@Override
	public void plateste(String numeClient, double sumaPlata) {
		System.out.println(numeClient + " achiata prin card suma de :" + sumaPlata);
		
	}
	

}
