package observer.exercitiuseminar.clase;

public class ClientRestaurant implements Observer {
	private String nume;

	public ClientRestaurant(String nume) {
		super();
		this.nume = nume;
	}

	@Override
	public void transmiteMesaj(String mesaj) {
		System.out.println(this.nume+"primeste un mesaj"+mesaj);
		
	}


	

}
