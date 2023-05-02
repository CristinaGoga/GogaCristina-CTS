package observer.exercitiul2.clase;

public class Pacient implements Observer{
	private String numePacient;

	
	
	public Pacient(String numePacient) {
		super();
		this.numePacient = numePacient;
	}



	@Override
	public void transmiteMesaj(String mesaj) {
		System.out.println(numePacient +" ai primit mesajul : " + mesaj);
		
	}
	

}
