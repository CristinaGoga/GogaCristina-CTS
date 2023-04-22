package simple_factory.problema3.program;

import java.util.ArrayList;
import java.util.List;

import simple_factory.problema3.clase.Factory;
import simple_factory.problema3.clase.Atacant;
import simple_factory.problema3.clase.CategorieJucator;
import simple_factory.problema3.clase.Fundas;
import simple_factory.problema3.clase.Jucator;
import simple_factory.problema3.clase.Portar;

public class Program {
	public static void main(String[] args) {
		Factory factory= new Factory();
		Jucator atacant = new Atacant("Cristiano Ronaldo", 7);
		Jucator portar = new Portar("Gianluigi Buffon", 1);
		Jucator fundas= new Fundas("Lion Messi", 10);
		
		atacant.descriere();
		portar.descriere();	
		fundas.descriere();
		System.out.println("\n");
		
		List<Jucator> jucatori = new ArrayList<>();
		jucatori.add(fundas);
		jucatori.add(portar);
		jucatori.add(atacant);
		jucatori.add(factory.getInstance(CategorieJucator.ATACANT, "Benzema",3));
		jucatori.add(factory.getInstance(CategorieJucator.PORTAR, "Tatarusanu",5));
		jucatori.add(factory.getInstance(CategorieJucator.FUNDAS, "Antonio Sefer",17));
		
		for(Jucator jucator : jucatori) {
			jucator.descriere();
		}
		
		
		
		}

}
