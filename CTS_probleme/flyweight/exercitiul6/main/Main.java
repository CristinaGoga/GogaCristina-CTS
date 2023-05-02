package flyweight.exercitiul6.main;

import java.util.HashMap;
import java.util.Map;

import flyweight.exercitiul6.clase.FabricaDeMicrobisti;
import flyweight.exercitiul6.clase.IMicrobist;
import flyweight.exercitiul6.clase.Microbist;
import flyweight.exercitiul6.clase.PozitieTribuna;

public class Main {
	public static void main(String[] args) {
		HashMap<String, IMicrobist> microbisti= new HashMap<String, IMicrobist>();
		FabricaDeMicrobisti fabrica = new FabricaDeMicrobisti();
		Microbist microbist = new Microbist("Gigel", (float) 1.70, 90);
		Microbist microbist2 = new Microbist("Ionel", (float) 1.67, 59);
		
		PozitieTribuna pozitieTribuna= new PozitieTribuna("rosu");
		PozitieTribuna pozitieTribuna2= new PozitieTribuna("verde");
		fabrica.getMicrobist("Gigel").descriere(pozitieTribuna2);
		fabrica.getMicrobist("Ionel").descriere(pozitieTribuna);
		pozitieTribuna.setCuloareaTricoului("galben");
		
		System.out.println(fabrica.getNumarMicrobisti());
		
		
		
		
		
	}

}
