package observer.exercitiul3.clase;

import java.util.ArrayList;
import java.util.List;

public class SalaSport implements Subject {
	private String numeSalaSport;
	private List<Observer> observeri;
	public SalaSport(String numeSalaSport) {
		super();
		this.numeSalaSport = numeSalaSport;
		observeri= new ArrayList<Observer>();
	}
	
	@Override
	public void adaugaMesaj(Observer observer) {
		 observeri.add(observer);
		
	}
	@Override
	public void trimiteMesaj(String mesaj) {
		for(Observer observer: observeri) {
			observer.receptionareMesaj(numeSalaSport + " :" +mesaj); 
		}
	}
	@Override
	public void stergeMesaj(Observer observer) {
		observeri.remove(observeri);
		
	}
	
	public void notificaMeciFotbal() {
		trimiteMesaj("Sambata va avea loc un meci de fotbal!");	
	}
	public void notificaMeciHandbal() {
		trimiteMesaj("Sambata va avea loc un meci handbal!");	
	}
	
	
	
	

}
