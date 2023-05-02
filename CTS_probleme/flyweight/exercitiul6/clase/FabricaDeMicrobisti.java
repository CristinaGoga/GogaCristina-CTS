package flyweight.exercitiul6.clase;

import java.util.HashMap;
import java.util.Map;

public class FabricaDeMicrobisti {
	private HashMap<String, IMicrobist> listaMicrobisti;
	
	public FabricaDeMicrobisti() {
		listaMicrobisti = new HashMap<String,IMicrobist>();
	}
	
	
	public int getNumarMicrobisti() {
		return listaMicrobisti.size();
	}
	
	public IMicrobist getMicrobist(String nume)
	{
		IMicrobist microbist = listaMicrobisti.get(nume);
		
		if(microbist==null)
		{
			microbist = new Microbist("Nume", 1,1);
			listaMicrobisti.put(nume, microbist);
			
		}
		return microbist;
	}


	@Override
	public String toString() {
		return "FabricaDeMicrobisti [listaMicrobisti=" + listaMicrobisti + "]";
	}
	

}
