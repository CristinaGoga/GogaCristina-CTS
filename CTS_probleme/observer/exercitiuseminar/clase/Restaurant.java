package observer.exercitiuseminar.clase;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements Subject{
	private String nume;
	private List<Observer> observeri;
	
	
	public Restaurant(String nume) {
		super();
		this.nume = nume;
		observeri= new ArrayList<Observer>();
	}

	@Override
	public void adugareObserver(Observer observer) {
		observeri.add(observer);
		
	}

	@Override
	public void stergereObserver(Observer observer) {
		observeri.remove(observer);
		
	}

	@Override
	public void notificareAbonati(String mesaj) {
		for(Observer observer: observeri)
		{
			observer.transmiteMesaj(mesaj);
		}
	
	}
	public void notificareOfertPret() {
		this.notificareAbonati(nume+" : sunt oferte la parfumuri");
	}
	
	public void notificaReducere() {
		this.notificareAbonati(nume+" : sunt reduceri de pret de 20% la parfumuri");
	}
	
}
