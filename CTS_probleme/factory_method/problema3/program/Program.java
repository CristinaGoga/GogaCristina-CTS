package factory_method.problema3.program;

import java.util.ArrayList;
import java.util.List;

import factory_method.problema3.clase.Factory;
import factory_method.problema3.clase.FactoryPersoanaFizica;
import factory_method.problema3.clase.FactoryPersoanaJuridica;
import factory_method.problema3.clase.TipClient;

public class Program {
	public static void main(String[] args) {
		 Factory factoryPersoanaFizica = new FactoryPersoanaFizica();
		 Factory factoryPersoanaJuridica = new FactoryPersoanaJuridica();
		 
		 
		 List<TipClient> clienti = new ArrayList<>();
		 clienti.add(factoryPersoanaFizica.creareClient("Gigel Ionescu", 40));
		 clienti.add(factoryPersoanaJuridica.creareClient("Dorel Popa", 35));
		 clienti.add(factoryPersoanaFizica.creareClient("Maria Popovici", 26));
		 clienti.add(factoryPersoanaJuridica.creareClient("Ana Tudoran", 38));
		 for(TipClient client : clienti) {
			 client.descriere();
		 }
	}

}
