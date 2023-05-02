package observer.exercitiul1.clase;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Agentie implements Subject {

	private String numeAgentie;
	private List<Observer> observeri;
	
	public Agentie(String numeAgentie) {
		this.numeAgentie= numeAgentie;
		observeri= new ArrayList<Observer>() ;
	}
	
	
	@Override
	public void adaugareObserver(Observer observer) {
		observeri.add(observer);
		
	}

	@Override
	public void stergereObserver(Observer observer) {
		observeri.remove(observer);
		
	}

	@Override
	public void trimiteNotificare(String mesaj) {
		for(Observer observer : observeri)
		{
			observer.receptionareMesaj(numeAgentie +":" +mesaj);
		}	
	}
     public void notificareOfertaNoua() {
		trimiteNotificare("A fost adaugata o noua oferta, consultati noul nostru catalog!");
	}
	
	public void notificaReducere() {
		trimiteNotificare("In periada 1 martie si 8 martie beneficiati de 30% reducere!");
	}

}
