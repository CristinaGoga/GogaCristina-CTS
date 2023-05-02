package observer.exercitiul4.clase;

import java.util.ArrayList;
import java.util.List;

public class Banca  implements Subject{
	private String numeBanca;
	private List<Observer> observari;
	
	
	
	public Banca(String numeBanca) {
		super();
		this.numeBanca = numeBanca;
		observari= new ArrayList<Observer>();
	}

	@Override
	public void adaugaMesaj(Observer observer) {
		observari.add(observer);
		
	}

	@Override
	public void transmiteMesaj(String mesaj) {
		for(Observer observer: observari)
		{
			observer.receptionareMesaj("Banca " +this.numeBanca+ " : " +mesaj);
		}
		
		
	}
	public void notificareAplicatie()
	{
		transmiteMesaj("Actualizeaza aplicatia noua a bancii!");
	}

}
