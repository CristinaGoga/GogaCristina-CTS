package observer.exercitiul2.clase;

import java.util.ArrayList;
import java.util.List;

public class Spital implements Subject {
	private String numeSpital;
	private List<Observer> observeri;
	
public Spital(String numeSpital)
{
	this.numeSpital= numeSpital;
	observeri= new ArrayList<Observer>();
}

@Override
public void adaugaMesaj(Observer observer) {
	observeri.add(observer);
	
}

@Override
public void stergeMesaj(Observer observer) {
	observeri.remove(observer);
	
}

@Override
public void trimiteMesaj(String mesaj) {
	for(Observer observer: observeri) {
		observer.transmiteMesaj(numeSpital  + " : "+ mesaj);
	}
}


public void notificaOferta() {
	System.out.println("A fost adaugata o noua oferta");
}

public void notificaReducere() {
	System.out.println("A fost adaugata o noua reducere");
}
}
