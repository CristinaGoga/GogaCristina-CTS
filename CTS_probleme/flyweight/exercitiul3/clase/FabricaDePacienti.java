package flyweight.exercitiul3.clase;

import java.util.HashMap;

public class FabricaDePacienti {
	private HashMap<String,Ipacient > listaPacienti;
	
	
	public FabricaDePacienti() {
		listaPacienti= new HashMap<String, Ipacient>();
	}
	
	public Ipacient getPacient(String numePacient) {
		if(listaPacienti.containsKey(numePacient)) {
			return listaPacienti.get(numePacient);
		} else {
			Ipacient pacient = new Pacient(numePacient, 1, null);
			listaPacienti.put(numePacient,(Pacient) pacient);
			return pacient;
		}
	}

}
