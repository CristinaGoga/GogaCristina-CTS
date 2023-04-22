package factory_method.problema4.program;

import factory_method.problema4.clase.FactoryPortar;
import factory_method.problema4.clase.Jucator;

import java.util.ArrayList;
import java.util.List;

import factory_method.problema4.clase.Factory;
import factory_method.problema4.clase.FactoryAtacant;
import factory_method.problema4.clase.FactoryFundas;

public class Program {
	public static void main(String[] args) {
		Factory fabricaPortari = new FactoryPortar();
		Factory fabricaAtacanti = new FactoryAtacant();
		Factory fabricaFundasi = new FactoryFundas();
		
		List<Jucator> jucatori = new ArrayList<>();
		
		jucatori.add(fabricaAtacanti.creazaJucator("Cristiano Ronaldo", 7));
		jucatori.add(fabricaFundasi.creazaJucator("Lion Messi", 10));
		jucatori.add(fabricaPortari.creazaJucator("Neuer", 1));
		
		for(Jucator jucator : jucatori)
		{
			jucator.descriere();
		}
	}

}
