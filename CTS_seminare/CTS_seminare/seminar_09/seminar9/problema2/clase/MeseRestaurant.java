package seminar4.problema2.clase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MeseRestaurant {
	private Map<Integer, Masa> listaMese;

	public MeseRestaurant() {
		listaMese= new HashMap<Integer, Masa>();
		
	}
	
	public void adaugaMasa(Masa masa){
		listaMese.put(masa.getNumarMasa(), masa);
	}
	
	
	
	public boolean esteLibera(int nrMasa) {
		return listaMese.get(nrMasa).isMasaLibera();
	}
	
	
	
public Boolean suntServeteleNoi(int nrMasa) {
	return listaMese.get(nrMasa).isAreServetele();
}

}
